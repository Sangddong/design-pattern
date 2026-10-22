public class CoffeePotAdapter implements CoffeeMachine {
    private OldCoffeePot oldCoffeePot;

    public CoffeePotAdapter(OldCoffeePot oldCoffeePot) {
        this.oldCoffeePot = oldCoffeePot;
    }

    @Override
    public void brew() {
        oldCoffeePot.boilAndPour();
    }
}
