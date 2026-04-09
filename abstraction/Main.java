

abstract class Shape {
    abstract double area();

    void display() {
        System.out.println("This is a shape ");
    }
}

class Circle extends Shape {
    double radius;
    Circle(double r){
        radius = r;

    }

    double area(){
        return 3.14 * radius * radius;
    }
}







public class Main{
    public static void main(String args[]) {
        Shape c = new Circle(9);
        System.out.println("Circle area: "+ c.area());
    
    }
}