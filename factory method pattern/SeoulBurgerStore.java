public class SeoulBurgerStore extends BurgerStore {
    @Override
    protected Burger createBurger(String type) {
        if (type.equals("cheese")) {
            return new SeoulCheeseBurger();
        } else if (type.equals("chicken")) {
            return new SeoulChickenBurger();
        }
        return null;
    }
}
