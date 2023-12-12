package sanjeevniapp.pojo;

public class DoctorsPojo {

    public DoctorsPojo() {
    }

    public DoctorsPojo(String doctor_id, String doctor_name, String email_id, String contact_no, String qualification, String gender, String specialist) {
        this.doctor_id = doctor_id;
        this.doctor_name = doctor_name;
        this.email_id = email_id;
        this.contact_no = contact_no;
        this.qualification = qualification;
        this.gender = gender;
        this.specialist = specialist;
    }

    public String getDoctor_id() {
        return doctor_id;
    }

    public void setDoctor_id(String doctor_id) {
        this.doctor_id = doctor_id;
    }

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    private String doctor_id;
    private String doctor_name;
    private String email_id;
    private String contact_no;
    private String qualification;
    private String gender;
    private String specialist;
}
