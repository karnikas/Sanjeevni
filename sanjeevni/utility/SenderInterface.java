
package sanjeevni.utility;

import com.mashape.unirest.http.exceptions.UnirestException;


public interface SenderInterface {
     public boolean send(String mobNo, String data) throws Exception;
}
