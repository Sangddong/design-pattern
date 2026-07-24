public class Penguin extends Bird {
    public Penguin() {
        setFlyBehavior(new FlyNoWay());
    }
}
