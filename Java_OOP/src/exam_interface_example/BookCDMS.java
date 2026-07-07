package exam_interface_example;

public class BookCDMS {

    public static void main(String[] args) {

        System.out.println("========== 도서 대출 ==========");

        // 도서 객체 생성
        SeparateVolume book =
                new SeparateVolume(
                        "B001",
                        "자바 프로그래밍",
                        "",
                        "",
                        "대출가능",
                        "홍길동"
                );

        // 도서 대출
        book.checkOut(
                "김철수",
                "2026-05-20"
        );

        System.out.println();

        // 도서 반납
        book.checkIn();

        System.out.println();
        System.out.println("========== CD 대출 ==========");

        // CD 객체 생성
        AppCDInfo cd =
                new AppCDInfo(
                        "CD001",
                        "베스트 앨범",
                        "",
                        "",
                        "대출가능",
                        "발라드"
                );

        // CD 대출
        cd.checkOut(
                "박영희",
                "2026-05-20"
        );

        System.out.println();

        // CD 반납
        cd.checkIn();
    }
}