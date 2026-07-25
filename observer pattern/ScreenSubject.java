public interface ScreenSubject {
    void addObserver(ScreenObserver o);

    void removeObserver(ScreenObserver o);

    void notifyObservers();
}
