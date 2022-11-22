package decorator;

public class SoybeanPasteStew extends StewDecorator {

    public SoybeanPasteStew(Dish d) {
        super(d);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("된장을 넣습니다.");
    }
}
