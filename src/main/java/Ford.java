public class Ford extends CarClass {
    @Override
    public int speedLimit() {
        return 150;
    }

    public static void main(String[] args) {
        CarClass obj=new Ford();
        obj.speedLimit();
        System.out.println(obj.speedLimit());
        int num =obj.speedLimit();
        System.out.println(num);


    }
}
