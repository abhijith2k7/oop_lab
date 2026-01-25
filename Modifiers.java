public class Modifiers {

    public int a = 10;
    protected int b = 20;
    int c = 30;
    private int d = 40;

    static int count = 0;
    final int num = 100;

    transient int temp = 5;
    volatile boolean flag = true;

    public Modifiers() {
        count++;
    }

    public synchronized void display() {
        System.out.println(a + " " + b);
    }

    public static void showCount() {
        System.out.println("Count: " + count);
    }

    public native void connect();

    public static void main(String[] args) {
        Modifiers obj = new Modifiers();
        obj.display();
        showCount();
    }
}
