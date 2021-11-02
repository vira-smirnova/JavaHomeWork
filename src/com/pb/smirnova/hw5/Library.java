package com.pb.smirnova.hw5;

import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book book1 = new Book("Приключения", "Иванов И.И.", 2000);
        Book book2 = new Book("Словарь", "Сидоров А.В.", 1980);
        Book book3 = new Book("Энциклопедия", "Гусев К.В.", 2010);

        //int countBook = Book.getBookCount();

        Reader reader1 = new Reader("Петров В.В.", 101, "Физика", "15.10.1988", "380971115566");
        Reader reader2 = new Reader("Иванов И.И.", 201, "Химия", "21.05.1990", "380936562211");

        Reader[] readers = {reader1, reader2};





        System.out.println("В билиотеке имеются такие книги:\n" + "1) " + book1.getBook() +
                "\n" + "2) " + book2.getBook() + "\n" + "3) " + book3.getBook());
        System.out.println("----------------------------------");
        System.out.println("Наши читатели: ");
        for (Reader reader : readers) {
            System.out.println(reader.getReaders());
        }
        System.out.println("----------------------------------");
//----------------------------------------------------------------------------------
        System.out.print("Укажите номер читательского билета? ");
        int lCard = scan.nextInt();
//----------------------------------------------------------------------------------
        if (lCard != reader1.getReader(lCard) && lCard != reader2.getReader(lCard)) {
            System.out.print("Пользователь не зарегистрирован");
        }
        else {
            System.out.print("Сколько книг хотите взять? ");
            int quantity = scan.nextInt();


            int count = 1;
            String[] arrayBookName = new String[quantity];
            String[] books = new String[quantity];
            String book0 = "";
            for (int i = 0; i < arrayBookName.length; i++) {
                System.out.print("Введите название книги " + count + ": ");
                String BookName = scan.next();
                if (book1.getNameBook().equals(BookName)) {
                    arrayBookName[i] = BookName;
                    books[i] = book1.getBook();
                    if (book0 == "") {
                        book0 = BookName;
                    } else {
                        book0 = book0 + ", " + BookName;
                    }
                    count++;
                } else if (book2.getNameBook().equals(BookName)) {
                    arrayBookName[i] = BookName;
                    books[i] = book2.getBook();
                    if (book0 == "") {
                        book0 = BookName;
                    } else {
                        book0 = book0 + ", " + BookName;
                    }
                    count++;
                } else if (book3.getNameBook().equals(BookName)) {
                    arrayBookName[i] = BookName;
                    books[i] = book3.getBook();
                    if (book0 == "") {
                        book0 = BookName;
                    } else {
                        book0 = book0 + ", " + BookName;
                    }
                    count++;
                } else {
                    System.out.println("Такой книги нет в билиотеке");
                    i--;
                }
            }

//----------------------------------------------------------------------------------
            System.out.println("----------------------------------");
            if (lCard == 101) {
                System.out.println(reader1.takeBook(quantity));
                reader1.takeBook(book0);
                reader1.takeBook(books);
            } else if (lCard == 201) {
                System.out.println(reader2.takeBook(quantity));
                reader2.takeBook(book0);
                reader2.takeBook(books);
            }
//----------------------------------------------------------------------------------
            System.out.println("----------------------------------");
            String answer = "";
            while (answer == "") {
                System.out.print("Хотите вернуть книги? (да/нет/выход) ");
                answer = scan.next();
                if ("да".equals(answer)) {
                    if (lCard == 101) {
                        System.out.println(reader1.returnBook(quantity));
                        reader1.returnBook(book0);
                        reader1.returnBook(books);
                        break;
                    } else if (lCard == 201) {
                        System.out.println(reader2.returnBook(quantity));
                        reader2.returnBook(book0);
                        reader2.returnBook(books);
                        break;
                    }
                }
                if ("нет".equals(answer)) {
                    System.out.print("Книги нужно вернуть! \n");
                    answer = "";
                }
                if ("выход".equals(answer)) {
                        break;
                }
                }
            }
    }
}
