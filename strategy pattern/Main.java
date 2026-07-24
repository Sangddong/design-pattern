public class Main {
    public static void main(String[] args) {
        Bird pigeon = new Pigeon();
        Bird crow = new Crow();
        Bird penguin = new Penguin();
        Bird chicken = new Chicken();

        System.out.println("=== 비둘기 ===");
        pigeon.fly();
        pigeon.flapping();

        System.out.println("\n=== 까마귀 ===");
        crow.fly();
        crow.flapping();

        System.out.println("\n=== 펭귄 ===");
        penguin.fly();
        penguin.flapping();

        System.out.println("\n=== 닭 ===");
        chicken.fly();
        chicken.flapping();

        // 실행 중 전략 변경
        System.out.println("\n=== 닭이 갑자기 날게 됨 (전략 변경) ===");
        chicken.setFlyBehavior(new FlyWithWings());
        chicken.fly();
    }
}
