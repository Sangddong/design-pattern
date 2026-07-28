public class BaconOption extends OptionDecorator {
    public BaconOption(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getName() {
        return burger.getName() + ", Bacon";
    }

    @Override
    public double price() {
        return burger.price() + 0.3;
    }
}
