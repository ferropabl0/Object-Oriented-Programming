import java.awt.*;

public abstract class Region extends Entity{
    protected Color fillColor;

    public Region(Color lcinit, Color fcinit){
        super(lcinit);
        fillColor = fcinit;
    }

    public abstract double getArea();
    public abstract boolean isPointInside(Point p);
    public void setFillColor(Color c){
        fillColor = c;
    }
}