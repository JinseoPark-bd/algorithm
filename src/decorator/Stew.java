package decorator;

public class Stew implements Dish {

    @Override
    public void assemble() {
        System.out.println("국을 끓입니다.");
        System.out.println("물을 넣습니다.");
    }
}
