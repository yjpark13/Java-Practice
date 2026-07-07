package exam_class_3;

public class Book {

    // 필드 정의
    private String title;
    private int page;

    // 객체 포함
    private Author author;
    private Publisher publisher;

    // 생성자
    public Book(String title, int page, Author author, Publisher publisher) {

        this.title = title;
        this.page = page;
        this.author = author;
        this.publisher = publisher;
    }

    // 출력 메서드
    public void show() {

        System.out.println(title + " (총페이지 수: " + page + ")");

        System.out.println(author.getName() + "(" + author.getAge() + ", " + author.getCountry() + ") / " + publisher.getPublisherName() + "(" + publisher.getCountry() + ")"
        );
    }
}