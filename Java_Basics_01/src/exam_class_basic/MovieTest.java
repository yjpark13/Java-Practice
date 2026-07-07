package exam_class_basic;

import java.util.Scanner;

public class MovieTest {
    public static void main(String[] args) {
/*
        Movie m1 = new Movie();
        m1.movieData("범죄도시", "액션", "마동석");

        Movie m2 = new Movie();
        m2.movieData("타이타닉", "로맨스", "레오나르도");
        System.out.println(m1.toString()+m2.toString());

 */
        Scanner input = new Scanner(System.in);

        // Movie 객체 배열
        Movie[] movie = new Movie[2];

        // 입력
        for (int i = 0; i < movie.length; i++) {

            movie[i] = new Movie();

            System.out.println((i + 1) + "번째 영화 정보 입력");

            System.out.print("영화 제목 : ");
            String n = input.nextLine();

            System.out.print("장르 : ");
            String g = input.nextLine();

            System.out.print("출연진 : ");
            String c = input.nextLine();

            // 객체에 저장
            movie[i].movieData(n, g, c);

            System.out.println();
        }

        // 출력
        System.out.println();

        for (int i = 0; i < movie.length; i++) {

            System.out.println(movie[i]);
        }

        input.close();
    }
}


