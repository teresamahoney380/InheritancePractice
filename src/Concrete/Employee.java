/*
 * This is the Employee Super Class
 */
package Concrete;

/**
 *
 * Teresa Mahoney
 */
public class Employee {
    private String eName; // employee name
    private String eDepartment; // employee department
    private String ePosition; // employee position
    private double weeklyPay; // employee weekly pay
    
    // no arg constuctor
    public Employee() {
    }

    // constructor
    public Employee(String eName, String eDepartment, String ePosition) {
        this.eName = eName;
        this.eDepartment = eDepartment;
        this.ePosition = ePosition;
    }

    public double getWeeklyPay() {
        return weeklyPay;
    }

    public void setWeeklyPay(double weeklyPay) {
        this.weeklyPay = weeklyPay;
    }

    @Override
    public String toString() {
        return "Employee{" + "eName=" + eName + "\n eDepartment=" + eDepartment + 
                "\n ePosition=" + ePosition + "\n weeklyPay=" + weeklyPay + '}';
    }
    
    
}
