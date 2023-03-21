import java.util.LinkedList;
import java.awt.*;

public class PolygonalRegion extends Region{
    private LinkedList<Point> points;

    public PolygonalRegion( LinkedList<Point> initPoints) {
        points = initPoints;
    }

    public LinkedList<Point> getPoint(){
        return points;
    }

    public int getSize(){
        return points.size();
    }

    public double getArea() {
        double area = 0.0;
       
        int size = points.size();
        int j;

        for (int i = 0; i < size; i++) {
            if (i == size-1) {
                j = 1;
            } else {
                j = i+1;
            }
            area += points.get(i).getX()*points.get(j).getY();
            area -= points.get(i).getY()*points.get(j).getX();
        }

        area = area/2;
        return area;
    }

    public void drawRegion(java.awt.Graphics g) {
        g.setColor(Color.GREEN);
        for (int k = 0; k < points.size()-1; k++) {
            g.drawLine(points.get(k).getX(), points.get(k).getY(), points.get(k+1).getX(), points.get(k+1).getY());
        }

        g.drawLine(points.get(points.size()-1).getX(), points.get(points.size()-1).getY(), points.get(0).getX(), points.get(0).getY());
    }
}
