import java.util.LinkedList;
import java.awt.*;


public class Country extends PolygonalRegion {
    private String name;
    private LinkedList<City> cities;
    private LinkedList<Country> neighbors; 
    private City capital;
    private LinkedList<Lake> lakes;
    
    public Country(LinkedList<Point> initPoints, String n, City cap){
        super(initPoints);
        name = n;
        capital = cap;
        cities = new LinkedList<City>();
        neighbors = new LinkedList<Country>();
        lakes = new LinkedList<Lake>();        
    }

    public void addCity(City c){
        cities.add(c);
    }

    public void addNeighbor(Country c){
        neighbors.add(c);
    }

    public void addLake(Lake l){
        lakes.add(l);
    }
    
    public void drawCountry(Graphics g){
        super.drawRegion(g);
        
        for (int i = 0; i < cities.size(); i++){
            cities.get(i).drawCity(g);
        }
        
        for(int j = 0; j<lakes.size(); j++){
            lakes.get(j).drawLake(g);
        }
        
        capital.drawCity(g);
    }
}
