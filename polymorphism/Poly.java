class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    protected void display() {
        System.out.println("Displaying from Base Calculator");
    }

    private void show() {
        System.out.println("Private show() in Base Calculator");
    }

    public void accessPrivate() {
        show();
    }
}

class AdvancedCalculator extends Calculator {

    @Override
    public int add(int a, int b) {
        return (a + b) * 10;
    }

    @Override
    protected void display() {
        System.out.println("Displaying from Advanced Calculator");
    }

    public void show() {
        System.out.println("Unique show() in Advanced Calculator");
    }
}

public class Poly {
    public static void main(String[] args) {
        Calculator base = new Calculator();
        AdvancedCalculator adv = new AdvancedCalculator();
        Calculator poly = new AdvancedCalculator();

        System.out.println("Base Add: " + base.add(5, 5));
        base.display();
        base.accessPrivate();

        System.out.println("---");

        System.out.println("Adv Add: " + adv.add(5, 5));
        adv.display();
        adv.show();

        System.out.println("---");

        System.out.println("Poly Add: " + poly.add(5, 5));
        poly.display();
        poly.accessPrivate();
    }
}