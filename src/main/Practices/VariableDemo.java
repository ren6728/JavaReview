package main.Practices;

public class VariableDemo {
    int myVariable;
    static int data = 30;

    public static void main(String args[]){
        int a = 100;
        VariableDemo obj = new VariableDemo();

        System.out.println("Value of instance variable myVariable: "+obj.myVariable);
        System.out.println("Value of static variable(class variable) data: "+ VariableDemo.data);
        System.out.println("Value of local variable a: "+a);
    }
}
