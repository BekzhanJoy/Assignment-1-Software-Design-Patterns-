public class LightFactory implements UIFactory {
    public Button createButton() {
        return new LightButton();
    }
}
