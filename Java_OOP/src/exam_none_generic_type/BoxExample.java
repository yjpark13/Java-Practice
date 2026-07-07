package exam_none_generic_type;

import exam_none_generic_type.Apple;

public class BoxExample {
    private static Object box;

    public static void main(String[] args) {
        Box<String> box1 = new Box<>("Hello");
        String str = box1.get();
        System.out.println(str);

        Box<Integer> box2 = new Box<Integer>();
        box2.set(6);
        int value = box2.get();
        System.out.println(value);

        Box<Apple> box3 = new Box<Apple>(new Apple("부사", "청색"));
        Apple app = box3.get();
        System.out.println(app.toString());

        Box<Double> box4 = new Box<Double>();
        box4.set(3.6);
        double data = box4.get();
        System.out.println(data);

        Box<Integer> box5 = new Box<Integer>();
        box5.set(5);
        System.out.println(box5.get());
    }
}
