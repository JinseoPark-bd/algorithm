package proxy;

public class RealComputer implements Computer {

    private String comId;

    public RealComputer(String comId) {
        this.comId = comId;
        loadWindow(comId);
    }

    private void loadWindow(String comId) {
        System.out.println("로딩중.... " + comId);
    }

    @Override
    public void displayWindow() {
        System.out.println("연결완료 " + comId);
    }

}
