package exam_practice_test;

public class Exam_Practice {

    private String num;
    private String tel;

    public Exam_Practice () {}

    public Exam_Practice (String num, String tel) {
        this.num = num;
        this.tel = tel;

    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String number() {
        return "번호: " + num + "전화번호 : " + tel;
    }

    public static void main(String[] args) {

        Exam_Practice[] practice = new Exam_Practice [2];

        practice [0] = new Exam_Practice("012.123", "010-2430-0235");
        practice [1] = new Exam_Practice("3123", "010-2323-2323");

        for (int i = 0; i < practice.length; i++) {
            System.out.println("정보 : " + practice[i].number());
        }
    }
}
