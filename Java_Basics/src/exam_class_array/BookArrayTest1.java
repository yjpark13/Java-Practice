package exam_class_array;

public class BookArrayTest1 {
    public static void main(String[] args) {
        Book[] library = new Book[5];

        for(int i = 0; i < library.length; i++) {
            System.out.println(library);
        }
    }
}
