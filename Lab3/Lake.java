import java.util.LinkedList;
import java.awt.*;

public class Lake {
    private LinkedList<Point> point;

    public Lake(LinkedList<Point> p){
        point = p;
    }
    
    public int getSize(){
        return point.size();
    }

    public void drawLake(Graphics g){
        int size = getSize();
        int coordX[] = new int[size];
        int coordY[] = new int[size];

        for(int i = 0; i<size; i++){
            coordX[i] = (int) point.get(i).getX();
            coordY[i] = (int) point.get(i).getY();
        }

        g.setColor(Color.blue);
        g.drawPolygon(coordX, coordY, size);
    }
}
