public class RectangleTest {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();
        System.out.println(rect1);
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        Rectangle rect2 = new Rectangle(2.3, 5.8);
        System.out.println(rect2);

        Rectangle rect3 = new Rectangle(2.5, 3.8,
                "orange", true);
        System.out.println(rect3);
    }
}