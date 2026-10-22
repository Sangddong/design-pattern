public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();

        CoffeeMachine newMachine = new NewCoffeeMachine();
        cafe.makeCoffee(newMachine);

        OldCoffeePot oldPot = new OldCoffeePot();
        CoffeeMachine adaptedPot = new CoffeePotAdapter(oldPot);
        cafe.makeCoffee(adaptedPot);
    }
}
