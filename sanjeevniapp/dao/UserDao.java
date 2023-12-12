package sanjeevniapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import sanjeevni.dbutil.DBConnection;
import sanjeevniapp.pojo.UserPojo;
import sanjeevniapp.pojo.UserPojo2;

public class UserDao {
     public static String validateUser(UserPojo user) throws SQLException{                   // login me banaya hua pojo ka object yahan use ho raha hai as an argument 
         Connection conn=DBConnection.getConnect();                                                              // connection kiya DB se
         PreparedStatement ps=conn.prepareStatement("Select user_name from users where login_id=? and password=? and user_type=?");           
         //dynamic query hai isliye prepared statement use kiya h, user se ID password leke DB me dalwa diya via pojo object 
         ps.setString(1, user.getLogin_id());               //pojo object.getter // DB se data laake daal dega 
         ps.setString(2,user.getPassword());
         ps.setString(3, user.getUser_type());
         ResultSet rs=ps.executeQuery();              //result set is like a pointer jo 0th row pe set rehta hai and keeps moving collecting all data
         String name=null;
         if(rs.next()){
             name=rs.getString("user_name");               // ID,password,type  leke matching username return kardiya in "name"
         }
         return name;
   }
     
     public static void updateName (String currName, String newName) throws SQLException 
    {
        Connection conn=DBConnection.getConnect();
     PreparedStatement ps=conn.prepareStatement("Update users set user_name=? where user_name=?");
     ps.setString(1, newName);            //search with old name and in that place update the new name 
     ps.setString(2, currName);
     ps.executeUpdate();
}
     
     public static boolean removeUser(UserPojo2  user)throws SQLException{
    Connection conn=DBConnection.getConnect();
    PreparedStatement ps=conn.prepareStatement("Delete from users where login_id=?");
     ps.setString(1,user.getLogin_id() );
               //query to remove details of employee in DB
 return ps.executeUpdate()==1;
}
     
      public static boolean addUser(UserPojo2 doc) throws SQLException{
       Connection conn= DBConnection.getConnect();
       PreparedStatement ps = conn.prepareStatement("Insert into users values(?,?,?,?)"); 
       ps.setString(1, doc.getLogin_id() );    //inserts all data in user table in DB 
       ps.setString(2, doc.getUser_name());
       ps.setString(3, doc.getPassword());
       ps.setString(4, doc.getUser_type().toUpperCase());
       return ps.executeUpdate()==1; 
   }
    
       public static void deleteUserByName(String name)throws SQLException{
     Connection conn=DBConnection.getConnect();                // this method can delete any type of user from the table 
     PreparedStatement ps=conn.prepareStatement("delete from users where user_name=?");
     ps.setString(1, name);
     ps.executeUpdate();
}

    static boolean updateUser(String newName, String loginId, String oldName)throws SQLException {
         Connection conn = DBConnection.getConnect();
        PreparedStatement ps = conn.prepareStatement("update users set login_id=?, user_name=? where user_name=?");
        ps.setString(1, loginId);
        ps.setString(2, newName);
        ps.setString(3, oldName);
        return ps.executeUpdate()==1;
}
}
