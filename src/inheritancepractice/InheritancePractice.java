/*
 * This is a project to practice Inheritance
 * and and use GitHib.
 */
package inheritancepractice;

import Concrete.SalariedEmployee;

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
        System.out.println("THIS IS THE OUTPUT FOR THE CONCRETE PACKAGE\n");
        System.out.println(sal1.toString());
    }
}
