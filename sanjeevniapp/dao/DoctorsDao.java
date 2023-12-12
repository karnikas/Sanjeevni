package sanjeevniapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import sanjeevni.dbutil.DBConnection;
import sanjeevniapp.pojo.DoctorsPojo;
import sanjeevniapp.pojo.EmpPojo;

public class DoctorsDao {

    public static void updateName(String currName, String newName) throws SQLException {
        Connection conn = DBConnection.getConnect();
        PreparedStatement ps = conn.prepareStatement("Update doctors set doctor_name=? where doctor_name=?");
        ps.setString(1, newName);         //updation in doctors table if the user is doctor
        ps.setString(2, currName);
        ps.executeUpdate();
    }

    public static boolean addDoc(DoctorsPojo doc) throws SQLException {
        Connection conn = DBConnection.getConnect();
        PreparedStatement ps = conn.prepareStatement("Insert into doctors values (?,?,?,?,?,?,?)");
        ps.setString(1, doc.getDoctor_id());    //inserts all data in dr table in DB 
        ps.setString(2, doc.getDoctor_name());
        ps.setString(3, doc.getEmail_id());
        ps.setString(4, doc.getContact_no());
        ps.setString(5, doc.getQualification());
        ps.setString(6, doc.getGender());
        ps.setString(7, doc.getSpecialist());
        if (ps.executeUpdate() == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static String getNewDocID() throws SQLException {
        Connection conn = DBConnection.getConnect();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select max(doctor_id) from doctors");
        rs.next();
        int docid = 101;
        String id = rs.getString(1);          //takes the ID from the doctors table which is highest 
        if (id != null) {
            String num = id.substring(3);
            docid = Integer.parseInt(num) + 1;
        }
        return "DOC" + docid;
    }

    public static boolean removeDoc(DoctorsPojo doc) throws SQLException {
        Connection conn = DBConnection.getConnect();
        PreparedStatement ps = conn.prepareStatement("Delete from doctors where doctor_id=?");
        ps.setString(1, doc.getDoctor_id());
        //query to remove details of employee in DB
        return ps.executeUpdate() == 1;
    }

    public static List<DoctorsPojo> getAllDoctorsDetails() throws SQLException {
        Connection conn = DBConnection.getConnect();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select * from doctors order by doctor_id");
        List<DoctorsPojo> docList = new ArrayList<>();
        while (rs.next()) {
            DoctorsPojo doc = new DoctorsPojo();                 //used in view all employees frame 
            doc.setDoctor_id(rs.getString(1));
            doc.setDoctor_name(rs.getString(2));
            doc.setEmail_id(rs.getString(3));
            doc.setQualification(rs.getString(4));
            doc.setGender(rs.getString(5));
            doc.setSpecialist(rs.getString(6));
            docList.add(doc); 
        }
        return docList;                     //returns to table 
    }
    
    public static List<String> getAllDoctorId()throws SQLException
{                                                          
    Connection conn=DBConnection.getConnect();                         //used in remove doc
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select doctor_id from doctors");
    List<String>doctorList=new ArrayList<>();                              // take the list of IDs and return in a list 
    while(rs.next())
    {
        doctorList.add(rs.getString(1));                  // display that list in combobox
    }
    return doctorList;
}
public static boolean deleteDoctorById(String docId)throws SQLException{
     Connection conn=DBConnection.getConnect();
     PreparedStatement ps=conn.prepareStatement("Select doctor_name from doctors where doctor_id=?");
     ps.setString(1, docId);                                                     //code for deleting from DB 
     ResultSet rs=ps.executeQuery();
     rs.next();
     String docName=rs.getString(1);
     UserDao.deleteUserByName(docName);                    //delete as a user 1st bcoz we need name to delete from user and if we delete from doc 1st then we will not have name
     ps=conn.prepareStatement("Delete from doctors where doctor_id=?");                       //then delete as a doc using ID
     ps.setString(1, docId);
     return ps.executeUpdate()==1;
}

public static String getDocnamebyId(String docId) throws SQLException{
        Connection conn = DBConnection.getConnect();
        PreparedStatement ps = conn.prepareStatement("select doctor_name from doctors where doctor_id=?");
        ps.setString(1, docId);
        ResultSet rs = ps.executeQuery();
        rs.next();
        String doc_name =rs.getString(1);
        return doc_name;
}
}
