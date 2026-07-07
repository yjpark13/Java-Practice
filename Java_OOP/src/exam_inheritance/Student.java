package exam_inheritance;

import exam_class_extends_check.Person;

public class Student extends Person {
    private String major;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() {
        return super.toString() + ":" + getMajor();
    }
}
