package com.pb.smirnova.hw5;

public class Reader {
    private String readerFullName;
    private int libraryCard;
    private String faculty;
    private String readerDB;
    private String readerPhone;

    public String getReaderFullName() {
        return readerFullName;
    }

    public void setReaderFullName(String readerFullName) {
        this.readerFullName = readerFullName;
    }

    public Reader(String fullName, int libraryCard, String faculty, String readerDB, String phone) {
        this.readerFullName = fullName;
        this.libraryCard = libraryCard;
        this.faculty = faculty;
        this.readerDB = readerDB;
        this.readerPhone = phone;
    }

    public int getReader(int lCard) {
        if (libraryCard == lCard) {
            return libraryCard;
        }
        return 0;
    }

    public String getReaders() {
        String result;
        result = "ФИО: " + readerFullName + "| номер читательского билета: " + libraryCard + "| Факультет: " + faculty + "| Дата рождения: " + readerDB + "| Телефон: " + readerPhone;
        return result;
    }
    //--1)-takeBook-------------------------------------------------------------------------------
    public String takeBook(int quantity) {
        if (quantity == 1)
            return readerFullName + " взял " + quantity + " книгу";
        else if (quantity > 1 && quantity < 5)
            return readerFullName + " взял " + quantity + " книги";
        else return readerFullName + " взял " + quantity + " книг";
    }
    //--2)-------------------------------------------------------------------------------
    public void takeBook(String[] arrayB) {
                System.out.print(readerFullName + " взял книги: " );
        String book2 = "";
        for (String book : arrayB) {
            if (book2 == "") {
                book2 = book;
                }
            else {
                book2 = book2 + ", " + book;
            }
        }
        System.out.print(book2 + "\n");
    }
    //--3)-------------------------------------------------------------------------------
    public void takeBook(String books) {
        System.out.println(readerFullName + " хочет взять книги: " + books);
    }

    //--1)-------------------------------------------------------------------------------
    public String returnBook(int quantity) {
        if (quantity == 1)
            return readerFullName + " вернул " + quantity + " книгу";
        else if (quantity > 1 && quantity < 5)
            return readerFullName + " вернул " + quantity + " книги";
        else return readerFullName + " вернул " + quantity + " книг";
    }
    //--2)-------------------------------------------------------------------------------
    public void returnBook(String[] arrayB) {
        System.out.print(readerFullName + " вернул книги: " );
        String book2 = "";
        for (String book : arrayB) {
            if (book2 == "") {
                book2 = book;
            }
            else {
                book2 = book2 + ", " + book;
            }
        }
        System.out.print(book2 + "\n");
    }
    //--3)-------------------------------------------------------------------------------
    public void returnBook(String books) {
        System.out.println(readerFullName + " вернул книги: " + books);
    }


}
