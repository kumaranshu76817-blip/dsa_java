import java.util.HashSet;
import java.util.Iterator;

public class hashSet_01 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2); 
        set.add(3);
        set.add(2); // Duplicate, will not be added

        System.out.println("size of set: " + set.size()); // Output: 3

        //print all elements in the set
        System.out.println(set); // Output: [1, 2, 3]

        //Iterator
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //has

        if(set.contains(2)) {
            System.out.println("Set contains 2");
        }

        if(set.contains(6)) {
            System.out.println("Set contains 6");
        } else {
            System.out.println("Set does not contain 6");
        }
        set.remove(2);
        if(!set.contains(2)) {
            System.out.println("Set does not contain 2");
        }

    }
}
