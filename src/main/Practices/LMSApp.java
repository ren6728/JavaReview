package main.Practices;

public class LMSApp {
    final static String url="https://izaanschool.moodlecloud.com/";
    final String userName="Admin";
    final String password="junk1234";

    public static void main(String[] args) {
        LMSApp lmsApp=new LMSApp();
        System.out.println("Initial URL value: " + url);
        System.out.println("After re-assigning URL value: " +url);

        LMSLogin lmsLogin=new LMSLogin();
        lmsLogin.login(url,lmsApp.userName,lmsApp.password);
        secure();
    }
    public static void secure(){
        System.out.println("Enhance Security!!!");
    }
}
