public class CinemamanagementApp {
    public static void main(String[] args) {
        Cinemaconfig config = Cinemaconfig.getInstance();
        config.setCinemaName("Arman Cinemas");
        System.out.println("Cinema Name: " + config.getCinemaName());

        MovieFactory regularFactory = new RegularMovieFactory();
        Movie movie = regularFactory.createMovie("1+1");
        System.out.println("Movie: " + movie.getTitle() + ", Type: " + movie.getType());

        UIFactory uiFactory = new DarkThemeFactory();
        Button button = uiFactory.createButton();
        button.render();

        TicketBooking booking = new TicketBooking.TicketBookingBuilder()
                .setMovieTitle("1+1")
                .setSeatNumber("C9")
                .setSnackCombo("Chips and Water")
                .build();
        System.out.println(booking);

        StandardSchedule template = new StandardSchedule();
        template.setTime("21:00");

        MovieSchedule eveningSchedule = template.clone();
        eveningSchedule.setMovie(movie);
        eveningSchedule.printSchedule();

        System.out.println("Cinema Management System initialized.");
    }
}
