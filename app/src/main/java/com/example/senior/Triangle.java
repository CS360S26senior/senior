public class Triangle extends Shape {

    private double x1, y1;
    private double x2, y2;
    private double x3, y3;

    // Constructor
    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    // Getters
    public double getX1() { 
        return x1; 
    }
    public double getY1() { 
        return y1; 
    }
    public double getX2() { 
        return x2; 
    }
    public double getY2() { 
        return y2; 
    }
    public double getX3() { 
        return x3; 
    }
    public double getY3() { 
        return y3; 
    }

    // Setters
    public void setPoint1(double x, double y) {
        this.x1 = x;
        this.y1 = y;
    }

    public void setPoint2(double x, double y) {
        this.x2 = x;
        this.y2 = y;
    }

    public void setPoint3(double x, double y) {
        this.x3 = x;
        this.y3 = y;
    }

    // Override example method from Shape
    @Override
    public double getArea() {
        return Math.abs(
            x1*(y2 - y3) +
            x2*(y3 - y1) +
            x3*(y1 - y2)
        ) / 2.0;
    }

    @Override
    public String toString() {
        return "Triangle[(" + x1 + "," + y1 + "), (" + x2 + "," + y2 + "), (" + x3 + "," + y3 + ")]";
    }
}
