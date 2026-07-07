package exam_class_basic;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        /*
        myCar.speed = 0;
        myCar.gear = 1;
        myCar.color = "red";
        */

        myCar.carData(10, 5, "white");

        myCar.speedUp(100);
        myCar.printData();
        System.out.println(myCar.toString());
        System.out.println();

        Car yourCar = new Car();

        /*
        yourCar.gear = 3;
        yourCar.speed = 50;
        yourCar.color = "blue";
         */

        yourCar.carData(40,2,"black");

        yourCar.speedDown(30);
        yourCar.printData();
        System.out.println(yourCar.toString());


    }
}
