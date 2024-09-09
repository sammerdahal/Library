package models;


import java.util.List;

public class Books {

    String title;
    String author;
    Genre genre;
    String description;
    int price;
    boolean Indiscount;

    public Books(String title, String author, Genre genre, String description, int price, boolean indiscount) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.description = description;
        this.price = price;
        Indiscount = indiscount;
    }

    public String getTitle() {
        return title;
    }

    public void settitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public boolean isIndiscount() {
        return Indiscount;
    }
    public void setIndiscount(boolean indiscount) {
        Indiscount = indiscount;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public List<Books> getBookDetails() {
        System.out.println("name of book: " + this.title + "written by author: " + this.author);
        System.out.println("genre of book: " + this.genre + "Description of book is " + this.description);
        System.out.println("price of book: " + this.price + "rs");
        if (Indiscount) {
            System.out.println("book is in discount");
        } else {
            System.out.println("book is not in discount");
        }
        return null;
    }

}