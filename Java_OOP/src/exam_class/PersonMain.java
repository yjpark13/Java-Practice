package exam_class;

public class PersonMain {

    public static void main(String[] args) {

        Person p = new Person("홍길동", 56);

        Student s = new Student("한놀들", 41, "99010001");

        ForeignStudent fs = new ForeignStudent("Olivia", 39, "97060004", "U.S.A");

        System.out.print("사람");
        p.show();

        System.out.println("]");

        System.out.print("학생");
        s.show();

        System.out.println("]");

        fs.show();
    }
}