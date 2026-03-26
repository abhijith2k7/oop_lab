class Calculator {

    // public method - 2 integers
    public int add(int a, int b) {
        return a + b;
    }

    // protected method - 3 integers
    protected int add(int a, int b, int c) {
        return a + b + c;
    }

    // private method - 2 decimal numbers
    private double add(double a, double b) {
        return a + b;
    }

    // public method calling private method
    public void showDecimalSum(double a, double b) {
        double result = this.add(a, b);   // calling private method
        System.out.println("Decimal Sum: " + result);
    }
}

public class Acalc {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println("2 Int Sum: " + c.add(10, 20));
        System.out.println("3 Int Sum: " + c.add(10, 20, 30));
        c.showDecimalSum(10.5, 20.5);
    }
}