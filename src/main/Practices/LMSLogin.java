package main.Practices;

public class LMSLogin {
    public void login(String url,String userName,String password){
        if (url.equals("https://izaanschool.moodlecloud.com/")) {
            System.out.println(url+" is Valid URL");
        }else{
            System.out.println(url +" invalid URL");
        }
        if(userName.equals("Admin")){
            System.out.println(userName+ " is valid userName");
        }else {
            System.out.println(userName+ " is invalid userName");
        }
        if(password.equals("junk124")){
            System.out.println(password+" is valid password");
        }else{
            System.out.println(password +" is invalid password");
        }

        if(url.equals("https://izaanschool.moodlecloud.com/")&&userName.equals("Admin")&&password.equals("junk124")){
            System.out.println(" Log in using"+url+", "+userName + ", "+ password);
            System.out.println("User "+ userName + " is a valid user");

        }else{
            System.out.println("Invalid Credential!!! Try Later");
        }

    }
}
