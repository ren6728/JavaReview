package main.inheritance2;

public class Manager extends Member {
    String specialization;
public Manager(String name,int age , String phoneNumber,String address,String spec ){
    super(name, age, phoneNumber, address);
    this.specialization=spec;
    System.out.println(name+": "+age+", "+phoneNumber+", "+address+", "+spec);
}

    @Override
    public void printSalary(int salary) {
        super.printSalary(salary);
    }

    public static void main(String[] args) {
       Manager mana=new Manager("Melanie",30,"9296734567","1625 broadway, " +
               "lexington ave,16007","Tester");

        mana.printSalary(5000);
    }
}
