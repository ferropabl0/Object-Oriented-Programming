import java.util.LinkedList;
import java.awt.*;

public class Continent {
    private LinkedList<Country> countries;

    public Continent(LinkedList<Country> initCountries) {
        countries = initCountries;
    }

    public double getTotalArea() {
        double totalArea = 0;
        for (int i = 0; i < countries.size(); i++) {
            totalArea += countries.get(i).getArea();
            totalArea = Math.abs(totalArea);
        }
        return totalArea;
    }

    public void drawContinent(Graphics g) {
        for (int j = 0; j < countries.size(); j++) {
            countries.get(j).drawCountry(g);
        }
    }
}   
