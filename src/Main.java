public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(7);
        System.out.println("Периметр круга: "+circle.getPerimeter());
        Shape rectangle = new Rectangle(4,8);
        System.out.println("Периметр прямоугольника: "+ rectangle.getPerimeter());
        Shape square= new Square(10);
        System.out.println("Периметр квадрата: "+ square.getPerimeter());
        Shape triangle = new Triangle(4,6,4);
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
        Shape trapeze = new Trapeze(2,5,7,3);
        System.out.println("Периметр трапеции: "+trapeze.getPerimeter());
    }
}