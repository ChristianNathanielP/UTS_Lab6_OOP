public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee (int id, String fistName, String lastName, int salary){
        this.id = id;
        this.firstName = fistName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String toString(){
        return "Employee[id= " + id + ", name= " + firstName + " " + lastName + ", salary= " + salary + "]";
    }

    public int getid(){
        return id;
    }
    public String getfirstName(){
        return firstName;
    }
    public String getlastName(){
        return lastName;
    }
    public void setsalary(int salary){
        this.salary = salary;
    }
    public int getsalary(){
        return salary;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public String getname(){
        return firstName + " " + lastName;
    }

    public int raiseSalary(int percent){
        int temp;
        temp = salary * percent/100;
        salary = temp + salary;
        return salary;
    }

}
