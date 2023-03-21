import java.util.LinkedList;
import java.awt.*;

public class PolygonalRegion extends Region{
    private LinkedList<Point> points;

    public PolygonalRegion( LinkedList<Point> initPoints, Color lcinit, Color fcinit) {
        super(lcinit, fcinit);
        points = initPoints;
    }

    public LinkedList<Point> getPoint(){
        return points;
    }

    public int getSize(){
        return points.size();
    }
    @Override
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
    @Override
    public void draw(Graphics g){
        int size = getSize();
        int coordX[] = new int[size];
        int coordY[] = new int[size];

        for(int i = 0; i < size; i++){
            coordX[i] = points.get(i).getX();
            coordY[i] = points.get(i).getY();

        }
        g.setColor(fillColor);
        g.fillPolygon(coordX,coordY,size);
        g.setColor( lineColor );
        g.drawPolygon(coordX, coordY, size);
    }

    @Override
    public void translate(int dx, int dy){
        int size = points.size();
        for (int i =0; i < size; i++){
            int coordX = points.get(i).getX();
            int coordY = points.get(i).getY();

            points.get(i).setX(coordX + dx);
            points.get(i).setY(coordY + dy);
        }
    }
    @Override
    public boolean isPointInside(Point p){
        int size = points.size();

        Point p1 = points.get(size-1);
        Point p2 = points.get(0);

        Vector diff1 = p2.difference(p1);
        Vector diff2 = p.difference(p1);

        double a = diff1.CrossProduct(diff2);

        for(int i =0; i < size-1; i++){
            p1 = points.get(i);
            p2 = points.get(i+1);
            diff1 = p2.difference(p1);
            diff2 = p.difference(p1);
            double b = diff1.CrossProduct(diff2);

            if(a*b < 0){
                return false;
            }
        }
        return true;
    }
}
