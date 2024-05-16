public class Main {
    public static void main(String[] args) {
//        Test constructor and toString()
        Employee e1 = new Employee(8, "Xavier", "Valvale", 2500);
        System.out.println(e1); //toString();
//      Test Setters dan Getters
        e1.setsalary(999);

        System.out.println(e1); //toString();
        System.out.println("Id is: " + e1.getid());
        System.out.println("Firstname is: " + e1.getfirstName());
        System.out.println("Lastname is: " + e1.getlastName());
        System.out.println("Salary is: " + e1.getsalary());
        System.out.println("Name is: " + e1.getname());
        System.out.println("Annual Salary is: " + e1.getAnnualSalary()); //test method

//        Test raiseSalary
        System.out.println(e1.raiseSalary(10));
        System.out.println(e1);
    }
}