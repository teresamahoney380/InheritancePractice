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
        bonusAmt=bamt;
    }
    
}
