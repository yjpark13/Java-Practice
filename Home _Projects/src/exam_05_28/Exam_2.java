package exam_05_28;

public class Exam_2 {

    private String name;
    private int score;

    public Exam_2() {}

    public Exam_2(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String info() {
        return name + ":" + score + "점";
    }

    static void main(String[] args) {

        Exam_2[] students = new Exam_2[3];

        students[0] = new Exam_2("김철수", 70);

        students[1] = new Exam_2("이영희", 90);

        students[2] = new Exam_2("박민수", 85);

        for (int i = 0; i < students.length; i++) {

            System.out.println(students[i].info());

        }
    }
}