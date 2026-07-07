package exam_super;

class ParentAccount {
    protected int money;

    public ParentAccount() {
        money = 10000;
    }

    public void printMoney() {
        System.out.println("부모 클래스의 printMoney() 메서드");
    }
}

class ChildAccount extends ParentAccount {
    protected int money;

    public ChildAccount() {
        money = 5000;
    }

    @Override
    public void printMoney() {
        int money = 1000;

        super.printMoney();

        System.out.println("자식 클래스의 printMoney() 메소드");
        System.out.println("지역 변수 money : " + String.format("%,d", money));
        System.out.println("자식 클래스의 money : " + String.format("%,d", this.money));
        System.out.println("부모 클래스의 money : " + String.format("%,d", super.money));
    }
}

public class ChildClassTest {
    public static void main(String[] args) {
        ChildAccount account = new ChildAccount();
        account.printMoney();
    }
}