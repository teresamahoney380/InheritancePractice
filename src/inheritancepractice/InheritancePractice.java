/*
 * This is a project to practice Inheritance
 * and and use GitHib.
 */
package inheritancepractice;

import Concrete.SalariedEmployee;
import Concrete.HourlyEmployee;
import Concrete.SalaryPlusBonusEmployee;


/**
 *
 * Teresa Mahoney
 */
public class InheritancePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Demo of concrete code
        SalariedEmployee sal1= new SalariedEmployee("Herb Hanover","Accounting",
                "Sr Mgr",50000);
       
                
       HourlyEmployee hrlyEmp1= new HourlyEmployee("Patti Smith","Accounting",
                "Clerk", 14.25, 37.00);
       SalaryPlusBonusEmployee spbe1=new SalaryPlusBonusEmployee("Bob Parker",
               "Sales","Sr Account Mgr",45000,2000);
        System.out.println("THIS IS THE OUTPUT FOR THE CONCRETE PACKAGE\n");
        System.out.println(sal1.toString());
        System.out.println(hrlyEmp1.toString());
        System.out.println(spbe1.toString());
    }
}
