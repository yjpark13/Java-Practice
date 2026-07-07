package exam_polymorphism;


class A {
    int a = 10;

    void b() {
        System.out.println("A");
    }
}

class AA extends A {
    int a = 20;

    @Override
    void b() {
        System.out.println("AA");
    }

    void c() {
        System.out.println("C");
    }
}

class BB extends A {
    int a = 30;

    @Override
    void b() {
        System.out.println("BB");
    }

    void d() {
        System.out.println("D");
    }
}

class ClassTest {
    public static void main(String[] args) {

        A z = new AA();
        System.out.println(z.a);
        z.b();
        System.out.println();

        ((AA)z).c();
        System.out.println(((AA)z).a);

        AA a1 = (AA) z;
        System.out.println(a1.a);
        a1.c();
        System.out.println();

        z =new BB();
        System.out.println(z.a);
        z.b();
        System.out.println();

        ((BB) z).d();
        System.out.println( ((BB)z).a );

        BB b1 = (BB)z;
        b1.d();
        System.out.println(b1.a);
    }
}
