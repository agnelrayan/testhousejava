package testhouse;

public class ShapeM {
    public static void main(String[] args) {
        Shape s1 = new Rectangle("Red",10,5);
        Shape s2 = new Circle("Green",10);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
