public class CheeseOption extends OptionDecorator {
    public CheeseOption(Burger burger) {
        this.burger = burger;
    }

    @Override
    public String getName() {
        return burger.getName() + ", Cheese";
    }

    @Override
    public double price() {
        return burger.price() + 0.15;
    }
}
