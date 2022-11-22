package proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Computer com1 = new ProxyComputer("회사1 컴퓨터");
        Computer com2 = new ProxyComputer("회사2 컴퓨터");

        com1.displayWindow();
        com2.displayWindow();
    }
}
