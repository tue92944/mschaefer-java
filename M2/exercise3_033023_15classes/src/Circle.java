public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(double radius){
        double area = radius * radius * Math.PI;
        return area;
    }

    public double calculateCircumference(double radius){
        double circumference = 2 * Math.PI * radius;
        return circumference;
    }
}
