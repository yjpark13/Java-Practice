package exam_class_basic;

public class Movie {

    public String movieName;
    public String genre;
    public String cast;

    public void movieData(String mn, String g, String c) {

        movieName = mn;
        genre = g;
        cast = c;
    }

    public String toString() {

        return String.format(
                """
                        ====상영중====
                        영화 : %s
                        장르 : %s
                        출연진 : %s\n""",
                movieName, genre, cast
        );
    }
}
