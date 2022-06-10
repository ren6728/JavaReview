package main.Practices;

public class PracticeWhileLoop {
   static  int i;
   static  int a;
    public void search(){
    String colour[]={"red","orange","pink","black","blue"};

    while(a<=colour.length){
        System.out.println(colour[a]);
        a++;
        if(colour[a]=="pink"){
            System.out.println("It is there");
        }else{
            System.out.println("It is not there");
        }

    }
}
    public static void main(String[] args) {
       /*  while(i<=6){
            System.out.println("I am practicing");
            i++;
        }

       while(a<=colour.length){
            System.out.println(colour[a]);
            a++;
        }*/
        PracticeWhileLoop obj=new PracticeWhileLoop();
        obj.search();


    }
}
