package exam_interface.example;

import java.util.Arrays;

class Student implements Comparable {
    private String name;
    private int total;

    public Student(String name, int total) {
        this.name = name;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "이름+" + name + " 총점=" + total;
    }

    public int compareTo(Object obj) {
        Student student = (Student) obj;

        if (this.total < student.total)
            return  -1;
        else if (this.total > student.total)
            return 1;
        else
            return 0;
        }
    }
public class StudentSort {
    public static void main(String[] args) {

        int[] numbers = {60, 89, 10, 45, 90};
        Arrays.sort(numbers);

        for(int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        Student[] students = new Student[3];
        students[0] = new Student("홍길동", 270);
        students[1] = new Student("이한솔", 290);
        students[2] = new Student("김희진", 210);
        Arrays.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}