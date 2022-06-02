public class Computor {
    public static void main(String[] args) {
Computor myComp=new Computor();
boolean workTime=true;
if(workTime==true){
    myComp.turnOn();
}else if(workTime==false){
    myComp.turnOff();
}
    }
    public void turnOn(){
        System.out.println("Computor is On!");
    }
    public void turnOff(){
        System.out.println("Computor is Off!");

    }
}
