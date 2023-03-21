public class Vector {
    private double coordX;
    private double coordY;

    public Vector(double X, double Y){
        coordX = X;
        coordY = Y;
    }

    public double CrossProduct(Vector v2){
        double product = coordX*v2.coordY - coordY*v2.coordX;
        return product;
    }
    
}
