package shapes;

public class Rectangle {

    protected int length;
    protected int width;

    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getPerimeter() {
        int length = this.getLength();
        int width = this.getWidth();
        return (2 * length) + (2 * width);
    }

    public int getArea() {
        int length = this.getLength();
        int width = this.getWidth();
        return length * width;
    }

    public static void main(String[] args) {

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
