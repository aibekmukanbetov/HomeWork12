public class Rectangle extends  Shape{
    private double height;
    private double length;

    public Rectangle(double height, double length) {
        this.height = height;
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return 2*(length+height);
    }
}
