package templateCallback;

public class BoxerRefactoring {

    void setMoveAction(String move) {
        execute(move).action();
    }

    private Boxing execute(final String move) {
        return new Boxing() {
            @Override
            public void action() {
                System.out.println(move);
            }
        };
    }
}
