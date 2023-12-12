package sanjeevniapp.pojo;

public class AppointmentPojo {

    public AppointmentPojo() {
    }

    public AppointmentPojo(String pat_id, String pat_name, String status, String opd, String date_time, String doc_name, String mob_no) {
        this.pat_id = pat_id;
        this.pat_name = pat_name;
        this.status = status;
        this.opd = opd;
        this.date_time = date_time;
        this.doc_name = doc_name;
        this.mob_no = mob_no;
    }

    public String getPat_id() {
        return pat_id;
    }

    public void setPat_id(String pat_id) {
        this.pat_id = pat_id;
    }

    public String getPat_name() {
        return pat_name;
    }

    public void setPat_name(String pat_name) {
        this.pat_name = pat_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOpd() {
        return opd;
    }

    public void setOpd(String opd) {
        this.opd = opd;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public String getDoc_name() {
        return doc_name;
    }

    public void setDoc_name(String doc_name) {
        this.doc_name = doc_name;
    }

    public String getMob_no() {
        return mob_no;
    }

    public void setMob_no(String mob_no) {
        this.mob_no = mob_no;
    }
    String pat_id;
    String pat_name;
    String status;
    String opd;
    String date_time;
    String doc_name;
    String mob_no;
}
