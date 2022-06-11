package main.Practices;

public class FinalDemo1 {
    final int THRESHOLD = 5;
    final int CAPACITY;
    final int  MINIMUM;

    static final double PI = 3.141592653589793;
    static final double EULERCONSTANT;

    {
        CAPACITY = 25;
    }


    static{
        EULERCONSTANT = 2.3;
    }
    public FinalDemo1()
    {
        MINIMUM = -1;
    }

    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder("Geeks");
        System.out.println(sb);
sb.append("ForGeeks");
        System.out.println(sb);
        //CAPACITY=5;
        final int a;
        a=10;
        System.out.println(a);
        int arr[]={1,2,3};
        for(final int b: arr){
            System.out.println(b+" ");
        }
    }
}
