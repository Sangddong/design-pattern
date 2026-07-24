public abstract class Bird {
    protected Fly flyBehavior;

    // 기본 생성자에서 기본값(FlyWithWings) 설정
    public Bird() {
        this.flyBehavior = new FlyWithWings();
    }

    // 날기 실행 메서드
    public void fly() {
        flyBehavior.fly();
    }

    // 실행 중 전략을 동적으로 변경할 수 있는 Setter
    public void setFlyBehavior(Fly flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void flapping() {
        System.out.println("날개짓합니다.");
    }
}
