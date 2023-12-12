package sanjeevni.utility;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;

public class OTPSender implements SenderInterface {
    
    @Override
    public boolean send(String number, String data)throws UnirestException {
        
            Unirest.setTimeouts(0, 0);
            String mobNo=number;
            int otp=Integer.parseInt(data);
            String url = "https://2factor.in/API/V1/832ec4a0-c0f3-11ed-81b6-0200cd936042/SMS/"+mobNo+"/"+otp+"/OTP1";
            System.out.println("OTP is:"+otp);
            GetRequest gr=Unirest.get(url);
            HttpResponse<String>response=gr.asString();
            String result=response.getBody();
            return result.contains("Success");
        }
    }
    
    

