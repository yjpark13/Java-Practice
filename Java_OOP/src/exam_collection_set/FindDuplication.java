package exam_collection_set;

import java.util.HashSet;
import java.util.Set;

public class FindDuplication {
    public static void main(String[] args) {
        String[] sample = { "단어", "의미", "구절", "의미", "단략" };

        Set<String> set = new HashSet<>();

        for (String word : sample) {
            if (!set.add(word)) {
                System.out.println("중복된 단어: " +word);
            }
        }
        System.out.println("단어 수 : " + set.size());
        System.out.println("중복되지 않은 단어: " + set);


    }
}
