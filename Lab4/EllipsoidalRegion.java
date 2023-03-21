
import java.awt.*;


public class EllipsoidalRegion extends Region{
    private Point c;
    private int r1, r2;


    public EllipsoidalRegion(Point initc, int initr1, int initr2, Color lcinit, Color fcinit){
        super(lcinit, fcinit);
        c = initc;
        r1 = initr1;
        r2 = initr2;
    }

    @Override
    public double getArea(){
        double area = Math.PI*r1*r2;
        return area;
    }

    @Override
    public void translate(int dx, int dy){
        c.setX(c.getX() + dx);
        c.setY(c.getY() + dy);
    }

    @Override
    public void draw(Graphics g){
        int coordX = c.getX();
        int coordY = c.getY();

        g.setColor(fillColor);
        g.fillOval(coordX, coordY, (int) r1, (int) r2);
        g.setColor( lineColor );
        g.drawOval(coordX, coordY, (int) r1, (int) r2);
    }

    @Override
    public boolean isPointInside(Point p){
        double calculation = (Math.pow(p.getX()-c.getX(), 2))/(Math.pow(r1,2))+(Math.pow(p.getY()-c.getY(), 2))/(Math.pow(r2,2));
        if (calculation > 1){
            return false;
        }
        return true;
    }

}