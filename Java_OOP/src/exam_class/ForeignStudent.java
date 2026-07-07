package exam_class;

public class ForeignStudent extends Student {

    private String nationality;

    public ForeignStudent(String name, int age, String grade, String nationality) {

        super(name, age, grade);

        this.nationality = nationality;
    }

    @Override
    public void show() {

        System.out.print("외국학생");

        super.show();

        System.out.println(", 국적 : " + nationality + "]");
    }
}