package exam_class_array;

import java.util.Scanner;

public class ScoreArrayMethodExample {
    public static void main(String[] args) {
        final int STUDENTS = 5;
        int[] scores = new int[STUDENTS];

        getValues(scores);
        getAverage(scores);
    }

    public static void getValues(int[] scores) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < scores.length; i++) {
            System.out.print((i+1) + "번 학생의 컴퓨터 점수를 입력하세요: \n");
            int temp = scan.nextInt();

            if (temp < 0 || temp > 100) {
                System.out.println("[오류] 0~100 사이의 점수를 입력하세요.");
                i--;
                continue;
            }
            scores[i] = temp;
        }

    }


    public static void getAverage(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total +=score;
        }
        double average = (double) total / scores.length;
        System.out.printf("\n전체 학생의 평균 성적은 %.2f입니다.\n" ,average);
    }
}

