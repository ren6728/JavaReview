package main.Practices;

public class StaticDemo3 {
    String name;
    int rollNo;
    static String cllgName;
    static int counter=0;
    public StaticDemo3 (String name){
        this.name=name;
        this.rollNo=setRollNo();
    }
    static int setRollNo(){
        counter++;
        return counter;
    }
    static void setCllgName(String name){
cllgName=name;
    }
    void getStaticDemo3Info(){
        System.out.println("name: "+ this.name);
        System.out.println("rollNo: "+ this.rollNo);
        System.out.println("cllgName: "+ cllgName);
    }

    public static void main(String[] args) {
        StaticDemo3.setCllgName("xyz");
        StaticDemo3 s1=new StaticDemo3("Alice");
        StaticDemo3 s2=new StaticDemo3("Bob");
        s1.getStaticDemo3Info();
        s2.getStaticDemo3Info();

    }
}
