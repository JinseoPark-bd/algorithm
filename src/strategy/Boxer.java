package strategy;

public class Boxer {
    private Boxing boxing;

    public Boxer(Boxing boxing) {
        this.boxing = boxing;
    }

    public void move() {
        boxing.action();
    }

    public void setMoveAction(Boxing boxing) {
        this.boxing = boxing;
    }
}
