
import java.awt.Graphics;

public class City extends GeoPoint {
    private int numhab;

    public City (int initX, int initY, String n, int h){
        super(initX, initY, n);
        numhab = h;

    }
    
    public void drawCity(Graphics g){
        super.drawGeoPoint(g);
    }
}
