package exam_practice_test;

import java.util.Scanner;
import java.util.ArrayList;

public class Exam_Practice_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> info = new ArrayList<>();
        while (true) {
            System.out.println("정보: ");
            String name = sc.next();

            if (name.equals("clear")) {
                System.out.println("이름을 초기화합니다");
                info.clear();
            } else if (name.equals("exit")) {
                System.out.println("종료합니다");
                break;
            } else {
                if (info.contains(name)) {
                    System.out.println("중복입니다");
                } else {

                    info.add(name);
                    System.out.println("이름을 추가 함다" + name);
                }
            }
        }
        for (int i = 0; i < info.size(); i++) {
            System.out.println(info.get(i));

        }
    }
}
