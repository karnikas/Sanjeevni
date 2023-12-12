package sanjeevniapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sanjeevni.dbutil.DBConnection;
import sanjeevniapp.pojo.AppointmentPojo;

public class AppointmentDao {

    public static boolean addAppointment(AppointmentPojo appt) throws SQLException {
     Connection conn=DBConnection.getConnect();
     PreparedStatement ps=conn.prepareStatement("Insert into appointments values(?,?,?,?,?,?,?)");
     ps.setString(1,appt.getPat_id());            // to add appointment in the table whe n the otp is verified
     ps.setString(2, appt.getPat_name());
     ps.setString(6,appt.getDoc_name());
     ps.setString(4, appt.getOpd());
     ps.setString(3, appt.getStatus());
     ps.setString(7,appt.getMob_no());
     ps.setString(5,appt.getDate_time());
     
     return ps.executeUpdate()==1;
}

    public static boolean updatestatus(AppointmentPojo appt) throws SQLException{
     Connection conn=DBConnection.getConnect();
     PreparedStatement ps=conn.prepareStatement("Update appointments set status=?,date_time=? where patient_id=?" );
     ps.setString(1, appt.getStatus());
     ps.setString(2, appt.getDate_time());
     ps.setString(3,appt.getPat_id());
     return ps.executeUpdate()==1;
    }
    
     public static List<AppointmentPojo> getAllAppointmentsByDoctorName(String doctorname)throws SQLException{
    System.out.println(doctorname +"dao");
    Connection conn=DBConnection.getConnect();
    PreparedStatement ps=conn.prepareStatement("Select * from appointments where doctor_name =? and status='REQUEST' order by patient_id");
    ps.setString(1,doctorname);
    ResultSet rs=ps.executeQuery();
    List<AppointmentPojo>appList=new ArrayList<>();
    while(rs.next()){
    AppointmentPojo app=new AppointmentPojo();
    app.setPat_id(rs.getString("patient_id"));
    app.setPat_name(rs.getString("patient_name"));
    //app.setStatus(rs.getString("status"));
    app.setOpd(rs.getString("opd"));
    app.setDate_time(rs.getString("date_time"));
    app.setMob_no(rs.getString("mobile_no"));
    appList.add(app);   
    }
    return appList;
    }
     
     
     public static List<AppointmentPojo> getAllconfirmAppointments()throws SQLException{
    Connection conn=DBConnection.getConnect();
    PreparedStatement ps=conn.prepareStatement("Select * from appointments where status='CONFIRM' order by patient_id");
    ResultSet rs=ps.executeQuery();
    List<AppointmentPojo>appList=new ArrayList<>();
    while(rs.next()){
    AppointmentPojo app=new AppointmentPojo();
    app.setPat_id(rs.getString("patient_id"));
    app.setPat_name(rs.getString("patient_name"));
    app.setOpd(rs.getString("opd"));
    app.setDate_time(rs.getString("date_time"));
    appList.add(app);   
    }
    return appList;
     }
}
    

