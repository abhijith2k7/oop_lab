class Calculator {

    public int add(int a, int b) {
        System.out.println("Parent add method");
        return a + b;
    }

    protected void display() {
        System.out.println("This is Calculator display method");
    }


    private void show() {
        System.out.println("Private show method in Calculator");
    }
    public void accessPrivate() {
        show();
    }
}

class AdvancedCalculator extends Calculator {

  
    public int add(int a, int b) {
        System.out.println("Child overridden add method");
        return a + b + 10; 
    }

   
    protected void display() {
        System.out.println("This is AdvancedCalculator display method");
    }
    public void show() {
        System.out.println("Own show method in AdvancedCalculator");
    }
}

public class Bcalc{
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        System.out.println("Sum: " + c1.add(5, 5));
        c1.display();
        c1.accessPrivate();

        System.out.println("-------------------");
        AdvancedCalculator c2 = new AdvancedCalculator();
        System.out.println("Sum: " + c2.add(5, 5));
        c2.display();
        c2.show();

        System.out.println("-------------------");
        Calculator ref = new AdvancedCalculator();
        System.out.println("Sum: " + ref.add(5, 5)); 
        ref.display();  
        ref.accessPrivate();  
    }
}
