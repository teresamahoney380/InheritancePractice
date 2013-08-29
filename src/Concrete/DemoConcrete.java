/*
 * Demo working Concrete code.
 */
package Concrete;

/**
 *
 * Teresa Mahoney
 */
public class DemoConcrete {
    public static void main(String[] args) {
        System.out.println("first line of demo");
        SalariedEmployee sal1= new SalariedEmployee("Herb Hanover","Accounting",
                "Sr Mgr",50000);
        System.out.println("YOU got this much done");
        System.out.println(sal1.toString());
    }
  
}
