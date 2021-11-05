/**
 * Note that Both the class file and class test file both are at the same package
 * We will try to call and print ID, Age, Salary, Tax and Employe Name from here
 *
 *
 */


public class SetterandGetterMethodsMainFun  {


    public static void main(String[] args) {

        SetterandGetterMethods Emp1=new SetterandGetterMethods();
        System.out.println(Emp1);

        System.out.println( "This is Default ID from GetFun= "+Emp1.getID());
        System.out.println( "This is Default Age from GetFun= "+Emp1.getAge());
        System.out.println( "This is Default Salary from GetFun= "+Emp1.getSalary());
        System.out.println( "This is Default Tax from GetFun= "+Emp1.getTax());
        System.out.println( "This is Default EmployeName from GetFun= "+Emp1.getEmployeName());

        Emp1.setID(100);
        Emp1.setAge(35);
        Emp1.setSalary(2000);
        Emp1.setTax(10);
        Emp1.setEmployeName("Ali Mohamed");

        System.out.println(Emp1);



    }




}
