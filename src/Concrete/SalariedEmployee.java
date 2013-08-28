/*
 * Subclass of Employee for Salaried Employees
 */
package Concrete;


public class SalariedEmployee extends Employee {
    private double salaryAmt;
    

    public SalariedEmployee(String eName, String eDepartment, String ePosition, double samt) {
        super(eName, eDepartment, ePosition);
        salaryAmt=samt;
    }

// methods
    public double getSalaryAmt() {
        return salaryAmt;
    }
    // calc weekly pay
    public double calcWklyPay () {
        return (salaryAmt/52);
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +super.toString() +"\nsalaryAmt=" + salaryAmt 
                + "\nWeekly Pay: "+this.calcWklyPay()+'}';
    }
    
    
}
