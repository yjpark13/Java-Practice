package exam_class;

public class TVMain {
    public static void main(String [] args) {
        TV myTV = new TV("LG", 2025, 65);
        myTV.show();

        TV tv = new TV();
        tv.setManufacturer("삼성");
        tv.setYear(2026);
        tv.setSize(32);
        tv.show();
    }
}
