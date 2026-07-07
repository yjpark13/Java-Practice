package exam_interface_example;

// 음악 CD 클래스
public class MusicCDInfo extends CDInfo {

    // 가수 이름 저장 필드
    private String artist;

    // 생성자
    public MusicCDInfo(String registerNo, String title,String borrower,
                       String checkOutDate, String state, String artist) {

        // 부모 생성자 호출
        super(registerNo, title, borrower, checkOutDate, state);

        // 필드 초기화
        this.artist = artist;
    }

    // 출력 메서드
    public void showInfo() {
        System.out.println("관리번호 : " + registerNo);
        System.out.println("제목 : " + title);
        System.out.println("가수 : " + artist);
    }
}