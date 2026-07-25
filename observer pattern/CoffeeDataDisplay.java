public class CoffeeDataDisplay implements ScreenObserver, ScreenDisplay {
    private Coffee coffee;
    private ScreenData screenData;

    public CoffeeDataDisplay(ScreenData screenData) {
        this.screenData = screenData;
        screenData.addObserver(this);
    }

    // Pull
    @Override
    public void update() {
        this.coffee = screenData.getCoffee();
        display();
    }

    // Push
    @Override
    public void update(Coffee coffee, Cake cake, Ad ad) {
        this.coffee = coffee;
        display();
    }

    @Override
    public void display() {
        if (coffee != null) {
            System.out.println("[커피 스크린] 메뉴: " + coffee.getName() + " | 가격: " + coffee.getPrice() + "원");
        }
    }
}
