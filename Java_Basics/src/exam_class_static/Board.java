package exam_class_static;

public class Board {
    private static int no;
    private String title;
    private String writer;

    public Board() {}
    public Board(String tittle, String wrier) {
        this.title = tittle;
        this.writer = wrier;
        ++no;
    }

    public static int getNo() {
        return no;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String toString() {
        return no + ". " + title +" " + writer;
    }
}
