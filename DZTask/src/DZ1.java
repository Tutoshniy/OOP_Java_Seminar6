import java.sql.Date;

public class DZ1 {

    public class Employee {
        private String name;
        private Date dob;

        public Employee(String name, Date dob) {
            this.name = name;
            this.dob = dob;
        }

        public String getEmpInfo() {
            return "name - " + name + " , dob - " + dob.toString();
        }
    }

    public class Office extends Employee {
        private int baseSalary;

        public Office(String name, Date dob, int baseSalary) {
            super(name, dob);
            this.baseSalary = baseSalary;
        }

        public int calculateNetSalary() {
            int tax = (int) (baseSalary * 0.25);// calculate in otherway
            return baseSalary - tax;
        }
    }
}