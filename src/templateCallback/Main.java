package templateCallback;

public class Main {

    public static void main(String[] args) {

//        Boxer boxer1 = new Boxer();
//
//        boxer1.setMoveAction(new Boxing() {
//            @Override
//            public void action() {
//                System.out.println("원 투 쨉 쨉");
//            }
//        });
//
//        boxer1.setMoveAction(new Boxing() {
//            @Override
//            public void action() {
//                System.out.println("왼손 가드");
//                System.out.println("오른속 가드");
//            }
//        });

        BoxerRefactoring boxer1 = new BoxerRefactoring();

        boxer1.setMoveAction("원 투 쨉 쨉");
        boxer1.setMoveAction("왼손 가드");
        boxer1.setMoveAction("오른손 가드");

    }
}
