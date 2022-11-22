package decorator;

public class KimchiStew extends StewDecorator{

    public KimchiStew(Dish d) {
        super(d);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("김치를 넣습니다.");
    }
}
