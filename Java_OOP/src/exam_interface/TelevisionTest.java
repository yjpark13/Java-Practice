package exam_interface;

public class TelevisionTest {
    public static void main(String[] args) {

        Television tv = new Television();
        tv.turnOn();
        tv.setVolume(20);
        System.out.println(tv.toString());
        tv.setMute(true);
        tv.turnOff();
        RemoteControl.changeBattery();
        System.out.println();

        Radio rd = new Radio();
        rd.turnOn();
        rd.setVolume(30);
        System.out.println(rd.toString());
        rd.turnOff();
        System.out.println();


        System.out.println("===== 다형성에 의해 데이터 출력 =====");
        RemoteControl rc = new Television();

        rc.turnOn();
        ((Television) rc).printChannel();
        rc.turnOff();
        rc.setVolume(31);

        rc = new Radio();

        rc.turnOn();
        ((Radio) rc).printChannel();
        rc.turnOff();

    }
}
