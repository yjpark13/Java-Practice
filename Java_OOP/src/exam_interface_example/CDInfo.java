package exam_interface_example;

// CD 공통 부모 클래스
public class CDInfo  {
    // 관리번호 저장 필드
    protected String registerNo;
    // 제목 저장 필드
    protected String title;
    protected String borrower;
    protected String checkOutDate;
    protected String state;

    public CDInfo(String registerNo, String title, String borrower,
                  String checkOutDate, String state) {
        this.registerNo = registerNo;
        this.title = title;
        this.borrower = borrower;
        this.checkOutDate = checkOutDate;
        this.state = state;
    }
}
