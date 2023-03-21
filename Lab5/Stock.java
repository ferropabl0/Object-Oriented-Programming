package bookstore;

import java.util.Currency;

public class Stock implements StockInterface{
    private Book book;
    private int copies;
    private double price;
    private Currency currency;

    public Stock(Book bookinit, int copinit, double priceinit, Currency curinit){
        book = bookinit;
        copies = copinit;
        price = priceinit;
        currency = curinit;
    }

    @Override
    public Book getBook(){
        return book;
    }

    @Override
    public String getBooktitle(){
        return book.getTitle();
    }

    @Override
    public int numberOfCopies(){
        return copies;
    }

    @Override
    public void addCopies(int numberOfCopies){
        copies += numberOfCopies;
    }

    public void removeCopies(int numberOfCopies){
        copies -= numberOfCopies; 
    }

    @Override
    public double totalPrice(){
        return price;
    }

    @Override
    public Currency getCurrency() {
        return currency;
    }

}
