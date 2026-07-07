package exam_inheritance;

import exam_class_extends_check.Person;

public class Employee extends Person {
    private String departmentName;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String toString() {
        return super.toString() + ":" + getDepartmentName();
    }
}
