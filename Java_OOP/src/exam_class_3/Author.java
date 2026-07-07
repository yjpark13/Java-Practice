package exam_class_3;

public class Author {

    // 필드 정의
    private String name;
    private int age;
    private String country;

    // 생성자
    public Author(String name, int age, String country) {

        this.name = name;
        this.age = age;
        this.country = country;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
}