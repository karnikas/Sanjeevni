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
import sanjeevniapp.pojo.ReceptionistPojo;

public class ReceptionistDao {
      public static void updateName(String currName,String newName)throws SQLException{
     Connection conn=DBConnection.getConnect();
     PreparedStatement ps=conn.prepareStatement("Update receptionists set receptionist_name=? where receptionist_name=?");
     ps.setString(1, newName);                     //updation from old name to new name in receptionist table
     ps.setString(2, currName); 
     ps.executeUpdate();
}
      
  public static boolean addRecep(ReceptionistPojo recep) throws SQLException
  {
    Connection conn= DBConnection.getConnect(); 
    PreparedStatement ps = conn.prepareStatement("Insert into receptionists values(?,?,?)"); 
    ps.setString(1, recep.getReceptionist_id());
    ps.setString(2, recep.getReceptionist_name());
    ps.setString(3, recep.getGender());
    if (ps.executeUpdate() == 1) {
            return true;
        } else {
            return false;
        }
  }
  
  public static List<ReceptionistPojo > getAllRecepDetails() throws SQLException {
        Connection conn = DBConnection.getConnect();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select * from receptionists order by receptionist_id");
        List<ReceptionistPojo> recList = new ArrayList<>(); 
        while (rs.next()) {
            ReceptionistPojo rec = new ReceptionistPojo();                 //used in view all receptionists frame 
            rec.setReceptionist_id(rs.getString(1));
            rec.setReceptionist_name(rs.getString(2));
            rec.setGender(rs.getString(3)); 
            recList.add(rec);
        }
        return  recList;                     //returns to table 
    }
  
  public static String getNewRecepID() throws SQLException {
        Connection conn = DBConnection.getConnect();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("Select max(receptionist_id) from receptionists");
        rs.next();
        int recid = 101;
        String id = rs.getString(1);          //takes the ID from the receptionist table which is highest 
        if (id != null) {
            String num = id.substring(3);
            recid = Integer.parseInt(num) + 1;
        }
        return "REC" + recid;
  }
  
  public static boolean removeRecep(ReceptionistPojo rec) throws SQLException {
        Connection conn = DBConnection.getConnect();
        PreparedStatement ps = conn.prepareStatement("Delete from receptionists where receptionist_id=?");
        ps.setString(1, rec.getReceptionist_id());
        //query to remove details of employee in DB
        return ps.executeUpdate() == 1;
    }
  
  public static boolean deleteRecepById(String recId)throws SQLException{
     Connection conn=DBConnection.getConnect();
     PreparedStatement ps=conn.prepareStatement("Select receptionist_name from receptionists where receptionist_id=?");
     ps.setString(1, recId);                                                     //code for deleting from DB 
     ResultSet rs=ps.executeQuery();
     rs.next();
     String recName=rs.getString(1);
     UserDao.deleteUserByName(recName);                    //delete as a user 1st bcoz we need name to delete from user and if we delete from receptionist 1st then we will not have name
     ps=conn.prepareStatement("Delete from dreceptionists where receptionist_id=?");                       //then delete as a recep using ID
     ps.setString(1, recId);
     return ps.executeUpdate()==1;
}
  
    public static List<String> getAllReceptionistId()throws SQLException
{                                                          
    Connection conn=DBConnection.getConnect();                         //used in remove recep
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery("Select receptionist_id from receptionists");
    List<String>recepList=new ArrayList<>();                              // take the list of IDs and return in a list 
    while(rs.next())
    {
        recepList.add(rs.getString(1));                  // display that list in combobox
    }
    return recepList;
}
    
    public static boolean updateRec(ReceptionistPojo rec, String loginId) throws SQLException{
        System.out.println(rec.getReceptionist_id());
        String currentName =  getRecName(rec.getReceptionist_id());
        boolean userAns = UserDao.updateUser(currentName, loginId, rec.getReceptionist_name());
        Connection conn = DBConnection.getConnect();
        PreparedStatement ps = conn.prepareStatement("update receptionists set receptionist_name=?, gender=? where receptionist_id=?");
        ps.setString(1, rec.getReceptionist_name());
        ps.setString(2, rec.getGender());
        ps.setString(3, rec.getReceptionist_id());
        boolean recAns = false;
        if(ps.executeUpdate()==1){
            recAns = true;
        }
        return recAns && userAns;
    }
    
     public static String getRecName(String recId) throws SQLException {
        Connection conn = DBConnection.getConnect();
        PreparedStatement ps = conn.prepareStatement("select receptionist_name from receptionists where receptionist_id=?");
        ps.setString(1, recId);
        ResultSet rs = ps.executeQuery();
        rs.next();
        String rec_name =rs.getString(1);
        return rec_name;
    }
}
