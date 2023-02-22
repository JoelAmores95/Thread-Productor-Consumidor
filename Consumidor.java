
public class Consumidor extends Thread {
    private CubbyHole cubbyhole;
    private int number;

    public Consumidor(CubbyHole c, int number) {
        cubbyhole = c;
        this.number = number;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = cubbyhole.get();
            System.out.println("Consumidor #" + this.number + " come: " + value);
        }
    }
}
