package bookstore;

import java.text.SimpleDateFormat;
import java.util.*;

public class Catalog extends BookCollection{

    public Catalog(){
        super();
        collection = new HashSet<StockInterface>();
        LinkedList<String[]> difBooks = readCatalog("books.xml");
        Date date = new Date();

        for (int i = 0; i < difBooks.size(); i++){
            String[] n = difBooks.get(i);

            try {date = new SimpleDateFormat().parse(n[2]);}
            catch(Exception e){}

            String title = n[0];
            String author = n[1];
            String publicationPlace = n[3];
            long isbn = Long.parseLong(n[4]);
            double price = Double.parseDouble(n[5]);
            Currency currency = Currency.getInstance(n[6]);
            int copies = Integer.valueOf(n[7]);

            Book book = new Book(n[0], n[1], date, n[3], isbn);
            Stock stock = new Stock(book, copies, price, currency);

            collection.add(stock);
        }
    }  
}
