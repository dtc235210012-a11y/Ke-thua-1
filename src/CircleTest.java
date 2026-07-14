public class CircleTest {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());

        Circle circle2 = new Circle(3.5);
        System.out.println(circle2);

        Circle circle3 = new Circle(3.5, "indigo", false);
        System.out.println(circle3);
    }
}