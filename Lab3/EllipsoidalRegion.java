import java.awt.Graphics;

public class EllipsoidalRegion extends Region {
    private Point c;
    private int r1;
    private int r2;

    public EllipsoidalRegion(Point initc, int initr1, int initr2){
        c = initc;
        r1 = initr1;
        r2 = initr2;
    }

    public double getArea() {
        double area = Math.PI*r1*r2;
                
        return area;
    }

    public void drawRegion(Graphics g){
        g.drawOval(c.getX()-r1, c.getY()-r2, r1, r2);
    }
    
}
