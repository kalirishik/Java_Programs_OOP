class Room{
    int roomNo;
    String roomType,ACMachine;
    double roomArea;
    public Room(int rn,String rt,String ac,double ra){
        roomNo=rn;
        roomType=rt;
        ACMachine=ac;
        roomArea=ra;
    }
    public String toString(){
        return "{\n Room No : "+roomNo+"\n Room Type : "+roomType+"\n Room Area : "+roomArea+"\n AC Machine : "+ ACMachine+" \n }";
    }
}
public class Practice8 {
    public static void main(String[] args) {
        Room r=new Room(301,"super class","No",3.12);
        System.out.println(r);
    }
}
