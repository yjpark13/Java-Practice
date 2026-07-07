package exam_collection_list;

import exam_none_generic_type.Apple;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
       /* ArrayList<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("Java");
        list.add("JSP");
        list.add("SPRING");

        int size = list.size();
        System.out.println("총 객체수: " + size);
        System.out.println();

        list.add(1, "ORACLE");
        list.set(2, "Client programming");
        String data = list.remove(3);
        System.out.println("삭제된 원소: " + data);

        int index = list.indexOf("Java");
        System.out.println(index);

        index = list.lastIndexOf("Java");
        System.out.println(index);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();

        System.out.println("list가 가진 모든 원소를 문자열로 반환");
        System.out.println(list);
        System.out.println();

        ArrayList<Integer> list1 = new ArrayList<Integer>();

        list1.add(23);
        list1.add(94);
        list1.add(Integer.valueOf(62));
        list1.add(Integer.valueOf(45));

        System.out.println();

        list1.add(2, Integer.valueOf(78));

        System.out.println(list1.toString());

        System.out.println();

        ArrayList<Apple> list2 = new ArrayList<Apple>();
        list2.add(new Apple("부사", "빨강"));
        list2.add(new Apple("아오리", "청색"));
        list2.add(new Apple("썸머킹", "황금"));
        list2.add(new Apple("홍로", "빨간"));

        for (int i = 0; i < list2.size(); i++) {

            System.out.print("품종: " + list2.get(i).getKind());

            System.out.println(", 색상: " + list2.get(i).getColor());
        }

        System.out.println();

        for (int i = 0; i < list2.size(); i++) {
            Apple app = list2.get(i);
            System.out.print("품종: " + app.getKind());
            System.out.println(", 색상: " + app.getColor());
        }
        System.out.println();

        for(Apple app : list2) {
            System.out.println(app.toString());
        }
        System.out.println();

        List<Movie> list3 = new ArrayList<Movie>();
        list3.add(new Movie("더 배트맨","★★★★☆ 8.78","맷 리브스",2022));
        list3.add(new Movie("왕과 사는 남자","★★★★☆ 8.87","장항준",2026));
        list3.add(new Movie("더 마블스","★★★☆☆ 7.19","니아 다코스타",2023));

        Movie movie = new Movie();
        movie.setTitle("마이클");
        movie.setRating("★★★★☆ 8.74");
        movie.setDirector("안톤 후쿠아");
        movie.setReleaseYear(2026);
        list3.add(movie);

        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i).toString());
        }
        System.out.println();

        for (Movie value : list3) {
            System.out.println(value.toString());
        }
        System.out.println(); */

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(10);
        list4.add(20);

        //int max = Collections.max(list4);
        //list4.remove(max);
        //System.out.println(list4);

        list4.remove(Collections.max(list4));
        System.out.println(list4);

    }
}
