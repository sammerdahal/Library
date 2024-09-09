package models;

import java.util.List;

public class Order {
    private int orderID;
    private List<BookOrder> bookOrders;

    public Order( List<BookOrder> bookOrders, int orderID ) {
        this.bookOrders = bookOrders;
        this.orderID = orderID;

    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    public List<BookOrder> getBookOrders() {
        return bookOrders;
    }

    public void setBookOrders(List<BookOrder> bookOrders) {
        this.bookOrders = bookOrders;
    }
    public int calculateTotalAmount() {
        int totalAmount = 0;
        for (BookOrder bookOrder : this.bookOrders) {
            totalAmount += bookOrder.calculateTotalPrice();
        }
        return totalAmount;
    }


}
