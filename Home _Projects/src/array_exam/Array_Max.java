package array_exam;

public class Array_Max {
    public static void main(String[] args) {
        int[] num = { 45, 72, 10, 99, 28 };
        int max = num[0];

        for(int i = 0; i < num.length; i++) {

            if(num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("최댓값 : " + max);
    }
}
