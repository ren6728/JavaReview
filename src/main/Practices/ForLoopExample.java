package main.Practices;

public class ForLoopExample {
static int sum;
    public static void main(String[] args) {

        for(int i=1 ; i <= 5 ; i++){
            System.out.println(i);
            System.out.println("Hello World!");
        }
        for(int x=1; x<=5;x++){
        sum=sum+x;
        }
        System.out.println("sum : "+ sum);
        String array[]={"Abby","vicky","kevin"};
        for(String y:array){
            System.out.println(y);
        }
        for(int a=0;a<=array.length;a++){
            System.out.println(array[a]);
        }
        for(int b=1;b>=1;b++){
            System.out.println("Infinite loop: "+b);
        }
        for(;;){
            System.out.println("Infinite loop");
        }
    }
}
