package exam_class;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog() {}

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {

        return "나의 반려견 ["
                + "이름 = " + this.name
                + ", 강아지 종 = " + this.breed
                + ", 나이 = " + this.age
                + "]";
    }

}
