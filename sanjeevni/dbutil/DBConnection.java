//29 JAN 
package sanjeevni.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DBConnection {
    private static Connection conn ;        //Connection is a class, uska reference hai conn 
    static{
        try{
            Class.forName("oracle.jdbc.OracleDriver");                     //register and load the driver of jdbc
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "sanjeevni", "karnika");           // drivermanager is the class, jisme get connection method hota hai 
            // driver ki class details nikal raha hai fir vo details get connction me jaa rahi hai to build the connection 
        }
        catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Cannot load driver:"+ex.getMessage(),"Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB Error:"+ex.getMessage(),"Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    
    public static Connection getConnect(){
        return conn ;                                                      //implement kar rahe h, apan ne banaya hai 
    }
    
    public static void closeConnect(){
        try{
            conn.close();
            JOptionPane.showMessageDialog(null, "Disconnected successfully!","Success!",JOptionPane.INFORMATION_MESSAGE);
            
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "DB Error:"+ex.getMessage(),"Error!",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
}
