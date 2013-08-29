/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Concrete;


public class HourlyEmployee extends Employee {
    private double hrlyWage;

    public HourlyEmployee(String eName, String eDepartment, String ePosition, double wage, double hrs) {
        super(eName, eDepartment, ePosition);
        hrlyWage = wage;
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
                super.getWeeklyPay()+'}';
    }
    
    
}
