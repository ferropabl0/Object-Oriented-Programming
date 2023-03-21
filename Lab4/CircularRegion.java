
import java.awt.*;

public class CircularRegion extends EllipsoidalRegion{

    public CircularRegion(Point initc, int initr, Color lcinit, Color fcColor){
        super(initc, initr, initr, lcinit, fcColor);
    }

    public double getArea(){
        return super.getArea();
    }
    

}