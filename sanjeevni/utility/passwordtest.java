package sanjeevni.utility;

import java.util.Base64;

public class passwordtest {
    public static void main(String[] args) {
        String a ="singh";
        getEncryptedPassword(a);
    }
     public static String getEncryptedPassword(String password) 
    {    
      
        Base64.Encoder enc = Base64.getEncoder();             //base64 is an algorithm class which is inherited by Encoder class
        //  enc is the object of Encoder class,     getEncoder() is a method of Encoder but we can call it from parent Base64
        // encrypted wala password enc me aajata hai, then bytes[] me stored.
        String b = enc.encodeToString(password.getBytes()); 
         System.out.println(b); 
        return b; 
       
        //return enc.encodeToString(password.getBytes());         
           //System.out.println(pwd);
        //encodetostring() method, string input ko bytes[] me store karleta hai for password security
    
}
}