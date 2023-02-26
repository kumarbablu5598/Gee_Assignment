package com.hms.hms.model;

public class Book {
    private String Name;
    private String Author;
    private int id;

    public Book(String name, String author, int id) {
        Name = name;
        Author = author;
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Name='" + Name + '\'' +
                ", Author='" + Author + '\'' +
                ", id=" + id +
                '}';
    }
}
