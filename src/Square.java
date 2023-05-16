public class Square extends Shape{
    private double sizeSide;

    public Square(double sizeSide) {
        this.sizeSide = sizeSide;
    }


    @Override
    public double getPerimeter() {
        return sizeSide+sizeSide+sizeSide+sizeSide;
    }
}
