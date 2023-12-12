package sanjeevni.utility;
import java.util.Base64;
import javax.swing.JPasswordField;

public class PasswordEncryption {
    
    
           public static String getEncryptedPassword(String password) 
    {    
      
        Base64.Encoder enc = Base64.getEncoder();             //base64 is an algorithm class which is inherited by Encoder class
        //  enc is the object of Encoder class,     getEncoder() is a method of Encoder but we can call it from parent Base64
        // encrypted wala password enc me aajata hai, then bytes[] me stored.
        return enc.encodeToString(password.getBytes());         
           //System.out.println(pwd);
        //encodetostring() method, string input ko bytes[] me store karleta hai for password security
    }  
        // we do not make object of encoder and only reference bcoz we are taking the pre made object by the class 
           // since encoder is static thus is called by parent name and not normally and directly 
//public static void main(String[] args) {
//        String pas = getEncryptedPassword("amar");
//        System.out.println(pas);
//    }
//  
    }

