package exam_class_extends;

public class EmployeeTest {
    public static void main(String[] args) {
      /*  Employee e = new Employee();
        Manager m = new Manager();

        e.setName("Park");
        e.setAddress("위례대로");
        e.setPhoneNumber("010-2432-2323");
        e.setSalary(100000);

        m.setName("Kim");
        m.setAddress("Seoul");
        m.setPhoneNumber("010-2323-2323");
        m.setSalary(12030);
        m.setBonus(2130123);
        m.setJob("work");

        System.out.println(e.toString());
        System.out.println(m.toString());*/

        Employee[] e = {
                new Employee("박용진", "위례대로", "010-2430-0235", 150000),
                new Manager("gick", "seoul", "010-2332-2312", 10000, 1233233, "eofl")
        };

        for(int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
        System.out.println();

        for(Employee ee : e) {
            System.out.println(ee);
        }

    }
}
