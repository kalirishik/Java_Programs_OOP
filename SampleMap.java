import java.util.LinkedHashMap;
public class SampleMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> hm=new LinkedHashMap<>();
        hm.put("Apple",101);
        hm.put("paari",102);
        hm.put("banana",103);
        hm.put("Mango",104);
        System.out.println(hm);
        hm.values().remove(102);
        System.out.println(hm);
        hm.compute("Apple",(k,v)->1001);
        System.out.println(hm);
        hm.computeIfAbsent("paari",v->1000);
        System.out.println(hm);
        hm.computeIfPresent("paari",(k,v)->2000);
        System.out.println(hm);
//        LinkedHashMap<Integer,LinkedHashMap<Integer,Integer>> hg=new LinkedHashMap<>();
//        hg.put(101, (101, 201));

    }
}
