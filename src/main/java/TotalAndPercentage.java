import java.util.Scanner;
public class TotalAndPercentage {
    public static void main(String[] args) {
        int N = 3, total_marks = 0;
        float percentage;

        // create 1-D array to store marks
        int marks[] = {87,39,52};

        // calculate total marks
        for (int i = 0; i < N; i++) {
            total_marks += marks[i];
        }
        System.out.println("Total Marks : " + total_marks);

        // calculate percentage
        percentage = (total_marks / (float) N);
        System.out.println(
                "Total Percentage : " + percentage + "%");

        { float Fahrenheit, Celsius;
            Fahrenheit = 43;
            Celsius  = ((Fahrenheit-32)*5)/9;
            System.out.println("Temperature in celsius is: "+Celsius);
        }
        double n1 = 76, n2 = 54, n3 = 89;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double x = in.nextDouble();
        System.out.print("Input the Second number: ");
        double y = in.nextDouble();
        System.out.print("Input the third number: ");
        double z = in.nextDouble();
        System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
    }

    public static double smallest(double x, double y, double z)
    {
        return Math.min(Math.min(x, y), z);
}
}
