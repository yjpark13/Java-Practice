package exam_class_3;

public class BookMain {

    public static void main(String[] args) {

        Author author = new Author("홍길동", 42, "Korea");

        Publisher publisher = new Publisher("Infinity", "Korea");

        Book book = new Book("Do it! 자바", 700, author, publisher);

        System.out.println("책정보는 다음과 같다.");

        book.show();
    }
}