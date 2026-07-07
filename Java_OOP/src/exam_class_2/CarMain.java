package exam_class_2;

public class CarMain {
    public static void main(String[] args) {
        System.out.println("==================== Monata 생산 시작 ====================");

        Monata m1 = new Monata("흰색", 5000, "승용", "NF");
        Monata m2 = new Monata("은색", 7000, "업무", "Brilliant");
        Monata m3 = new Monata("감홍색", 4000, "택시", "EF");
        Monata m4 = new Monata("검정색", 6000, "승용", "Hybrid");

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);


    }
}
