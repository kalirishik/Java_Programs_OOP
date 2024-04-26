class Paari{
    String name;
    public Paari(String name){
        this.name=name;
    }
    public String toString(){
        return this.name;
    }
}

public class Practice11 {
    public static void main(String[] args) {
        Paari p=new Paari("Paari -- Good boy");
        System.out.println(p);
    }
}
