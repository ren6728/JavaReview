public class Car {
    private int number;
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        if(number<5){
            this.number=6;
            //System.out.println("Default number 6.");
        }else{
            this.number=number;
        }
    }
    public int getNumber(){
        return number;
    }

    public static void main(String[] args) {
        Car obj1=new Car();
        obj1.setName("TOYOTA");
        System.out.println("Name: " + obj1.getName());
        obj1.setNumber(5);
        System.out.println("Number: "+ obj1.getNumber());

        obj1.setNumber(3);
    }
}
