import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Width = ");
        double width = sc.nextDouble();
        System.out.print("Height = ");
        double height = sc.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your rectangle " + rectangle.display());
        System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}