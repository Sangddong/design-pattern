public class AdDataDisplay implements ScreenObserver, ScreenDisplay {
    private Ad ad;
    private ScreenData screenData;

    public AdDataDisplay(ScreenData screenData) {
        this.screenData = screenData;
        screenData.addObserver(this);
    }

    // Pull
    @Override
    public void update() {
        this.ad = screenData.getAd();
        display();
    }

    // Push
    @Override
    public void update(Coffee coffee, Cake cake, Ad ad) {
        this.ad = ad;
        display();
    }

    @Override
    public void display() {
        if (ad != null) {
            System.out.println("[광고 스크린] 문구: " + ad.getText() + " | 이미지: " + ad.getImageUrl());
        }
    }
}
