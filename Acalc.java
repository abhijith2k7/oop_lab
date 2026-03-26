class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    protected int add(int a, int b, int c) {
        return a + b + c;
    }
    private double add(double a, double b) {
        return a + b;
    }

  
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
