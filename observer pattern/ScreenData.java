import java.util.ArrayList;
import java.util.List;

public class ScreenData implements ScreenSubject {
    private List<ScreenObserver> observers;

    private Coffee coffee;
    private Cake cake;
    private Ad ad;

    public ScreenData() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(ScreenObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(ScreenObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (ScreenObserver observer : observers) {
            // Push
            observer.update(coffee, cake, ad);

            // Pull
            observer.update();
        }
    }

    public void screenDataChanged() {
        notifyObservers();
    }

    public void setScreenData(Coffee coffee, Cake cake, Ad ad) {
        this.coffee = coffee;
        this.cake = cake;
        this.ad = ad;
        screenDataChanged();
    }

    // Pull
    public Coffee getCoffee() {
        return coffee;
    }

    public Cake getCake() {
        return cake;
    }

    public Ad getAd() {
        return ad;
    }
}
