package exam_abstract_class_3;

public abstract class MessageSender {
    private String title;
    private String senderName;

    public MessageSender(String title, String senderName) {
        this.title = title;
        this.senderName = senderName;
    }

    public String getTitle() {
        return title;
    }

    public String getSenderName() {
        return senderName;
    }

    public abstract void sendMessage(String content);
}

