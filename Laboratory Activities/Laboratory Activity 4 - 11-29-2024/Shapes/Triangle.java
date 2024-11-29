package Shapes;

public class Triangle implements Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public double getArea(){
        double s = (a + b + c) / 2;
        double A = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return A;
    }

    @Override
    public double getPerimeter(){
        return a + b + c;
    }

    @Override
    public void ShapeType(){
        System.out.println("Triangle");
    }
}