public class CakeDataDisplay implements ScreenObserver, ScreenDisplay {
    private Cake cake;
    private ScreenData screenData;

    public CakeDataDisplay(ScreenData screenData) {
        this.screenData = screenData;
        screenData.addObserver(this);
    }

    // Pull
    @Override
    public void update() {
        this.cake = screenData.getCake();
        display();
    }

    // Push
    @Override
    public void update(Coffee coffee, Cake cake, Ad ad) {
        this.cake = cake;
        display();
    }

    @Override
    public void display() {
        if (cake != null) {
            System.out.println("[케이크 스크린] 메뉴: " + cake.getName()
                    + " | 가격: " + cake.getPrice() + "원 | 이미지: " + cake.getImageUrl());
        }
    }
}
