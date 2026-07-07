package exam_class_extends;

public class Employee {
    private String name;
    private String address;
    private String phoneNumber;
    private int salary;

    public Employee() {}

    public Employee(String name, String address, String phoneNumber, int salary) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "\n이름: " + name + "\n주소: " + address +"\n전화번호: " + phoneNumber + "\n급여: " + String.format("%,d", salary);
    }
}
