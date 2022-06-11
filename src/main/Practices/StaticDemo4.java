package main.Practices;

public class StaticDemo4 {
    private static String str="GeeksforGeeks";
    static class MyNestedClass{
        public void disp(){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        StaticDemo4.MyNestedClass obj=new StaticDemo4.MyNestedClass();
        obj.disp();
    }
}
