package exam_05_28;

public class Exam_3 {

    private String title;
    private String writer;

    public Exam_3(String title, String writer) {

        this.title = title;
        this.writer = writer;

    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;

    }

    public String bookInfo() {

        return title + " / " + writer;
    }
    public static void main(String[] args) {

        Exam_3[] books = new Exam_3[3];

        books[0] = new Exam_3("자바의 정석", "남궁성");

        books[1] = new Exam_3("혼공자", "신용권");

        books[2] = new Exam_3("이것이 자바다", "ho");

        for (int i = 0; i < books.length; i++) {

            System.out.println(books[i].bookInfo());

        }

    }

}