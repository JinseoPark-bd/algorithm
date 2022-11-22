package decorator;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Dish kimchiStew = new KimchiStew(new Stew());
        kimchiStew.assemble();
        System.out.println("\n*****");

        Dish soybeanPasteStew = new SoybeanPasteStew(new Stew());
        soybeanPasteStew.assemble();
        System.out.println("\n*****");
    }
}
