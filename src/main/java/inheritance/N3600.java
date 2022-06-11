package inheritance;

public class N3600 extends N1100{
    public void camera(){
        System.out.println("Take photo...");
    }

    public static void main(String[] args) {
        N3600 myN3600=new N3600();
        myN3600.camera();
        myN3600.call();
        myN3600.text();

    }
}
