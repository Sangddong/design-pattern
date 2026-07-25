public interface ScreenObserver {
    // Pull
    void update();

    // Push
    void update(Coffee coffee, Cake cake, Ad ad);
}
