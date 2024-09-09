package models;

public class BookOrder {
    private int bookID;
    private Books book;
    private int quantity;

    public BookOrder(int bookID, Books book, int quantity) {
        this.bookID = bookID;
        this.book = book;
        this.quantity = quantity;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public Books getBook() {
        return book;
    }


    public void setBook(Books book) {
        this.book = book;
    }



    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int calculateTotalPrice() {
        return this.book.getPrice() * this.quantity;
    }
}

