public class Practice12 {
    public static void say(String s){
        System.out.println("static method "+s);
    }
    static{
        System.out.println("It is Practice2 class");
    }
    static int i=10;
    public static  void add(int v){
        i+=v;
    }
    public static void main(String[] args) {
        say("hii");
        System.out.println("before Static i :"+i);
        add(100);
        System.out.println("after 100 add in Static i :"+i);
    }
}
