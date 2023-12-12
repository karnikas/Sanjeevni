package sanjeevni.utility;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.GetRequest;
import java.util.Scanner;


public class SendOTP {
    public static void main(String[] args) {
        try{
            Unirest.setTimeouts(0, 0);
            Scanner kb=new Scanner(System.in);
            System.out.println("Enter mobile number:");
            String mobNo=kb.next();
            int otp=1000+((int)(Math.random()*999));
            String url = "https://2factor.in/API/V1/832ec4a0-c0f3-11ed-81b6-0200cd936042/SMS/"+mobNo+"/"+otp+"/OTP1";
            System.out.println("OTP is:"+otp);
            GetRequest gr=Unirest.get(url);
            HttpResponse<String>response=gr.asString();
            String result=response.getBody();
            System.out.println(result);
        }
        catch(Exception ex)
        {
            System.out.println("Error in sending otp");
            ex.printStackTrace();
        }
    }
    
}
