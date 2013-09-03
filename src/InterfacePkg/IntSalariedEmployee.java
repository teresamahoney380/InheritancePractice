/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacePkg;


public class IntSalariedEmployee extends IntEmployeeSuper {
    private double salaryAmt;
    
    public IntSalariedEmployee(String eName, String eDepartment, String ePosition, double samt) {
        super(eName, eDepartment, ePosition);
        salaryAmt=samt;
    }
    // methods
    public double getSalaryAmt() {
        return salaryAmt;
    }
    // calc weekly pay
        // overrides abstract method
    @Override
    public void calcWklyPay () {
        super.setWeeklyPay(salaryAmt/52);
    }

    @Override
    public String toString() {
        return "Salaried Employee{" +super.toString() +"\nsalaryAmt=" + salaryAmt 
                + "\nWeekly Pay: "+super.getWeeklyPay()+'}';
    }
    
}
