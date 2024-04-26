class SimpleProject{
    String name;
    int rollno;
    public SimpleProject(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }
    public String toString(){
        return "{ Name : "+name+", rollno : "+rollno+"}";
    }
}
public class Practice9 {
    public static void main(String[] args) {
        SimpleProject s=new SimpleProject("parri",60);
        System.out.println(s);
    }
}
