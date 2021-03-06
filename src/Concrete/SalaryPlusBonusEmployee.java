/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete;


public class SalaryPlusBonusEmployee extends SalariedEmployee {
    private double bonusAmt;

    public SalaryPlusBonusEmployee(String eName, String eDepartment, String ePosition, double samt,
            double bamt) {
        super(eName, eDepartment, ePosition, samt);
            
        bonusAmt=bamt; // set bonus amount
    }

    public double getBonusAmt() {
        return bonusAmt;
    }
   
     // calc weekly pay
    @Override
    public void calcWklyPay () {
        double wklyPay = (super.getSalaryAmt()/52);
        super.setWeeklyPay(wklyPay+getBonusAmt());
    }

    @Override
    public String toString() {
        return "\nSalaried Bonus Employee{\n eName=" + geteName() + "\n eDepartment=" + geteDepartment() + 
    "\n ePosition=" + getePosition()+"\nSalaryAmt=" + super.getSalaryAmt()
                +"\nBonus Amount: "+bonusAmt
                + "\nWeekly Pay + Bonus: "+super.getWeeklyPay()+'}';
    }
    
    
}
