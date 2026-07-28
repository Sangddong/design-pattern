public class Main {
    public static void main(String[] args) {
        Burger burger = new CheeseBurger();
        burger = new BaconOption(burger);
        burger = new BaconOption(burger);

        System.out.println("메뉴: " + burger.getName());
        System.out.println("가격: " + burger.price());
    }
}
