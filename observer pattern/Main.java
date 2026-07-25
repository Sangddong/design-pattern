public class Main {
    public static void main(String[] args) {
        ScreenData screenData = new ScreenData();

        new CoffeeDataDisplay(screenData);
        new CakeDataDisplay(screenData);
        new AdDataDisplay(screenData);

        System.out.println("=== 스크린 데이터 설정 ===");
        screenData.setScreenData(
                new Coffee("아메리카노", 4500),
                new Cake("치즈케이크", 6500, "cheese.png"),
                new Ad("오늘의 특가!", "sale.png")
        );

        System.out.println("\n=== 스크린 데이터 변경 ===");
        screenData.setScreenData(
                new Coffee("라떼", 5000),
                new Cake("초코케이크", 7000, "choco.png"),
                new Ad("신메뉴 출시", "new.png")
        );
    }
}
