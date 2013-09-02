/*
 * Subclass of Employee for Salaried Employees
 */
package Concrete;


public class SalariedEmployee extends Employee {
    private double salaryAmt;
    

    public SalariedEmployee(String eName, String eDepartment, String ePosition, double samt) {
        super(eName, eDepartment, ePosition);
        salaryAmt=samt;
      //  calcWklyPay();
    }

// methods
    public double getSalaryAmt() {
        return salaryAmt;
    }
    // calc weekly pay
    public void calcWklyPay () {
        super.setWeeklyPay(salaryAmt/52);
    }

    @Override
    public String toString() {
        return "Salaried Employee{" +super.toString() +"\nsalaryAmt=" + salaryAmt 
                + "\nWeekly Pay: "+super.getWeeklyPay()+'}';
    }
    
    
}
