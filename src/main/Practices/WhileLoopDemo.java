package main.Practices;

public class WhileLoopDemo {
    public static void main(String[] args) {
        int i=1;
        while(i<=6){
            System.out.println("Hello World!");
            i++;
        }
        int x=1,sum=0;
        while(x<=10){
        sum=sum+x;
        x++;
        }
        System.out.println("Summation: " +sum);
    }
}
