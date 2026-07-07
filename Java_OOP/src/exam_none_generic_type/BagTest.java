package exam_none_generic_type;


class Bag<T> {
    private T item;

    public Bag(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    void showType() {
        System.out.println("T의 타입은 " + item.getClass().getSimpleName());
    }
}

class Book {
    private String title;
    private String writer;

    public Book() {}
    public Book(String title, String writer) {
        this.title = title;
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", writer=" + writer + "]";
    }
}

class PencilCase {
    private String brand;
    private String kind;

    public PencilCase() {}
    public PencilCase(String kind, String brand) {
        this.kind = kind;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "PencilCase [brand=" + brand + ", kind=" + kind + "]";
    }
}

class Notebook {
    private String make;
    private String size;

    public Notebook() {}
    public Notebook(String make, String size) {
        this.make = make;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Notebook [make=" + make + ", size=" + size + "]";
    }
}

public class BagTest {
    public static void main(String[] args) {
        Bag<Book> bag = new Bag<>(new Book("마음의 세탁소","황웅근"));
        Bag<PencilCase> bag2 = new Bag<>(new PencilCase("룬룬필통", "시크그레이"));
        Bag<Notebook> bag3 = new Bag<>(new Notebook("모닝글로리", "A4"));

        bag.showType();
        bag2.showType();
        bag3.showType();
        System.out.println();

        System.out.println(bag.getItem().toString());
        System.out.println(bag2.getItem().toString());
        System.out.println(bag3.getItem().toString());
    }
}