package exam_practice_test;

import java.util.Scanner;
import java.util.ArrayList;

public class Exam_Practice_02 {

    private String name;
    private String phoneNumber;

    public Exam_Practice_02(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "이름 : " + name +
                "\n전화번호 : " + phoneNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Exam_Practice_02> practice02 = new ArrayList<>();

        practice02.add(new Exam_Practice_02("park", "010-2323-2323"));
        practice02.add(new Exam_Practice_02("gorege", "010-1232-2323"));
        practice02.add(new Exam_Practice_02("gell", "010-2323-0232"));

        System.out.print("정보");
        String input = sc.next();
        Exam_Practice_02 real = null;

        for (int i = 0; i < practice02.size(); i++) {
            practice02.get(i);
            System.out.println("하이" + practice02.get(i).toString());
        }
    }
}
  /*          String info2 = info.getName();
            if (info2.equals(input)) {
                real = info;
            }
        }

        if(real != null) {
            real.showInfo();
        } else {
            System.out.println("일치하는 정보가 없습니다.");
        }


    }
} */
