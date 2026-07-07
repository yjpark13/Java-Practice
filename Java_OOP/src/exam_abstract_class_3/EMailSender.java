package exam_abstract_class_3;

public class EMailSender extends MessageSender {
    private String senderAddr;
    private String emailBody;
    private String person;

    public EMailSender(String title, String senderName, String senderAddr,
                       String emailBody, String person) {
        super(title, senderName);
        this.senderAddr = senderAddr;
        this.emailBody = emailBody;
        this.person = person;
    }

    @Override
    public void sendMessage(String content) {

        System.out.println("제목 : " + getTitle());

        System.out.print("보내는 사람 : " + getSenderName());

        System.out.println(senderAddr);

        System.out.println("받는 사람 " + person);

        System.out.println("내용 : " + emailBody);

    }
}

