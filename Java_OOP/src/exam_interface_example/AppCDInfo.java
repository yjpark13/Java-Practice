package exam_interface_example;

// Lendable 인터페이스 구현 클래스
public class AppCDInfo extends CDInfo implements Lendable {

    // CD 분류 저장 필드
    private String category;

    // 생성자
    public AppCDInfo(String registerNo, String title, String borrower,
                     String checkOutDate, String state, String category) {

        // 부모 필드 초기화
        super(registerNo, title, borrower, checkOutDate, state);

        // 자식 필드 초기화
        this.category = category;
    }

    // 대출 기능 구현
    @Override
    public void checkOut(String borrower, String date) {

        this.borrower = borrower;
        this.checkOutDate = date;
        this.state = "대출중";

        System.out.println("CD 번호 : " + registerNo);
        System.out.println("CD 제목 : " + title);
        System.out.println("CD 분류 : " + category);
        System.out.println(borrower + "님이 " + date + "에 대출했습니다.");
    }

    // 반납 기능 구현
    @Override
    public void checkIn() {

        this.state = "반납완료";

        System.out.println(title + " CD가 반납되었습니다.");
    }
}