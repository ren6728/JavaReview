public class Typecasting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0
        System.out.println("widenning casting done!");
        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9
        System.out.println("Narrowing casting done!");

        int a = 1234;
        int b = -1234;

        // Converting integer to string
        // using toString() method
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);

        // Printing the above strings that
        // holds integer
        System.out.println("String str1 = " + str1);
        System.out.println("String str2 = " + str2);
        System.out.println("Integer to string casting done!");

        String str="123";
        int inum = 100;

        /* converting the string to an int value
         * ,the value of inum2 would be 123 after
         * conversion
         */
        int inum2 = Integer.parseInt(str);

        int sum = inum+inum2;
        System.out.println("Result is: "+sum);
        System.out.println("String to int casting done!");
        double d1 = 1.0;
        double d2 = 3.0;
        double d = d1/d2;
        System.out.println("double d : "+d);

        float f = (float) d;
        System.out.println("float f : "+f);
        System.out.println("double to float casting done!");
    }
    }

