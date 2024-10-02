public class StandardSchedule implements MovieSchedule {
    private Movie movie;
    private String time;

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public MovieSchedule clone() {
        try {
            return (MovieSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void printSchedule() {
        System.out.println("Movie: " + movie.getTitle() + ", Time: " + time);
    }
}
