package exam_class;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListExample {

    public static void main(String[] args) {

        // Double 타입 저장 리스트 생성
        ArrayList<Double> list = new ArrayList<>();

        // 입력 객체 생성
        Scanner scan = new Scanner(System.in);

        // 입력 단계
        for (int i = 1; i <= 10; i++) {

            System.out.printf("(%d번째)심사위원의 점수: ", i);

            double value = scan.nextDouble();

            // 점수 범위 검사
            if (value < 0.0 || value > 10.0) {

                System.out.println(
                        "[오류] 점수는 0.0에서 10.0 사이여야 합니다. 다시 입력하세요."
                );

                i--;
                continue;
            }

            // 리스트 저장
            list.add(value);
        }

        // 최대값
        double max = Collections.max(list);

        // 최소값
        double min = Collections.min(list);

        // 최대값 위치 찾기
        int maxIndex = list.indexOf(max);

        // 최대값 삭제
        list.remove(maxIndex);

        // 최소값 위치 찾기
        int minIndex = list.indexOf(min);

        // 최소값 삭제
        list.remove(minIndex);

        // 합계 계산
        double sum = 0.0;

        for (double score : list) {

            sum += score;
        }

        // 결과 출력
        System.out.printf("\n점수의 합: %.1f\n", sum);

        // Scanner 종료
        scan.close();
    }
}