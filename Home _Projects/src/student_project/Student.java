package student_project;

public class Student {
    String name;
    int age;

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "홍길동";
        s1.age = 20;

        s1.showInfo();
    }

    public void showInfo() {

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}


