package shapes;


public class Circle {

    private double radius;
    private double circumference;
    private double area;
    public static int numberOfCircles = 0;

    public Circle(double radius) {
        this.radius = radius;
        numberOfCircles++;
    }

    public double getArea() {
        return this.area;
    }


    public static void main(String[] args) {

    }

    // Accessors
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setArea(double area) { this.area = area; }

    public void setCircumference(double circumference) {
        this.circumference = circumference;


    }

    public double getCircumference() { return this.circumference; }
}
