public class Triangle {
    private double base;
    private double side2;
    private double side3;
    private double height;


    public double findArea(double base,double height){
        double area = (base*height)/2;
        return area;
    }

    public double findPerimeter(double base,double side1, double side2){
        double perimeter = base + side1 + side2;
        return perimeter;
    }
}
