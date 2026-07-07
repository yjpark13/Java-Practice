package exam_05_28;

import java.util.Scanner;
import java.util.ArrayList;

public class Exam_05 {

    private String id;
    private String name;

    public Exam_05() {

    }

    public Exam_05(String id, String name) {

        this.id = id;
        this.name = name;

    }

    public String getId() {

        return id;

    }

    public String info() {

        return id + "/" + name;

    }
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Exam_05> memberList = new ArrayList<>();

            memberList.add(new Exam_05("user01", "홍길동"));
            memberList.add(new Exam_05("user02", "alscjf"));
            memberList.add(new Exam_05("user03", "김철수"));
            System.out.print("아이디 입력 : ");

            String input = sc.next();

            Exam_05 result = null;

            for (int i = 0; i < memberList.size(); i++) {

                Exam_05 m = memberList.get(i);

                if (input.equals(m.getId())) {

                    result = m;

                }

            }

            if (result != null) {

                System.out.println(result.info());

            } else {

                System.out.println("일치하는 회원이 없습니다.");

            }
        }
}



