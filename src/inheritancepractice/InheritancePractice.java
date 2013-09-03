/*
 * This is a project to practice Inheritance
 * and and use GitHib.
 */
package inheritancepractice;

import Concrete.SalariedEmployee;
import Concrete.HourlyEmployee;
import Concrete.SalaryPlusBonusEmployee;
import AbstractPkg.AbsSalariedEmployee;
import AbstractPkg.AbsSalaryPlusBonusEmployee;
import AbstractPkg.AbsHourlyEmployee;
import InterfacePkg.IntSalariedEmployee;


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
        sal1.calcWklyPay();//set weekly pay
       
                
       HourlyEmployee hrlyEmp1= new HourlyEmployee("Patti Smith","Accounting",
                "Clerk", 14.25, 37.00);
       SalaryPlusBonusEmployee spbe1=new SalaryPlusBonusEmployee("Bob Parker",
               "Sales","Sr Account Mgr",45000,2000);
       spbe1.calcWklyPay();
        System.out.println("THIS IS THE OUTPUT FOR THE CONCRETE PACKAGE\n");
        System.out.println(sal1.toString());
        System.out.println(hrlyEmp1.toString());
        System.out.println(spbe1.toString());
        //
        // Output from Abstract Class
        //
        AbsSalariedEmployee absSal1= new AbsSalariedEmployee("AbstractHerb Hanover","Accounting",
                "Sr Mgr",50000);
        absSal1.calcWklyPay();
        AbsSalaryPlusBonusEmployee absSpbe1=new AbsSalaryPlusBonusEmployee("AbstractBob Parker",
               "Sales","Sr Account Mgr",45000,2000);
        absSpbe1.calcWklyPay();
        AbsHourlyEmployee absHrlyEmp1=new AbsHourlyEmployee("AbstractPatti Smith","Accounting",
                "Clerk", 14.25, 37.00);
        absHrlyEmp1.calcWklyPay();
        System.out.println("\n THIS IS THE OUTPUT FOR THE ABSTRACT PACKAGE\n");
        System.out.println(absSal1.toString());
        System.out.println(absSpbe1.toString());
        System.out.println(absHrlyEmp1.toString());
        //
        // Output from Interface Class
        //
        System.out.println("\n THIS IS THE OUTPUT FOR THE INTERFACE PACKAGE\n");
        IntSalariedEmployee intSal1=new IntSalariedEmployee("InterfaceHerb Hanover","Accounting",
                "Sr Mgr",50000);
        intSal1.calcWklyPay();
        System.out.println(intSal1.toString());
    }
}
