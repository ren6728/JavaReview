public class MicrosoftOutLook {
    static int openMicrosoftOutlook(int x){

        return x+5;
    }
static void closeOutLook(){
    System.out.println("OutLook is closed!");
}
    public static void main(String[] args) {
        System.out.println(openMicrosoftOutlook(3));
        MicrosoftOutLook.closeOutLook();
    }
}
