package test;

abstract class Appliance {

     String brand;

     public void powerOn() {
         System.out.println("전원을 켭니다");
     }
     abstract void operate();
}

class WashingMachine extends Appliance {

    @Override
    void operate() {
        System.out.println("세탁기를 작동합니다");
    }
}

public class ApplianceTest {
    public static void main(String[] args) {

        WashingMachine w = new WashingMachine();

        w.powerOn();
        w.operate();
    }
}
