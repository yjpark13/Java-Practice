package exam_class_array;

public class BookArrayTest2 {
    public static void main(String[] args) {

        Book[] library = {
                new Book("태백산맥", "조정래"),
                new Book("데미안", "헤르만 헤세"),
                new Book("어떻게 살 것인가", "유시민"),
                new Book("토지", "박경리"),
                new Book("어린왕자", "생텍쥐페리")
        };

        for( Book book : library) {
            book.showBookInfo();
        }
    }
}
