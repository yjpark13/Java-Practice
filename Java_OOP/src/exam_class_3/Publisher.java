package exam_class_3;

public class Publisher {

    // 필드 정의
    private String publisherName;
    private String country;

    // 생성자
    public Publisher(String publisherName, String country) {

        this.publisherName = publisherName;
        this.country = country;
    }

    // getter
    public String getPublisherName() {
        return publisherName;
    }

    public String getCountry() {
        return country;
    }
}