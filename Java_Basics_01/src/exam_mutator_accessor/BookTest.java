package exam_mutator_accessor;

import java.util.Scanner;

public class BookTest {

    // Scanner 객체 생성
    public static Scanner scanner =
            new Scanner(System.in);

    // 메인 메서드
    public static void main(String[] args) {

        // 객체 생성
        Book book = new Book();

        // 입력 메서드 호출
        inputData(book);

        // 출력
        System.out.println(book);
    }

    // 입력 메서드
    public static void inputData(Book book) {

        // 책 제목 입력
        System.out.print("책 제목 입력 : ");
        String title = scanner.nextLine();

        // 책 가격 입력
        System.out.print("책 가격 입력 : ");
        int price = scanner.nextInt();

        // setter 이용 값 저장
        book.setTitle(title);
        book.setPrice(price);
    }
}