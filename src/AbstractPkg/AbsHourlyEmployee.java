/*
 * Subclass of Abstract Employee for Hourly Employee
 */
package AbstractPkg;


public class AbsHourlyEmployee extends AbstractEmployee {
    private double hrlyWage, hrsWorked;
    
    public AbsHourlyEmployee(String eName, String eDepartment, String ePosition,
            double wage, double hrs) {
        super(eName, eDepartment, ePosition);
        hrlyWage = wage;
        hrsWorked = hrs;
    }
    // Methods
    @Override
    public void calcWklyPay() {
        super.setWeeklyPay((hrlyWage*hrsWorked));
    }
    @Override
    public String toString() {
        return "\nHourlyEmployee{"+super.toString() + "\nhrlyWage=" + hrlyWage +
                "\nWeekly Pay: "+
                super.getWeeklyPay()+'}';
    }
}
