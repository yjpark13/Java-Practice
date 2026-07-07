package exam_method;

class CallByValue{
    public void change(int x, int y) {
        System.out.println("\nBefore Change X = " + x + " Y = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After change X = " + x + " Y = " + y);

    }
}

public class CallByValueExample {
    public static void main(String[] args) {
        CallByValue cv = new CallByValue();

        int x = 10;
        int y = 20;
        System.out.println("\n호출전 Main X = " + x + " Y = " + y);

        cv.change(x,y);
        System.out.println("\n호출후 Main X = " + x + " Y = " + y);
    }
}