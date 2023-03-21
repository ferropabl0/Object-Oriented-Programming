
import java.awt.Graphics;
import java.awt.Color;

public class GeoPoint extends Point {
    private String name;

    public GeoPoint(int initX, int initY, String n){
        super(initX, initY);
        name = n;
    }

    public void drawGeoPoint(Graphics g){
        int pX = getX();
        int pY = getY();
        int w = 6;
        int h = 6;

        g.setColor(Color.black);
        g.fillOval(pX, pY, w, h);
        g.drawString(name, pX-20, pY-5);            
    }
    
}
