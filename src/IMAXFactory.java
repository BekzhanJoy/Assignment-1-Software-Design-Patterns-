public class IMAXFactory extends MovieFactory {
    public Movie createMovie(String title) {
        return new IMAX(title);
    }
}
