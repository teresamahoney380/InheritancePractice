/*
 * This is the subclass for hourly employees
 */
package Concrete;


public class HourlyEmployee extends Employee {
    private double hrlyWage, hrsWorked;

    public HourlyEmployee(String eName, String eDepartment, String ePosition, double wage, double hrs) {
        super(eName, eDepartment, ePosition);
        hrlyWage = wage;
        hrsWorked = hrs;
        calcWklyPay(hrsWorked);
    }

// methods
    // get hourly wage
    public double getHrlyWage() {
        return hrlyWage;
    }
    
    // calc weekly pay
    public void calcWklyPay(double hrs){
       super.setWeeklyPay((hrlyWage*hrs));
     }

    @Override
    public String toString() {
        return "\nHourlyEmployee{"+super.toString() + "\nhrlyWage=" + hrlyWage +
                "\nWeekly Pay: "+
                super.getWeeklyPay()+'}';
    }
    
    
}
