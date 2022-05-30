import java.util.Scanner;

public class IfElse {
    private static Scanner sc;
    public static void main(String[] args)
    {
        int firstNumber = 13;
        int secondNumber = 16;
        if ((firstNumber - secondNumber) == 0)
            System.out.println("Numbers are equal");
        else
            System.out.println("Numbers are not equal");


            int number1, number2;
            sc = new Scanner(System.in);

            System.out.print(" Please Enter the First Number : ");
            number1 = sc.nextInt();

            System.out.print(" Please Enter the Second Number : ");
            number2 = sc.nextInt();

            if(number1 > number2)
            {
                System.out.println("\n The Largest Number = " + number1);
            }
            else if (number2 > number1)
            {
                System.out.println("\n The Largest Number = " + number2);
            }
            else
            {
                System.out.println("\n Both are Equal");
            }
        int num1 = 23, num2 = 32, num3 = 15;

        if( num1 >= num2 && num1 >= num3)
            System.out.println(num1+" is the largest Number");

        else if (num2 >= num1 && num2 >= num3)
            System.out.println(num2+" is the largest Number");

        else
            System.out.println(num3+" is the largest Number");

        int totalMarks=48;
        if(totalMarks>50){
            System.out.print("You have passed the exam !!");
        }
        else {
            System.out.print("You have failed the exam !!");
        }
    }
    }



