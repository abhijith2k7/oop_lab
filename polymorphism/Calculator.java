public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    protected int add(int a, int b, int c) {
        return a + b + c;
    }

    private double add(double a, double b) {
        return a + b;
    }

    public void displayDecimalAddition(double a, double b) {
        double result = add(a, b);
        System.out.println("Decimal Addition Result: " + result);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum2 = calc.add(10, 20);
        System.out.println("Two Integers Result: " + sum2);

        int sum3 = calc.add(10, 20, 30);
        System.out.println("Three Integers Result: " + sum3);

        calc.displayDecimalAddition(10.5, 20.7);
    }
}