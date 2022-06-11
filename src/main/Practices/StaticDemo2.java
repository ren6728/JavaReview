package main.Practices;

public class StaticDemo2 {
    static int a=10;
    int b=20;
    static void m1(){
        a=20;
        System.out.println("from m1"+a);
        //b=10;
//m2();
       // System.out.println(super.a);
    }
    void m2(){
        System.out.println("from m2");
    }

    public static void main(String[] args) {
        m1();
        StaticDemo2 std2=new StaticDemo2();
        std2.m2();
    }
}
