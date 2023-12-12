package sanjeevniapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import sanjeevni.dbutil.DBConnection;
import sanjeevniapp.pojo.PatientsPojo;

public class PatientDao {
     public static String getNewPatID() throws SQLException {
        Connection conn = DBConnection.getConnect();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select max(patient_id) from patients");
        rs.next();
        int patid = 101;
        String id = rs.getString(1);          //takes the ID from the doctors table which is highest 
        if (id != null) {
            String num = id.substring(3);
            patid = Integer.parseInt(num) + 1;
        }
        return "PAT" + patid;
    }

    public static boolean addPatient(PatientsPojo pat) throws SQLException {
   Connection conn=DBConnection.getConnect();
     PreparedStatement ps=conn.prepareStatement("Insert into patients values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
     ps.setString(1,pat.getPatient_id());
     ps.setString(2, pat.getFirst_name());
     ps.setString(3,pat.getLast_name());
     ps.setInt(4, pat.getAge());
     ps.setString(5, pat.getGender());
     ps.setString(6, pat.getM_status());
     ps.setString(7, pat.getAddress());
     ps.setString(8,pat.getCity());
     ps.setString(9, pat.getMob_no());
     ps.setDate(10, pat.getDate());
     ps.setInt(11, pat.getOtp());
     ps.setString(12,pat.getOpd());
     ps.setString(13, pat.getDoc_id());
     ps.setString(14, pat.getStatus());
     return ps.executeUpdate()==1;
    }
    
    public static List<PatientsPojo> getAllPatientDetails() throws SQLException
    {
        Connection conn = DBConnection.getConnect(); 
        Statement st = conn.createStatement(); 
        ResultSet rs = st.executeQuery("Select * from patients order by patient_id "); 
         List<PatientsPojo> patList = new ArrayList<>();
        while(rs.next())
        {
        PatientsPojo pat = new PatientsPojo(); 
        pat.setPatient_id(rs.getString("patient_id"));
        pat.setFirst_name(rs.getString("first_name"));
        pat.setLast_name(rs.getString("last_name"));
        pat.setAge(rs.getInt("age"));
        pat.setOpd(rs.getString("opd"));
        pat.setGender(rs.getString("gender"));
        pat.setM_status(rs.getString("m_status"));
        pat.setDate(rs.getDate("p_date"));
        pat.setAddress(rs.getString("address"));
        pat.setMob_no(rs.getString("mobile_no"));
        pat.setDoc_id(rs.getString("doctor_id"));
        patList.add(pat); 
    }
        return patList; 
}
    
       public static List<String> getAllPatientId()throws SQLException
{                                                          
    Connection conn=DBConnection.getConnect();                         //used in remove /update patient
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select patient_id from patients");
    List<String>patientList=new ArrayList<>();                              // take the list of IDs and return in a list 
    while(rs.next())
    {
        patientList.add(rs.getString(1));                  // display that list in combobox
    }
    return patientList;
}       
        public static boolean removePatient(PatientsPojo pat) throws SQLException {
        Connection conn = DBConnection.getConnect();
        PreparedStatement ps = conn.prepareStatement("Delete from patients where patient_id=?");
        ps.setString(1, pat.getPatient_id());
        //query to remove details of patient in DB
        return ps.executeUpdate() == 1;
    }
        
         public static PatientsPojo getAllPatientDetailsByPatientId(String patId) throws SQLException{
          Connection conn = DBConnection.getConnect();
          PreparedStatement ps = conn.prepareStatement("select * from patients where patient_id=?");
          ps.setString(1, patId);
          ResultSet rs = ps.executeQuery();
          PatientsPojo pat = new PatientsPojo();
          pat.setPatient_id(patId);
          while(rs.next()){
              pat.setFirst_name(rs.getString(2));
              pat.setLast_name(rs.getString(3));
              pat.setAge(rs.getInt(4));
              pat.setGender(rs.getString(5));
              pat.setM_status(rs.getString(6));
              pat.setAddress(rs.getString(7));
              pat.setCity(rs.getString(8));
              pat.setMob_no(rs.getString(9));
              pat.setDate(rs.getDate(10));
              pat.setOtp(rs.getInt(11));
              pat.setOpd(rs.getString(12));
              pat.setDoc_id(rs.getString(13));
       //       pat.getStatus(rs.getString(14));
          }
          return pat;
      }
         
}
