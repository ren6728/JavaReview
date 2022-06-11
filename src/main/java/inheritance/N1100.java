package inheritance;

public class N1100 extends PreN1100 {
    public static void main(String[] args) {
        N1100 myN1100=new N1100();
        myN1100.call();
        myN1100.text();
    }

    @Override
    public void text() {
        System.out.println("Text to your ......!!!");
    }
}
