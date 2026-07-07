package test_class;

public class Movie {
    private String title;
    private String director;
    private String runningTime;

    public Movie(String title, String director, String runningTime) {
        this.title = title;
        this.director = director;
        this.runningTime = runningTime;
    }
    public String getTitle() {
        return getTitle();
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getRunningTime() {
        return runningTime;
    }
    public void setRunningTime(String runningTime) {
        this.runningTime = runningTime;
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("네", " 안녕", " 130분");
        Movie m2 = new Movie("응", "그래", "와우");

        m1.showInfo();
        m2.showInfo();
    }

    public void showInfo() {
        System.out.println("영화 제목 : " + title + "\t 감독 : " + director + "상영시간 " + runningTime + "분");
    }
}
