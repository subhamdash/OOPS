import java.util.HashSet;
import java.util.Set;

public class Sets {
    /*Creation : HashSet<String> hs = new HashSet<>();
Add element : hs.add(“gopha ok”);
Search element: hs.contains(“gopha ok”);

Even in recursion the Set are referenced a new copy is not created hence if we need to modify a set we need
to create it using a new Keyword.

*/



        public static void main(String[] args) {
            Set<Integer> originalSet = new HashSet<>();
            originalSet.add(1);
            originalSet.add(2);
            originalSet.add(3);

            //Set<Integer> copiedSet = originalSet;
            Set<Integer> copiedSet = new HashSet<>(originalSet);
            modifySet(copiedSet);

            System.out.println("Original Set: " + originalSet);
            System.out.println("Copied Set: " + copiedSet);
        }

        private static void modifySet(Set<Integer> set) {
            set.add(4);
            set.remove(2);
        }
}

