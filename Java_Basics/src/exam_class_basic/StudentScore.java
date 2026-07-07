package exam_class_basic;

// 학생 클래스
public class StudentScore {

    // =========================
    // 필드 정의
    // =========================

    public String name;

    public int korean;
    public int english;
    public int math;

    public int total;

    // =========================
    // 학생 정보 저장 메서드
    // =========================

    public void studentScoreData(
            String n,
            int k,
            int e,
            int m) {

        name = n;

        korean = k;
        english = e;
        math = m;
    }

    // =========================
    // 총점 계산 메서드
    // =========================

    public void totalData() {

        total = korean + english + math;
    }
}