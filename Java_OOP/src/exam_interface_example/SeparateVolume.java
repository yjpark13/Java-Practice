package exam_interface_example;

// Lendable 인터페이스 구현 클래스
public class SeparateVolume extends CDInfo implements Lendable {

    // 저자 저장 필드
    private String writer;

    // 생성자
    public SeparateVolume(String registerNo, String title, String borrower,
                          String checkOutDate, String state, String writer) {

        // 부모 필드 초기화
        super(registerNo, title, borrower, checkOutDate, state);

        // 자식 필드 초기화
        this.writer = writer;
    }

    // 대출 기능 구현
    @Override
    public void checkOut(String borrower, String date) {

        this.borrower = borrower;
        this.checkOutDate = date;
        this.state = "대출중";

        System.out.println("도서번호 : " + registerNo);
        System.out.println("책 제목 : " + title);
        System.out.println("저자 : " + writer);
        System.out.println(borrower + "님이 " + date + "에 대출했습니다.");
    }

    // 반납 기능 구현
    @Override
    public void checkIn() {

        this.state = "반납완료";

        System.out.println(title + " 책이 반납되었습니다.");
    }
}