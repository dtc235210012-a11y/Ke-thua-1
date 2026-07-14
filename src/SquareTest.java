public class SquareTest {
    public static void main(String[] args) {

        Square square1 = new Square();
        System.out.println(square1);
        System.out.println("Area: " + square1.getArea());
        System.out.println("Perimeter: " + square1.getPerimeter());

        Square square2 = new Square(2.3);
        System.out.println(square2);

        Square square3 = new Square(5.8, "yellow", true);
        System.out.println(square3);

        square3.setSide(10);
        System.out.println(square3);
    }
}