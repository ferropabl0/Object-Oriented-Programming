import java.util.LinkedList;

public class Continent {
    private LinkedList<PolygonalRegion> countries;

    public Continent(LinkedList<PolygonalRegion> initCountries) {
        countries = initCountries;
    }

    public double  getTotalArea() {
        double totalArea = 0;
        for (int i = 0; i < countries.size(); i++) {
            totalArea += countries.get(i).getArea();
        }

        return totalArea;
    }

    public void draw(java.awt.Graphics g) {
        for (int j = 0; j < countries.size(); j++) {
            countries.get(j).draw(g);
        }
    }
}
