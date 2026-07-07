package exam_multi_type_parameter;

public class ProductExample {
    public static void main(String[] args) {
   /*     Product<Car, String> product1 = new Product<>();
        product1.setKind(new Car());
        product1.getKind().setColor("RED");
        product1.setModel("베뉴");
        System.out.println(product1.toString() + " [color : " + product1.getKind().getColor() +"]");

        Product<Car, String> product1_1 = new Product<>(new Car("RED"), "베뉴");
        System.out.println(product1_1.toString() + " [color : " + product1_1.getKind().getColor() + "]");
        */

        Product<TV, String> product2 = new Product<>();
        product2.setKind(new TV(48));
        product2.setModel("스마트 TV");

        System.out.println(product2 + " ");
        System.out.println(product2.getKind().toString());


        Product<SmartPhone, String> product3 = new Product<>();
        product3.setKind(new SmartPhone("삼성", "안드로이드"));
        product3.setModel("갤럭시 z 플립7");
        System.out.print(product3);
        System.out.println(product3.getKind().toString());

        Product<SmartPhone, String> product3_1 = new Product<>(new SmartPhone("삼성", "안드로이드"), "갤럭시 z 플립6");
        System.out.print(product3_1);
        System.out.println(product3_1.getKind().toString());
    }
}
