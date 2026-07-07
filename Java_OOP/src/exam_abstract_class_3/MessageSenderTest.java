package exam_abstract_class_3;

public class MessageSenderTest {
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        EMailSender es = new EMailSender("생일을 축하합니다", "고객센터",
                "adim@dukeeshop.co.kr", "javaone@naver.com",
                "10% 할인 쿠폰이 발행 되었습니다.");
        System.out.println(es);


    }
}
