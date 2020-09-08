package testhouse;

public class Circle extends Shape{

    double radius;

    public Circle(String color,double radius) {
        super(color);
        System.out.println("Circle Constructor is called...");
        this.radius=radius;
    }

    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle color is " + super.color +
                "and area is : " + area();
    }
}