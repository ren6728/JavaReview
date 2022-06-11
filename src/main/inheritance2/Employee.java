package main.inheritance2;

public class Employee extends Member {
    String department;
    public Employee(String name,int age , String phoneNumber,String address,String dep){
        super(name, age, phoneNumber, address);
        this.department=dep;
        System.out.println(name+": "+age+", "+phoneNumber+", "+address+", "+dep);
    }

    @Override
    public void printSalary(int salary) {
        super.printSalary(salary);
    }


    public static void main(String[] args) {
Employee emp=new Employee("Abby",40,"3476898865","3219 " +
        "6AVE,10076 NY","Leader");
emp.printSalary(10000);

    }
}
