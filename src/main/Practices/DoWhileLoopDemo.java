package main.Practices;

public class DoWhileLoopDemo {
    public static void main(String[] args) {
        int i=0;
        do{
            System.out.println("Hello World!");
i++;
        }while(i<6);
        int x=21; int sum=0;
        do{
sum += x;
x--;
        }while(x>10);
        System.out.println("Summation: "+sum);
    }
}
