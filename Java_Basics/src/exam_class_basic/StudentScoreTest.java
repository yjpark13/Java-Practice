package exam_class_basic;

public class StudentScoreTest {

    public static void main(String[] args) {

        // =========================
        // 객체 생성
        // =========================

        StudentScore s1 = new StudentScore();

        // =========================
        // 학생 정보 저장
        // =========================

        s1.studentScoreData(
                "홍길동",
                90,
                85,
                100
        );

        // =========================
        // 총점 계산
        // =========================

        s1.totalData();

        // =========================
        // 평균 계산
        // =========================

        double avg = s1.total / 3.0;

        // =========================
        // 학점 변수
        // =========================

        char grade;

        // =========================
        // 학점 계산
        // =========================

        switch ((int)avg / 10) {

            case 10, 9 -> grade = 'A';

            case 8 -> grade = 'B';

            case 7 -> grade = 'C';

            case 6 -> grade = 'D';

            default -> grade = 'F';
        }

        // =========================
        // 출력
        // =========================

        System.out.println("====================================================");

        System.out.println(
                "이름\t국어\t영어\t수학\t총점\t평균\t학점"
        );

        System.out.println("====================================================");

        System.out.printf(
                "%s\t%d\t%d\t%d\t%d\t%.1f\t%c",

                s1.name,
                s1.korean,
                s1.english,
                s1.math,
                s1.total,
                avg,
                grade
        );
    }
}