package Day2;

import org.w3c.dom.css.Rect;

public class Demo{

    public static void main(String[] args) {

        // Declare and create a point object and two rectangle objects.
        Point originOne = new Point(23, 94);
        Rectangle rectOne = new Rectangle(originOne, 100, 200);
        Rectangle rectTwo = new Rectangle(50, 100);

        System.out.println(rectOne.getId());
        System.out.println(rectTwo.getId());

        System.out.println( Rectangle.getNumberOfBikes());

//        // display rectOne's width, height, and area
//        System.out.println("Width of rectOne: " + rectOne.width);
//        System.out.println("Height of rectOne: " + rectOne.height);
//        System.out.println("Area of rectOne: " + rectOne.getArea());
//
//        // set rectTwo's position
//        rectTwo.origin = originOne;
//
//        // display rectTwo's position
//        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
//        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
//
//        // move rectTwo and display its new position
//        rectTwo.move(40, 72);
//        System.out.println("X Position of rectTwo: " + rectTwo.origin.x);
//        System.out.println("Y Position of rectTwo: " + rectTwo.origin.y);
    }
}