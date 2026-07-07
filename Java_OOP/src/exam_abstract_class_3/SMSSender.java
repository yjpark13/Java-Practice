package exam_abstract_class_3;

public class SMSSender extends MessageSender {
    private String returnPhoneNo;
    private String message;
    private String phoneNumber;

    public SMSSender(String title, String senderName, String returnPhoneNo,
                     String message, String phoneNumber) {

        super(title, senderName);
        this.returnPhoneNo = returnPhoneNo;
        this.message = message;
        this.phoneNumber = phoneNumber;
    }

    @Override

    public void sendMessage(String content) {
        System.out.println("제목" +  getTitle());
        System.out.println("보내는 사람" + getSenderName());
        System.out.println("전화번호 : " + phoneNumber);
        System.out.println("회신 전화번호" + returnPhoneNo);
        System.out.println("메시지 내용 : " + message);

    }
}
