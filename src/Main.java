import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4.0, 5.0);
        r.setLength(2);
        r.setWidth(3);
        System.out.println("The lenght is: "+r.getLength());
        System.out.println("The width is: "+r.getWidth());
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());

    }

}
