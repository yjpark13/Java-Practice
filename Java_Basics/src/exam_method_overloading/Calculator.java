package exam_method_overloading;

public class Calculator {

    // 덧셈 메서드
    public int plus(int... values) {

        int total = 0;

        for (int value : values) {

            total += value;
        }

        return total;
    }

    // 뺄셈 메서드
    public int minus(int x, int y) {

        return x - y;
    }

    // 곱셈 메서드
    public int multiply(int... values) {

        int total = 1;

        for (int value : values) {

            total *= value;
        }

        return total;
    }

    // 나눗셈 메서드
    public double divide(int x, int y) {

        return (double)x / y;
    }
}