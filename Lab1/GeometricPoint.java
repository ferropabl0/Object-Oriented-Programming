package distancematrix;

public class GeometricPoint {
    private double x;
    private double y;
    private String name;

    public GeometricPoint (double initX, double initY, String initName){
        x = initX;
        y = initY;
        name = initName;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public String getName() {
        return name;
    }
    
    public void setX(double x1) {
        x = x1;
    }
    
    public void setY(double y1) {
        y = y1;
    }

    public void setName(String name1) {
        name = name1;
    }

    public double distance(GeometricPoint p2){
        return Math.sqrt(Math.pow(x - p2.x,2) + Math.pow(y - p2.y,2));
    }

    public void printPoint(){
        System.out.println(name+": (" + x + "," + y + ")");

    }
}
