package exam_class;

public class Student extends Person {

    private String grade;

    public Student(String name, int age, String grade) {

        super(name, age);

        this.grade = grade;
    }

    @Override
    public void show() {

        super.show();

        System.out.print(", 학번 : " + grade);
    }
}