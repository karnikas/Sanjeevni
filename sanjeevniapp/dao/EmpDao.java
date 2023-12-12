package sanjeevniapp.dao;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import sanjeevni.dbutil.DBConnection;
import sanjeevniapp.pojo.EmpPojo;

public class EmpDao {

    public static String getNextEmpId() throws SQLException {
        Connection conn = DBConnection.getConnect();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select max(emp_id) from employees");
        rs.next();
        String str = rs.getString(1);
        int empId = 101;
        if (str != null) {                //used in addemployee frame for auto generating the ID for next employee
            String id = str.substring(1);
            empId = Integer.parseInt(id);
            empId++;
        }
        String newId = "E" + empId;
        return newId;            //this value goes in generateNewId method of addemployee frame 
    }

    public static boolean addEmp(EmpPojo emp) throws SQLException {
        Connection conn = DBConnection.getConnect();
        PreparedStatement ps = conn.prepareStatement("Insert into employees values(?,?,?,?)");
        ps.setString(1, emp.getEmp_id());
        ps.setString(2, emp.getEmp_name());
        ps.setString(3, emp.getEmp_department());
        ps.setDouble(4, emp.getEmp_salary());               //query to add details of new employee in DB
        return ps.executeUpdate() == 1;
    }

    public static List<String> getAllemployeeId() throws SQLException {
        Connection conn = DBConnection.getConnect();
        Statement st = conn.createStatement();              //no where clause so statement used
        ResultSet rs = st.executeQuery("Select emp_id from employees");
        List<String> empidList = new ArrayList<>();
        while (rs.next()) {                                       // used in updatemployee frame
            empidList.add(rs.getString(1));      //add all emp_id in the list one by one 
        }
        return empidList;                                 //returns to combo box
    }

    public static EmpPojo getEmployeeDetails(String empId) throws SQLException {
        Connection conn = DBConnection.getConnect();
        PreparedStatement ps = conn.prepareStatement("Select * from employees where emp_id=?");
        ps.setString(1, empId);                          //used in update employee frame to display the details of selected empID 
        ResultSet rs = ps.executeQuery();
        rs.next();
        EmpPojo emp = new EmpPojo();
        emp.setEmp_id(rs.getString(1));
        emp.setEmp_name(rs.getString(2));
        emp.setEmp_department(rs.getString(3));
        emp.setEmp_salary(rs.getDouble(4));
        return emp;

    }

    public static boolean updateEmployee(EmpPojo emp) throws SQLException {
        updateName(emp);                       //update in doctor/receptionist table before updating in employees
        Connection conn = DBConnection.getConnect();
        PreparedStatement ps = conn.prepareStatement("Update employees set emp_name=?,emp_salary=? where emp_id=?");
        ps.setString(1, emp.getEmp_name());                  //finally update the name in employees table 
        ps.setDouble(2, emp.getEmp_salary());               // finally update the salary in employee table DB bcoz only this table holds salary field 
        ps.setString(3, emp.getEmp_id());
        return ps.executeUpdate() == 1;                 // success then return 1
    }

    public static void updateName(EmpPojo emp) throws SQLException {
        Connection conn = DBConnection.getConnect();
        PreparedStatement ps = conn.prepareStatement("Select emp_name from employees where emp_id=?");
        ps.setString(1, emp.getEmp_id());      //using ID , name is searched & brought using pojo
        ResultSet rs = ps.executeQuery();
        rs.next();
        String currName = rs.getString(1);                           //currName stores the old name which was before update
        String newName = emp.getEmp_name();             //newNamw stores the new name entered afterwards 
        UserDao.updateName(currName, newName);                    //this method swaps the old name with new name        
        if (emp.getEmp_department().equalsIgnoreCase("Receptionist")) {
            ReceptionistDao.updateName(currName, newName);                  //if the user is receptonist, then update that table 
        } else if (emp.getEmp_department().equalsIgnoreCase("Doctor")) {
            DoctorsDao.updateName(currName, newName);
        }

    }

    public static List<EmpPojo> getAllEmployeeDetails() throws SQLException {
        Connection conn = DBConnection.getConnect();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select * from employees order by emp_id");
        List<EmpPojo> empList = new ArrayList<>();
        while (rs.next()) {
            EmpPojo emp = new EmpPojo();                 //used in view all employees frame 
            emp.setEmp_id(rs.getString(1));
            emp.setEmp_name(rs.getString(2));
            emp.setEmp_department(rs.getString(3));
            emp.setEmp_salary(rs.getDouble(4));
            empList.add(emp);
        }
        return empList;                     //returns to table 

    }

    public static boolean removeEmp(EmpPojo emp) throws SQLException {
        Connection conn = DBConnection.getConnect();
        PreparedStatement ps = conn.prepareStatement("Delete from employees where emp_id=?");
        ps.setString(1, emp.getEmp_id());
        //query to remove details of employee in DB
        return ps.executeUpdate() == 1;
    }

    public static Map<String, String> getUnregDocs() throws SQLException {  //used in add doctors frame , map used because we need ID,name pair
        Connection conn = DBConnection.getConnect();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select emp_id, emp_name from employees where emp_department='Doctor' and emp_name not in (select user_name from users where user_type='Doctor') order by emp_id");
        Map<String,String> doclist= new HashMap<>();
        while(rs.next())
        {
            String id = rs.getString(1);                      
            String name= rs.getString(2);
            doclist.put(id, name); 
        }
        return doclist;   //return this key value pair in the frame 
    }
    
    public static Map<String,String> getUnregRecep() throws SQLException
    {
        Connection conn = DBConnection.getConnect();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select emp_id, emp_name from employees where emp_department='Receptionist' and emp_name not in (select user_name from users where user_type='RECEPTIONIST') order by emp_id");
        Map <String, String> reclist= new HashMap<>();
        while(rs.next())
        {
            String id = rs.getString(1);
            String name = rs.getString(2);
            reclist.put(id,name);
        }
        return reclist; 
    }
}
