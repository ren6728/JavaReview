package main.Practices;

public class PracticeForLoop {
    static String msg="I am practicing";
    int i;
    static int j;
    public static void main(String[] args) {
        for(int i=1;i<=7; i++){
            System.out.println(msg);
        }
        String array[] ={"red","orange","pink","black","blue"};

        for(String a: array){
            System.out.println(a);
        }
        for(j=0;j<=array.length;j++){
            System.out.println(array[j]);
            if(array[j]=="pink"){
                System.out.println("It is there");
            }else{
                System.out.println("It is not there");
            }
        }


    }

}
