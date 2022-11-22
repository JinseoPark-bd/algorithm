package proxy;

import java.util.StringTokenizer;

public class ProxyComputer implements Computer {

    private RealComputer realComputer;
    private String comId;

    public ProxyComputer(String comId) {
        this.comId = comId;
    }

    @Override
    public void displayWindow() {
        if(realComputer == null) {
            realComputer = new RealComputer(comId);
        }
        realComputer.displayWindow();
    }
}
