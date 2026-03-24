class Account{
    public String name;
    protected String email;
    private String password;

    //getters  & setters;
    public String getPassword(){
        return this.password;
    }
    public String setPassword(String pass){
        this.password = pass;
    }
}
public class oops_04_ {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "anshu";
        account1.email= "anshukr@gmai.com";
        account1.setPassword("Anshu");
        System.out.println(account1.getPassword());

    }
}
