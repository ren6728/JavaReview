public class StudentInfo {
    String name;
    String email;

    public StudentInfo(String n, String e) {
        name = n;
        email = e;

    }
    public void print(){
        System.out.println("Student's Name: " +name+", email: " +email);
    }
    public void watchClassVideo(int count){
        System.out.println(name+ ": You are watching class # " +count);
    }
    public static void main(String[] args) {
        StudentInfo studentInfo1= new StudentInfo("Jamal", "jamal@mail.com");
        studentInfo1.print();
        StudentInfo studentInfo2= new StudentInfo("Aashique", "aashique@mail.com");
        studentInfo2.print();
        studentInfo1.watchClassVideo( 5);
        studentInfo2.watchClassVideo(4);
    }
}
