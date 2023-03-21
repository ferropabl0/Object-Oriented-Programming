import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        EntityDrawer window = new EntityDrawer();

        Point p1 = new Point(150,350);
        Point p2 = new Point(100,650);
        Point p3 = new Point(480,555);

        TriangularRegion triangle = new TriangularRegion(p1, p2, p3, Color.GREEN, Color.BLUE);

        Point p4 = new Point(50, 350);
        CircularRegion circle = new CircularRegion(p4, 100, Color.GRAY, Color.GREEN);

        Point p5 = new Point(70, 80);
        Point p6 = new Point(25, 90);
        Point p7 = new Point(50, 75);
        Point p8 = new Point(100, 50);
        RectangularRegion rectangular = new RectangularRegion(p5, p6, p7, p8, Color.BLACK, Color.GRAY);

        Point p9 = new Point(500, 500);
        Text drawText = new Text(Color.RED, p9, "Hello World");

        Point p10 = new Point(500, 150);

        EllipsoidalRegion ellipse = new EllipsoidalRegion(p10, 50, 215, Color.MAGENTA, Color.CYAN);
        window.addDrawable(triangle);
        window.addDrawable(circle);
        window.addDrawable(rectangular);
        window.addDrawable(drawText);
        window.addDrawable(ellipse);


        Point inside = new Point(150,180);
        boolean answer = rectangular.isPointInside(inside);
        System.out.println("The point P(150,180) is inside the rectangle:" + answer); 

        Point inside2 = new Point(90,90);
        boolean answer2 = rectangular.isPointInside(inside2);
        System.out.println("The point P(90,90) is inside the rectangle:" + answer2); 

    }

}
