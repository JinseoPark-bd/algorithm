package decorator;

public class StewDecorator implements Dish {

    protected Dish dish;

    public StewDecorator(Dish d) {
        this.dish = d;
    }

    @Override
    public void assemble() {
        this.dish.assemble();
    }
}
