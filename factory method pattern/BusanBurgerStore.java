public class BusanBurgerStore extends BurgerStore {
    @Override
    protected Burger createBurger(String type) {
        if (type.equals("cheese")) {
            return new BusanCheeseBurger();
        } else if (type.equals("chicken")) {
            return new BusanChickenBurger();
        }
        return null;
    }
}
