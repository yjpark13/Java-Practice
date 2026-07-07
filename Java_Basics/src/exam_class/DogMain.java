package exam_class;

public class DogMain {

    public static void main(String[] args) {

        // 기본 생성자 사용
        Dog dog1 = new Dog();

        dog1.setName("초코");
        dog1.setBreed("푸들");
        dog1.setAge(3);

        System.out.println(dog1);

        // 전체 생성자 사용
        Dog dog2 = new Dog(
                "콩이",
                "말티즈",
                5
        );

        System.out.println(dog2);

        // 이름, 나이 생성자 사용
        Dog dog3 = new Dog(
                "보리",
                2
        );

        dog3.setBreed("시바견");

        System.out.println(dog3);
    }
}