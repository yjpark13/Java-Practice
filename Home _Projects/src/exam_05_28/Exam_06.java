package exam_05_28;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam_06 {
    private String title;
    private String writer;

    public Exam_06() {

    }

    public Exam_06(String title, String writer) {

        this.title = title;
        this.writer = writer;

    }

    public String getTitle() {
        return title;
    }

    public String bookInfo() {
        return title + "/" + writer;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Exam_06> bookList = new ArrayList<>();

        bookList.add(new Exam_06("자바", "홍길동"));

        bookList.add(new Exam_06("SQL", "김철수"));

        bookList.add(new Exam_06("HTML", "good"));

        System.out.print("도서명 입력 : ");

        String input = sc.next();

        Exam_06 result = null;

        for (int i = 0; i < bookList.size(); i++) {

            Exam_06 b = bookList.get(i);



            if (input.equals(b.getTitle())) {

                result = b;

            }

        }

        if (result != null) {

            System.out.println("검색 결과 : " + result.bookInfo());

        } else {

            System.out.println("일치하는 도서가 없습니다.");

        }

    }

}




