package SOLID.InterfaceSegregation;

public class Square implements Shape, Drawable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    @Override
    public double getArea() {
        return side * side;
    }
}