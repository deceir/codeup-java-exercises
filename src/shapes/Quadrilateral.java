package shapes;

abstract class Quadrilateral extends Shape implements Measurable {

    protected double length;
    protected double width;

    public Quadrilateral() {
        Quadrilateral quadrilateral = new Quadrilateral() {
            @Override
            public void setLength(double length) {

            }

            @Override
            public void setWidth(double width) {

            }

            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getArea() {
                return 0;
            }
        };
    }

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public abstract void setLength(double length);

    public abstract void setWidth(double width);

}
