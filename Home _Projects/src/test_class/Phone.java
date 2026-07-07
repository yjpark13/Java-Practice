package test_class;

public class Phone {
    private String brand;
    private int price;

    public Phone (String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Phone p1 = new Phone("삼성", 120);
        Phone p2 = new Phone("아이폰", 140);


        p1.showInfo();
        p2.showInfo();
    }

    public void showInfo() {
        System.out.println("브랜드 : " + brand);
        System.out.println("가격 : " + price);
    }
}
