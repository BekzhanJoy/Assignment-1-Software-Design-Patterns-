public interface Button {
    void render();

    class DarkThemeButton implements Button {
        public void render() {
            System.out.println("Rendering Dark Theme Button");
        }
    }
}
