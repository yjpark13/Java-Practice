package exam_collection_list;

import java.util.HashSet;

public class SetInterfaceTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Milk");
        set.add("Bread");
        set.add("Better");
        set.add("Cheese");
        set.add("Ham");
        set.add("Ham");

        System.out.println(set);


        HashSet<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(3);
        set1.add(4);

        System.out.println(set1);
    }

}
