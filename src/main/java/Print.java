public class Print {
    public static void printInfo(String name,int age,long phNumber,int salary ){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("phNumber: "+ phNumber);
        System.out.println("Salary: " + age);
    }
    public static void bonus(int salary){
int salaryWithBonus=salary+salary*5/100;
        System.out.println("Salary with bonus is : " + salaryWithBonus);

    }

    public static void main(String[] args) {
        printInfo("noshin",21,120235400,12000);
        bonus(12000);
    }
}
