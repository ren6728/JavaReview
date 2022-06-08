public class Employee {
    private String name;
    private String email;
    private int id;
    private float salary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        if (id > 50) {
            this.id = 0;
        } else {
            this.id = id;
        }
    }

    public int getId() {
        return id;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void getSalary() {
        if (salary > 10000 || salary < 5000) {
            System.out.println("It is not a good manner to ask someone's salary");
        } else {
            System.out.println(salary);
        }
    }

    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setName("Abby");
        emp.getName();
        emp.setEmail("ren123@gmail.com");
        emp.getEmail();
        emp.setId(101);
        emp.getId();
        emp.setSalary(10001);
        emp.getSalary();
    }
}
