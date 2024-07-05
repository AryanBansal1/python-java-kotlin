package OOPS;

public class getterSetter {
    public static void main(String[] args) {
        Bank myacc = new Bank();
        myacc.username ="Aryan";
        System.out.println(myacc.username);
        myacc.setpasswd(1234);
        System.out.println(myacc.getpasswd());

    }
}

class Bank{
    String username;
    private int password;

    // SETTER

    public void setpasswd(int pass) {
        password = pass;
    }

    // GETTER
    public int getpasswd(){
        //return password;
        return this.password;
    }
}
