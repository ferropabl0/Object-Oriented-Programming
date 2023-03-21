import java.awt.*;

public class Line extends Entity{
    private Point p1;
    private Point p2;
    
    public Line(Color lcinit, Point p1i, Point p2i) {
        super(lcinit);
        p1 = p1i;
        p2 = p2i;
    }
    public void draw(java.awt.Graphics g){
        g.setColor(lineColor);
        g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

    public void translate(int dx, int dy) {
        p1.setX(p1.getX()+dx);
        p1.setY(p1.getY()+dy);
        p2.setX(p2.getX()+dx);
        p2.setY(p2.getY()+dy);
    }
}
