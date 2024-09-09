package models;

import java.util.List;

public class Customer {
    String Customername;
    String Email;
    private List<Order> Orders;

    public Customer(String customername, String email, List<Order> orders) {
        Customername = customername;
        Email = email;
        Orders = orders;
    }

    public String getCustomername() {
        return Customername;
    }

    public void setCustomername(String customername) {
        Customername = customername;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public List<Order> getOrders() {
        return Orders;
    }

    public void setOrders(List<Order> orders) {
        Orders = orders;
    }

    public void customersinfo(){
        System.out.println("Customer Name: " + Customername);
        System.out.println("Email: " + Email);
        System.out.println("Orders: " + Orders);
    }

    public void printAllOrders() {
        System.out.println("Orders for Customer: " + Customername);
        for (Order order : Orders) {
            System.out.println("Order ID: " + order.getOrderID());
            for (BookOrder bookOrder : order.getBookOrders()) {
                Books book = bookOrder.getBook();
                System.out.println("  Book: " + book.getTitle() +
                        ", Quantity: " + bookOrder.getQuantity() +
                        ", Price per unit: " + book.getPrice());
            }


        }

    }
}