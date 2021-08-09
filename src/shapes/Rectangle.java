package shapes;

public class Rectangle extends Quadrilateral {

    protected double length;
    protected double width;

//    public Rectangle() {
//        this.length = 0;
//        this.width = 0;
//    }
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getPerimeter() {
//        int length = this.getLength();
//        int width = this.getWidth();
//        return (2 * length) + (2 * width);
//    }
//
//    public int getArea() {
//        int length = this.getLength();
//        int width = this.getWidth();
//        return length * width;
//    }

    public static void main(String[] args) {

    }

    @Override
    public double getPerimeter() {
        double length = this.getLength();
        double width = this.getWidth();
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        double length = this.getLength();
        double width = this.getWidth();
        return length * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    public Rectangle(double length, double width) {
        super(length, width);
        this.length = length;
        this.width = width;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
}
