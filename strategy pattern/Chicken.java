public class Chicken extends Bird {
    public Chicken() {
        setFlyBehavior(new FlyNoWay());
    }
}
