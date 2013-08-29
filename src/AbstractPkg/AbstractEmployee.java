/*
 *  This is the Employee Abstract Class
 */
package AbstractPkg;

/**
 *
 * Teresa Mahoney
 */
public abstract class AbstractEmployee {
 
    private String eName; // employee name
    private String eDepartment; // employee department
    private String ePosition; // employee position
    public double weeklyPay; // employee weekly pay
    
    // no arg constuctor
    public AbstractEmployee() {
    }

    // constructor
    public AbstractEmployee(String eName, String eDepartment, String ePosition) {
        this.eName = eName;
        this.eDepartment = eDepartment;
        this.ePosition = ePosition;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteDepartment() {
        return eDepartment;
    }

    public void seteDepartment(String eDepartment) {
        this.eDepartment = eDepartment;
    }

    public String getePosition() {
        return ePosition;
    }

    public void setePosition(String ePosition) {
        this.ePosition = ePosition;
    }
    

    public double getWeeklyPay() {
        return weeklyPay;
    }

    public void setWeeklyPay(double weeklyPay) {
        this.weeklyPay = weeklyPay;
        
    }
    
    // abstract method
    public abstract void calcWklyPay();

 
    public String toString() {
        return "\n eName=" + eName + "\n eDepartment=" + eDepartment + 
                "\n ePosition=" + ePosition;
    }
    
    
}

    
