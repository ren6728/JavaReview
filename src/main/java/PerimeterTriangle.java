import java.util.Scanner;
public class PerimeterTriangle {
    private static final double radius = 4.2;

    static float findPerimeter(float a, float b, float c)
    {
        // Formula for Perimeter of triangle
        return (a + b + c);
    }

    // Driver method
    public static void main(String[] args)
    {
        float a = 9, b = 6, c = 5;
        System.out.println(findPerimeter(a, b, c));


        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);
        int number1; // first number to compare
        int number2; // second number to compare

        System.out.print( "Input first integer: " ); // prompt
        number1 = input.nextInt(); // read first number from user

        System.out.print( "Input second integer: " ); // prompt
        number2 = input.nextInt(); // read second number from user

        if ( number1 == number2 )
            System.out.printf( "%d == %d\n", number1, number2 );
        if ( number1 != number2 )
            System.out.printf( "%d != %d\n", number1, number2 );
        if ( number1 < number2 )
            System.out.printf( "%d < %d\n", number1, number2 );
        if ( number1 > number2 )
            System.out.printf( "%d > %d\n", number1, number2 );
        if ( number1 <= number2 )
            System.out.printf( "%d <= %d\n", number1, number2 );
        if ( number1 >= number2 )
            System.out.printf( "%d >= %d\n", number1, number2 );


        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
    }

