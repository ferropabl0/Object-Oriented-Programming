import java.util.Arrays;
import java.util.LinkedList;
import java.awt.*;

public class TriangularRegion extends PolygonalRegion{

    public TriangularRegion(Point p1, Point p2, Point p3, Color lcinit, Color fcinit){
        super(new LinkedList<Point>(Arrays.asList(p1,p2,p3)), lcinit, fcinit);
    }

    public double getArea(){
        return super.getArea();
    }

}
