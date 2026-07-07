package exam_class_2;

public class Car {
    private String color;
    private int account;

    public Car() {}

    public Car(String color, int account) {
        this.color = color;
        this.account = account;
    }

    public String toString() {
        return "[색상]" + color + "\t[생산 수량]" + account;
    }
}
