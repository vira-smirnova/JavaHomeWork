package com.pb.smirnova.hw5;

public class Book {
    private String nameBook;
    private String authorBook;
    private int yearBook;
    private static int bookCount = 0;

    public Book(String name, String author, int year) {
        this.nameBook = name;
        this.authorBook = author;
        this.yearBook = year;
        bookCount++;
    }
    public static int getBookCount() {
        return bookCount;
    }

    public String getBook(){
        return nameBook + " ("+ authorBook + " "+  yearBook + "г.)";
    }

    public boolean equals (Book name) {
        return this.nameBook ==  name.nameBook;
    }
    public static void booksList(String[] arrayB) {
        String book2 = "";
        for (String book : arrayB) {
            if (book2 == "") {
                book2 = book;
            } else {
                book2 = book2 + ", " + book;
            }
        }
        System.out.print(book2);
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthorBook() {
        return authorBook;
    }

    public void setAuthorBook(String authorBook) {
        this.authorBook = authorBook;
    }

    public int getYearBook() {
        return yearBook;
    }

    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }

}
