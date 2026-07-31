public abstract class BurgerStore {
    public Burger orderBurger(String type) {
        Burger burger = createBurger(type);
        burger.prepare();
        burger.box();
        return burger;
    }

    protected abstract Burger createBurger(String type);
}
