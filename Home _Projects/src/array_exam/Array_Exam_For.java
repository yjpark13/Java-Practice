package array_exam;

public class Array_Exam_For {
    public static void main(String[] args) {
        int[] num = { 80, 90, 100, 70, 60 };
        int total = 0;

        for(int score: num) {
            total += score;

        }

        System.out.println("총합 : " + total);
    }
}
