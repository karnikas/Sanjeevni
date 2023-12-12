package sanjeevniapp.pojo;

import java.sql.Date;

public class PatientsPojo {

    public PatientsPojo() {
    }

    @Override
    public String toString() {
        return "PatientsPojo{" + "patient_id=" + patient_id + ", first_name=" + first_name + ", last_name=" + last_name + ", gender=" + gender + ", m_status=" + m_status + ", address=" + address + ", city=" + city + ", mob_no=" + mob_no + ", opd=" + opd + ", doc_id=" + doc_id + ", status=" + status + ", age=" + age + ", otp=" + otp + ", date=" + date + '}';
    }

    public PatientsPojo(String patient_id, String first_name, String last_name, String gender, String m_status, String address, String city, String mob_no, String opd, String doc_id, String status, int age, int otp, Date date) {
        this.patient_id = patient_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.m_status = m_status;
        this.address = address;
        this.city = city;
        this.mob_no = mob_no;
        this.opd = opd;
        this.doc_id = doc_id;
        this.status = status;
        this.age = age;
        this.otp = otp;
        this.date = date;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getM_status() {
        return m_status;
    }

    public void setM_status(String m_status) {
        this.m_status = m_status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMob_no() {
        return mob_no;
    }

    public void setMob_no(String mob_no) {
        this.mob_no = mob_no;
    }

    public String getOpd() {
        return opd;
    }

    public void setOpd(String opd) {
        this.opd = opd;
    }

    public String getDoc_id() {
        return doc_id;
    }

    public void setDoc_id(String doc_id) {
        this.doc_id = doc_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    String patient_id;
    String first_name;
    String last_name;
    String gender;
    String m_status;
    String address;
    String city;
    String mob_no;
    String opd;
    String doc_id;
    String status;
    int age;
    int otp;
   Date date; 
}
