public class BankAccount {
    private String name;
    private String email;
    private int id;
    private String accountType;

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
        if(id<10){
this.id=11;
        }else{
            this.id=id;
        }
    }

    public int getId() {
        return id;
    }

    public void setAccountType(String accountType) {
        if(accountType=="s"){
this.accountType="Savings Account";
        }else if(accountType=="c"){
            this.accountType="Current Account";
        }
    }

    public String getAccountType() {
        return accountType;
    }

    public static void main(String[] args) {
        BankAccount bak=new BankAccount();
        bak.setName("Bank of America");
        bak.getName();
        bak.setEmail("ameribank123@gmail.com");
        bak.getEmail();
        bak.setId(35);
        bak.getId();
        bak.setAccountType("s");
        bak.getAccountType();
    }
}
