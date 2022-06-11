package main.inheritance2;

public class Member {
    String Name;
int Age ;
String Phonenumber;
String Address ;
int Salary;
    public Member(String name,int age , String phoneNumber,String address){
this.Address=address;
this.Age=age;
this.Name=name;
this.Phonenumber=phoneNumber;
    }

    public void printSalary(int salary){
        this.Salary=salary;
    System.out.println("Salary: "+salary);
}
}
