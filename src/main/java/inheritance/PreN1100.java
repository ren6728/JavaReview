package inheritance;

public abstract class PreN1100 implements SymbianPhone {
    @Override
    public void call() {
        System.out.println("Calling my......");
    }

    @Override
    public void text() {
        System.out.println("Text to ...");
    }
}