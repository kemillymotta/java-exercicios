package revisao2002.entities;

public class Movies {

    private String movie;
    private int duration;

    public Movies(String movie, int duration) {
        this.movie = movie;
        this.duration = duration;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
