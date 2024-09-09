import models.BookOrder;
import models.Books;
import models.Genre;
import models.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Genre g1 = new Genre("Horror", "Best");
        Genre g2 = new Genre("SiFi", "Mystery");
        Genre g3 = new Genre("thriller", "boring");


        Books b1 = new Books("One piece", "Oda",g1, "Good", 450, true);
        Books b2 = new Books("Full metal ", "Edward",g2, "Good", 400, true);
        Books b3 = new Books("Noragami", "Eric",g3, "goated", 700, false);


        List<Books> onSale = new ArrayList<Books>();
        onSale.add(b1);
        onSale.add(b2);
        onSale.add(b3);
        List<BookOrder> bookOrderList = new ArrayList<>();

        System.out.println("Do you want to order books?" +
                "Write true or false");
        boolean b = sc.nextBoolean();

        if (b) {
            System.out.println("books on sale are: ");
            for (int i = 0; i < onSale.size(); i++) {
                Books book = onSale.get(i);
                System.out.println("No" + (i + 1) + " " + book.getTitle());
            }

            System.out.println("To get details press 1 else press 2");
            int i = sc.nextInt();
            if (i == 1) {
                b1.getBookDetails();
                System.out.println();
                System.out.println();
                b2.getBookDetails();
                System.out.println();
                System.out.println();
                b3.getBookDetails();
                System.out.println();
                System.out.println();

            } else {
                System.out.println();
            }


            boolean ordering = true;
            while (ordering) {
                System.out.println("Which Book do you want to order press it's number");
                int which_book = sc.nextInt();
                System.out.println("How many do you want to order?");
                int how_many = sc.nextInt();
                if (which_book == 1) {
                    BookOrder bo1 = new BookOrder(1, b1, how_many);
                    bookOrderList.add(bo1);
                } else if (which_book == 2) {
                    BookOrder bo2 = new BookOrder(2, b2, how_many);
                    bookOrderList.add(bo2);
                } else if (which_book == 3) {
                    BookOrder bo3 = new BookOrder(3, b3, how_many);
                    bookOrderList.add(bo3);
                } else {
                    System.out.println("Enter a valid book number");
                }

                System.out.println("Do you want other books?   True or False");
                boolean other_book = sc.nextBoolean();
                if (!other_book) {
                    ordering = false;
                }


            }
            Order order = new Order(bookOrderList,1 );
            int totalAmount = order.calculateTotalAmount();
            System.out.println("Total amount for your order: " + totalAmount);
        }
        else{
            System.out.println("No books were ordered");
        }
    }
}