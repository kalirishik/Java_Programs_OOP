abstract class Bank{
    abstract String getBalance(int r);
}
class Bank_A extends Bank{
     String getBalance(int r){
        return "Bank A have $"+r;
    }
}
class Bank_B extends Bank{
    String getBalance(int r){
        return "Bank B have $"+r;
    }
}
class Bank_C extends Bank{
    String getBalance(int r){
        return "Bank C have $"+r;
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Bank_A a=new Bank_A();
        Bank_B b=new Bank_B();
        Bank_C c=new Bank_C();
        System.out.println(a.getBalance(100));
        System.out.println(a.getBalance(150));
        System.out.println(a.getBalance(200));
    }
}
