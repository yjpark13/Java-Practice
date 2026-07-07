package exam_class_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RandomList {
    public static void main(String[] args) {
        Random random = new Random();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100) + 1);
        }

        System.out.println("정렬 전 list 데이터");
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%-4d", list.get(i));
        }

        Collections.sort(list);

        System.out.println("\n정렬 후 list 데이터");
        for (Integer i : list) {
            System.out.print(i + "\t");
        }
    }
}
