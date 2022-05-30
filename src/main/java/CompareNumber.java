import java.util.Scanner;
public class CompareNumber {
    static void areSame(int a, int b)
    {
        if ((a ^ b) != 0)
            System.out.print("Not Same");
        else
            System.out.print("Same");
    }

    // Driver Code
    public static void main(String[] args)
    {

        // Calling function
        areSame(23, 45);

        int r1 = (101 + 0) / 3;
        double r2 = 7.0e-6 * 10000000.1;
        boolean r3 = true && true;
        boolean r4 = false && true;
        boolean r5 = (false && false) || (true && true);
        boolean r6 = (false || false) && (true && true);

        System.out.println("(101 + 0) / 3)-> " + r1);
        System.out.println("(7.0e-6 * 10000000.1)-> " + r2);
        System.out.println("(true && true)-> " + r3);
        System.out.println("(false && true)-> " + r4);
        System.out.println("((false && false) || (true && true))-> " + r5);
        System.out.println("(false || false) && (true && true)-> " + r6);

        int l, b, perimeter, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of rectangle:");
        l = s.nextInt();
        System.out.print("Enter breadth of rectangle:");
        b = s.nextInt();
        perimeter = 2 * (l + b);
        System.out.println("Perimeter of rectangle:"+perimeter);
        area = l * b;
        System.out.println("Area of rectangle:"+area);
    }
}
