abstract  class Marks{
    abstract  double getPercentage();
}
class Student_A extends Marks{
    double s1,s2,s3;
    public Student_A(double s1,double s2,double s3){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    public double getPercentage(){
        return (s1+s2+s3)/3;
    }
}
class Student_B extends Marks{
    double s1,s2,s3,s4;
    public Student_B(double s1,double s2,double s3,double s4){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
        this.s4=s4;
    }
    public double getPercentage(){
        return (s1+s2+s3+s4)/3;
    }
}

public class Practice3 {
    public static void main(String[] args) {
        Student_A a=new Student_A(56,78,90);
        Student_B b=new Student_B(90,78,65,50);
        System.out.println(a.getPercentage());
        System.out.println(b.getPercentage());
    }
}
