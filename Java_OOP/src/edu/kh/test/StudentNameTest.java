package edu.kh.test;

import java.util.Scanner;
import java.util.ArrayList;

public class StudentNameTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("홍길동");
        studentList.add("김철수");
        studentList.add("이영희");

        while (true) {
            System.out.println("삭제할 이름을 입력하세요");
            String name = sc.next();

            if (name.equals("exit")) {
                System.out.println("<<삭제 종료>>");
                break;
            } else {
                if (studentList.contains(name)) {
                    studentList.remove(name);
                    System.out.println(name + "삭제 완료!");
                } else {
                    System.out.println("존재하지 않는 이름입니다.");
                }
            }
        }

        System.out.println("[남은 수강생 목록]");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

    }
}
