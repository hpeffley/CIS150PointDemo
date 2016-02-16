package p1;

import javafx.geometry.Point2D;

public class Main {

    public static void main(String[] args) {
        Point2D pt1 = new Point2D(7, 0);
        Point2D pt2 = new Point2D(0, 4);
        double hypotenuse = pt1.distance(pt2);

        System.out.println(pt1.toString());
        System.out.println(pt2.toString());

        //System.out.println(pt1);
        System.out.printf("hypotenuse = %.2f%n",
                hypotenuse);
    }
}
