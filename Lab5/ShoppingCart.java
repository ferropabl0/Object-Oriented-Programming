package bookstore;

import java.util.*;

public class ShoppingCart extends BookCollection implements ShoppingCartInterface{
    protected Catalog catalog;

    public ShoppingCart(Catalog initCatalog){
        catalog = initCatalog;
    }
    
    @Override
    public String[] booktitles(){
        return catalog.booktitles();
    }

    @Override
    public int numberOfCopies(String booktitle){
        return catalog.numberOfCopies(booktitle);
    }

    @Override
    public void addCopies(int numberOfCopies, String booktitle){
        if(catalog.numberOfCopies(booktitle) - numberOfCopies >= 0){
            catalog.removeCopies(numberOfCopies, booktitle);

            for(StockInterface e : collection){
                if(e.getBooktitle().equals(booktitle)){
                    StockInterface sCheck = getStock(booktitle);

                    if(sCheck == null){
                        Book book = e.getBook();
                        Currency currency = e.getCurrency();
                        double price = e.totalPrice();
                        Stock stock = new Stock(book, numberOfCopies, price, currency);
                        collection.add(stock);
                    }
                    else { sCheck.addCopies(numberOfCopies);}
                }
            }
        }
    }

    @Override
    public void removeCopies(int numberOfCopies, String booktitle){
        for (StockInterface e : collection){
            if(e.getBooktitle().equals(booktitle)){
                if (e.numberOfCopies()- numberOfCopies >= 0){
                    e.removeCopies(numberOfCopies);
                    catalog.addCopies(numberOfCopies, booktitle);
                }
            }
        }
    }

    @Override
    public double totalPrice(){
        double p = 0;

        for(StockInterface e: collection){
            if (e != null){
                int s = e.numberOfCopies();

                for(int i = 0; i<s; i++){
                    p += e.totalPrice();
                }
            }
        }
        return p;
    }

    @Override
    public String checkout(){
        Payment payment = Payment.getTheInstance();
        StockInterface stock = getStock(catalog.booktitles()[0]);

        long visaNum = 666;
        String cardHolder = "Roddy";
        Currency c = stock.getCurrency();

        String p = payment.doPayment(visaNum,cardHolder, totalPrice(), c);

        for (StockInterface e: collection){
            if(e.numberOfCopies() > 0){
                e.removeCopies(e.numberOfCopies());
            }
        }
        return p;
    }

}
