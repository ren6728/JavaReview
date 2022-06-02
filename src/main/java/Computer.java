public class Computer {

    public static void main(String[] args) {
        turnOnComputer();
        Computer com =new Computer();
        com.turnOffComputer();
        com.reduceBrightNess(40);
        com.adjustTheVolume(45);
    }
    public static void turnOnComputer(){
        System.out.println("Computer is On!");
    }
    public void turnOffComputer(){
        System.out.println("Computer is Off!");
    }
    public void cleanCache(){
        System.out.println("Cache is cleaned!");
    }
    public void reduceBrightNess(int percentage){
        System.out.println("BrightNess reduced at " + percentage + "% .");
    }
    public void playMusic(){
        System.out.println("Music is On!");
    }
    public void adjustTheVolume(int adjustVolume){
        System.out.println("Adjusted Volume to "+ "% .");


    }
}
