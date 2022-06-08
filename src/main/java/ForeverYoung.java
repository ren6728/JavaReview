public class ForeverYoung {
    private String message;
    private String name;
    private int age;

    public void setMessage(String message) {
        this.message = message;
    }

    public String  getMessage() {
        return message;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public void  getAge() {
        if (age > 18) {
            System.out.println(message);
        } else {
            System.out.println(age);;
        }
    }

    public static void main(String[] args) {
        ForeverYoung obj1=new ForeverYoung();
        obj1.setMessage("Age is just number.");
        obj1.getMessage();
        obj1.setAge(19);
        obj1.setName("Melanie");
        obj1.getAge();
        obj1.getName();


    }
}
