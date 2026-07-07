package test_class;

public class CarTest {

    private String color;
    private int speed;

    public CarTest(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

 /*   public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    } */

    public static void main(String[] args) {

        CarTest c1 = new CarTest("red", 100);

        c1.showInfo();
    }

    public void showInfo() {
        System.out.println("자동차 색상: " + color);
        System.out.println("자동차 속도 : " + speed);
    }
}
