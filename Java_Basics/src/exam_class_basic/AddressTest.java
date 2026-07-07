package exam_class_basic;

public class AddressTest {
    public static void main(String[] args) {
        Address add1 = new Address();
        add1.name = "Park YonGJin";
        add1.address = "하남시 위례대로 6길 20";
        add1.phone = "010-2430-0235";
        add1.printData();

        Address add2 = new Address();
        add2.addressData("박용진", " 경기도 하남시 위례광장로 215", " 010-5730-0235");
        System.out.println(add2.toString());
    }
}
