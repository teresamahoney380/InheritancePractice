/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacePkg;

/**
 *
 * @author Owner
 */
public interface IntEmployee {
    // Methods
    public String geteName(); 

    public void seteName(String eName); 

    public String geteDepartment(); 

    public void seteDepartment(String eDepartment); 

    public String getePosition(); 

    public void setePosition(String ePosition); 
    

    public double getWeeklyPay(); 

    public void setWeeklyPay(double weeklyPay); 

    public String toString();
    
    public void calcWklyPay();
    
}
