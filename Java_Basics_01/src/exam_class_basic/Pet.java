package exam_class_basic;

public class Pet {
    public String type;
    public String name;
    public int age;

    public void petData(String t, String n, int a) {
        type = t;
        name = n;
        age = a;
    }

    public String toString() {
        return String.format("반려동물 정보 \n 종 : %s\n 이름 = %s\n 나이 = %d",
                type, name, age);
    }
}
