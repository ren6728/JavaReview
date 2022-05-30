import java.util.Scanner;

public class StudentGrade {
    public static void main(String args[])
    {
        /* This program assumes that the student has 6 subjects,
         * thats why I have created the array of size 6. You can
         * change this as per the requirement.
         */
        int marks[] = new int[6];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);


        for(i=0; i<6; i++) {
            System.out.print("Enter Marks of Subject"+(i+1)+":");
            marks[i] = scanner.nextInt();
            total = total + marks[i];
        }
        scanner.close();
        //Calculating average here
        avg = total/6;
        System.out.print("The student Grade is: ");
        if(avg>=91 && avg<100)
        {
            System.out.print("AA");
        }
        else if(avg>=81 && avg<90)
        {
            System.out.print("AB");
        }
        else if(avg>=71 && avg<80)
        {
            System.out.print("BB");
        }
        else if(avg>=61 && avg<70)
        {
            System.out.print("BC");
        }
        else if(avg>=51 && avg<60)
        {
            System.out.print("CD");
        }
        else if(avg>=41 && avg<50)
        {
            System.out.print("DD");
        }
        else
        {
            System.out.print("FAIL");
        }
    }
}
