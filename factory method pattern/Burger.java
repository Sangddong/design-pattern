public abstract class Burger {
    String name;

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println(name + " 준비 중");
    }

    public void box() {
        System.out.println(name + " 포장 중");
    }
}
