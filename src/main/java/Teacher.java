public class Teacher {
    private String name;
     private  String subject;
    private int students;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setStudents(int students) {
        this.students = students;
    }

    public int getStudents() {
        return students;
    }

    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.setName("ren");
        teacher.getName();
        teacher.setStudents(16);
        teacher.getStudents();
        teacher.setSubject("English");
        teacher.getSubject();
    }
}
