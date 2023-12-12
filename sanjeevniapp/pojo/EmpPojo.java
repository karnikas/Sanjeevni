package sanjeevniapp.pojo;

public class EmpPojo {

    public EmpPojo() {
    }

    public EmpPojo(String emp_id, String emp_name, String emp_department, double emp_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_department = emp_department;
        this.emp_salary = emp_salary;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_department() {
        return emp_department;
    }

    public void setEmp_department(String emp_department) {
        this.emp_department = emp_department;
    }

    public double getEmp_salary() {
        return emp_salary;
    }

    public void setEmp_salary(double emp_salary) {
        this.emp_salary = emp_salary;
    }
   private String emp_id;
   private String emp_name;
   private  String emp_department;
   private double emp_salary;
}
