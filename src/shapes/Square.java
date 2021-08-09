package shapes;

public class Square extends Quadrilateral {

    protected double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getPerimeter() {
        this.side = this.length;
        return side * 4;
    }

    @Override
    public double getArea() {
        this.side = this.length;
        return side * side;
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double width) {

    }

    //    @Override
//    public int getArea() {
//        return this.length * this.length;
//    }
//
//    @Override
//    public int getPerimeter() {
//        return this.length * 4;
//    }
//
//    public Square(int side) {
//        super(side, side);
//    }

}
