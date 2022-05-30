public class GreatestNumber {
    public static void main(String[] args) {

     //   Math.max(Math.max(a,b),Math.max(c,d))
        int num1 = 10, num2 = 20, num3 = 7;

        if (num1 >= num2 && num1 >= num3)
            System.out.println(num1 + " is the largest Number");

        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2 + " is the largest Number");

        else
            System.out.println(num3 + " is the largest Number");
        double a1 = 12.123;
        double b1 = 12.456;

        // prints the maximum of two numbers
        System.out.println(Math.max(a1, b1));
       max(10,30,40,50);
    }
    public static int max(int a, int b, int c, int d) {

        int max = a;

        if (b > max)
            max = b;
        if (c > max)
            max = c;
        if (d > max)
            max = d;

        return max;

    }
}
