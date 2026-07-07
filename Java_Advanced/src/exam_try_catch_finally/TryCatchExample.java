package exam_try_catch_finally;

import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int number = 0;
            while(true)
            {
                try {

                    System.out.print("정수를 입력해 주세요.");

                    String input = scanner.nextLine();


                    if (input.isBlank()) {
                        System.out.println("입력값이 없습니다. 정수를 입력해 주세요.");
                        continue;
                    }
                    number = Integer.parseInt(input);

                    break;

                } catch (NumberFormatException e) {

                    System.out.println("잘못된 입력입니다. 정수를 입력해 주세요>");
                }
            }

            System.out.println("입력 받은 수: " + number);
            scanner.close();
    }
}



