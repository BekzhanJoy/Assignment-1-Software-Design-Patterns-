public class Cinemaconfig {
    private static Cinemaconfig instance;
    private String cinemaName;
    private int numberOfScreens;

    private Cinemaconfig() {}

    public static synchronized Cinemaconfig getInstance() {
        if (instance == null) {
            instance = new Cinemaconfig();
        }
        return instance;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public int getNumberOfScreens() {
        return numberOfScreens;
    }

    public void setNumberOfScreens(int numberOfScreens) {
        this.numberOfScreens = numberOfScreens;
    }
}
