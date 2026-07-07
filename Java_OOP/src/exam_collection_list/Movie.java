package exam_collection_list;

public class Movie {

    private String title;
    private String rating;
    private String director;
    private int releaseYear;

    // 기본 생성자
    public Movie() {
    }

    // 생성자
    public Movie(String title,
                 String rating,
                 String director,
                 int releaseYear) {

        this.title = title;
        this.rating = rating;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {

        return "Movie [제목: "
                + title
                + ", 평점: "
                + rating
                + ", 감독: "
                + director
                + ", 개봉년도: "
                + releaseYear
                + "]";
    }
}