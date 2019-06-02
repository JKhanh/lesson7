package basicOOP.com.k001;

import java.util.Scanner;

public class book {
    int id, pageNumber, subject;
    String name, author, publisher;

    void getInfomation() {
        Scanner input = new Scanner(System.in);
        System.out.print("Book id: ");
        this.id = input.nextInt();
        input.nextLine();
        System.out.print("Book name: ");
        this.name = input.nextLine();
        System.out.print("Author of the book: ");
        this.author = input.nextLine();
        System.out.print("Publisher: ");
        this.publisher = input.nextLine();
        System.out.println("Choose subject for the book: ");
        System.out.println("1.CNTT\n2.KH-DS\n3.VH-NT");
        this.subject = input.nextInt();
        System.out.print("Book's page number: ");
        this.pageNumber = input.nextInt();
    }

    void displayBook() {
        System.out.println("Book id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.print("Subject: ");
        switch (subject) {
            case 1:
                System.out.println("CNTT");
                break;
            case 2:
                System.out.println("KH-DS");
                break;
            case 3:
                System.out.println("VH-NT");
                break;
        }
        System.out.println("Number of book's page: " + pageNumber);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        book[] Book = new book[200];
        int bookNumber = 0;
        System.out.println("Which action do you want:");
        int choose;
        do {
            System.out.println("1.Add new book.\n2.Display book info\n3.Exit");
            choose = input.nextInt();
            switch (choose) {
                case 1:
                    book tmp = new book();
                    tmp.getInfomation();
                    Book[bookNumber++] = tmp;
                    break;
                case 2:
                    if (bookNumber == 0) System.out.println("Empty database.");
                    else for (int i = 0; i < bookNumber; i++) Book[i].displayBook();
                    break;
            }
        }
        while (choose < 3);
    }
}