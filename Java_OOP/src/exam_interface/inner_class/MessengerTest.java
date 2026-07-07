package exam_interface.inner_class;

public class MessengerTest {
    public static void main(String[] args) {
        Messenger test = new Messenger(){
            @Override
            public String getMessage() {
                return "힘들지만 오늘도 최선을 다해......";
            }

            @Override
            public void setMessage(String msg) {
                System.out.println("설정된 메시지 내용: " + msg);
            }
        };
        System.out.println(test.getMessage());
        test.setMessage("오늘도 파이팅가리~~!");
    }
}
