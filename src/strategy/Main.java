package strategy;

public class Main {
    public static void main(String[] args) {
        Boxer boxer1 = new Boxer(new Punch());
        boxer1.move();

        Boxer boxer2 = new Boxer(new Guard());
        boxer2.move();

        boxer1.setMoveAction(new Guard());
        boxer1.move();

        boxer2.setMoveAction(new Punch());
        boxer2.move();
    }
}
