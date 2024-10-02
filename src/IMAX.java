public class IMAX implements Movie {
    private String title;

    public IMAX(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return "IMAX";
    }
}
