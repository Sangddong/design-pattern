public class Main {
    public static void main(String[] args) {
        BurgerStore seoulStore = new SeoulBurgerStore();
        BurgerStore busanStore = new BusanBurgerStore();

        Burger burger1 = seoulStore.orderBurger("cheese");
        System.out.println("주문 완료: " + burger1.getName());

        Burger burger2 = busanStore.orderBurger("chicken");
        System.out.println("주문 완료: " + burger2.getName());
    }
}
