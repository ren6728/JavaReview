import java.util.Scanner;
public class Calculator {
    public int addingNumbers(int a,int b){
        return a+b;
    }
    public int deductNumbers(int a,int b){
        return a-b;
    }
    public int addingThreeNumbers(int a,int b,int c){
        return a+b+c;
    }
    public int deductThreeNumbers(int a,int b,int c){
        return a-b-c;
    }
    public void openCalculator(){
        System.out.println("Calculator is Open!");
    }
    int x;
    int y;
    int z;
    public  void setNumbers(int x, int y) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
         x = in.nextInt();
        System.out.print("Input the second number: ");
        y = in.nextInt();

    }

    public  void addNumbers(){

        System.out.println(x+y);

    }

    public static void main(String[] args) {
        Calculator cal =new Calculator();
       // cal.setNumbers();
        cal.addNumbers();
        cal.addingNumbers(3,5);
    }
}
