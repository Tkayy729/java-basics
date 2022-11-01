package Day2;

public class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;

    public int id;
    public static int numberOfBikes = 0;

    // four constructors
    public Rectangle() {
        origin = new Point(0, 0);
        id = ++numberOfBikes;
    }
    public Rectangle(Point p) {
        origin = p;
        id = ++numberOfBikes;
    }
    public Rectangle(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
        id = ++numberOfBikes;
    }
    public Rectangle(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
        id = ++numberOfBikes;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // a method for computing the area of the rectangle
    public int getArea() {
        return width * height;
    }

    public int getId(){
        return id;
    }

    public static int getNumberOfBikes(){
       return numberOfBikes;
    }
}
