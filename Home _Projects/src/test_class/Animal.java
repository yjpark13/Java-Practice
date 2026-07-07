package test_class;

abstract class animal_name {

    String name;

    public void eat() {

        System.out.println("먹는다");
    }

    abstract void sound();
}

class Dog extends animal_name {

    @Override
    void sound() {

        System.out.println("멍멍");
    }
}

public class Animal {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.sound();
    }
}