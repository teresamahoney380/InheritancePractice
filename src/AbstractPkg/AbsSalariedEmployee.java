/*
  * Subclass of AbstractEmployee for Salaried Employees
 */
package AbstractPkg;

/**
 *
 * Teresa Mahoney
 */

public class AbsSalariedEmployee extends AbstractEmployee {
    private double salaryAmt;
    

    public AbsSalariedEmployee(String eName, String eDepartment, String ePosition, double samt) {
        super(eName, eDepartment, ePosition);
        salaryAmt=samt;
        calcWklyPay();
    }

// methods
    public double getSalaryAmt() {
        return salaryAmt;
    }
    // calc weekly pay
        // overrides abstract method
    public void calcWklyPay () {
        super.setWeeklyPay(salaryAmt/52);
    }

    @Override
    public String toString() {
        return "Salaried Employee{" +super.toString() +"\nsalaryAmt=" + salaryAmt 
                + "\nWeekly Pay: "+super.getWeeklyPay()+'}';
    }
    
    
}

    

