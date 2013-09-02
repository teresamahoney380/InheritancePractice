/*
 * Subclass of Abstract Employee for Salaried plus Bonus.
 */
package AbstractPkg;


public class AbsSalaryPlusBonusEmployee extends AbsSalariedEmployee {
    private double bonusAmt;

    public AbsSalaryPlusBonusEmployee(String eName, String eDepartment, String ePosition, 
            double samt, double bamt) {
        super(eName, eDepartment, ePosition, samt);
        bonusAmt=bamt;        
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
