import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        People people1 = new People("choi", 26);
        People people2 = new People("choi", 26);

        Set<People> hashSet = new HashSet<>();
        HashMap<People,String> hashMap = new HashMap<>();
        hashSet.add(people1);
        hashSet.add(people2);
        hashMap.put(people1,"Seoul");
        hashMap.put(people2,"Busan");

        System.out.println("hashSet.size() : " + hashSet.size());
        System.out.println("hashMap.size() : " + hashMap.size());
        System.out.println("people1.hashCode(), people2.hashCode() : "
                + people1.hashCode() + " " + people2.hashCode());
        System.out.println("identityHashCode(people1), identityHashCode(people2) : "
                + System.identityHashCode(people1) + " " + System.identityHashCode(people2));
        System.out.println("people1==people2 : " + (people1 == people2));
        System.out.println("people1.equals(people2) : " + people1.equals(people2));
    }
}
