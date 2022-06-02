public class TextEditor {
    double RR(double a, double b) {
        double sum = 0;
        sum = (a + b) / 2.0;

        // Return statement as we already above have declared
        // return type to be double
        return sum;
    }
    public TextEditor openTextEditor(){
        TextEditor TxE=new TextEditor();
        return TxE;
    }
    public  static void writeIntoTextFile(String text){
        System.out.println("Text is: "+ text);
    }
    public void closeTextEditor(){
        System.out.println("Close Texteditor!");
    }

    public static void main(String[] args) {
        System.out.println(new TextEditor().RR(5.1,5.2));
    TextEditor txd=new TextEditor();
    txd.writeIntoTextFile("abr...");
        writeIntoTextFile("i love java");
        txd.closeTextEditor();
    }
}
