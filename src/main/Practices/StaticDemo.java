package main.Practices;

public class StaticDemo {
    static void m1(){
        System.out.println("from m1...");
    }
    static int a=10;
    static int b;
    static {
        System.out.println("static block initialized");
        b=a*4;
    }
    static int c=m2();
    static {
        System.out.println("Inside static block");
    }
    static int m2(){
        System.out.println("from m2...");
        return 20;
    }
    public static void main(String[] args) {
        m1();
        System.out.println("from main...");
        System.out.println("value of a: "+a);
        System.out.println("value of b: "+b);
        System.out.println("value of c: "+c);
        System.out.println("from main...");
    }
}
