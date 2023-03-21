import java.util.LinkedList;
import java.awt.*;
import java.awt.Color;

public class Ocean {
    private LinkedList<Point> point;

    public Ocean(LinkedList<Point> p){
        point = p;
    }

    public int getSize(){
        return point.size();
    }

    public void drawOcean(Graphics g){
        int size = getSize();
        int coordX[] = new int[size];
        int coordY[] = new int[size];

        for(int i = 0; i<size; i++){
            coordX[i] = (int) point.get(i).getX();
            coordY[i] = (int) point.get(i).getY();
        }
        Color darkBlue = new Color(0, 0, 153);
        g.setColor(darkBlue);
        g.drawPolygon(coordX, coordY, size);
        g.fillPolygon(coordX, coordY, size);

    }
    
}
