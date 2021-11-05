/**
 * This comment is for documention
 * This file shows setter anf getter methods and how to use them
 *
 *
 *
 * @author Ali mohamed
 * @Version 1.0
 */


public class SetterandGetterMethods {

    private int ID,Age,Salary,tax;

    private String EmployeName;




    public SetterandGetterMethods(int ID, int Age, int Salary, int tax, String EmployeName) {
        this.ID = ID;
        this.Age = Age;
        this.Salary = Salary;
        this.tax = tax;
        this.EmployeName = EmployeName;
    }

    public SetterandGetterMethods( ) {
        this.ID = 0;
        this.Age = 0;
        this.Salary = 0;
        this.tax = 0;
        this.EmployeName = " ";
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public String getEmployeName() {
        return EmployeName;
    }

    public void setEmployeName(String employeName) {
        EmployeName = employeName;
    }

    /**
     * The following are Setter and Getter Methods
     *
     *
     *
     *
     * @return
     */



    ///////////////////
    @Override
    public String toString() {
        return "SetterandGetterMethods{" +
                "ID=" + ID +
                ", Age=" + Age +
                ", Salary=" + Salary +
                ", tax=" + tax +
                ", EmployeName='" + EmployeName + '\'' +
                '}';
    }

//    public static void main(String[] args) {
//	// write your code here
//
//
//
//
//    }
}
