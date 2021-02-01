public class Library {
    // Add the missing implementation to this class
    private String libraryAddress;
    private Book[] Books = new Book[0];

    public Library(String address) {
        libraryAddress = address;
    }

    public void addBook(Book item) {
        int Len = Books.length;
        Book[] Temp = new Book[Len + 1];
        for (int i = 0; i < Len; i++)
            Temp[i] = Books[i];

        Temp[Len] = item;
        Books = new Book[Temp.length];
        for (int i = 0; i < Books.length; i++)
            Books[i] = Temp[i];
    }


    void returnBook(String returningBook) {
        for (int i
             = 0; i < Books.length; i++)
            if (Books[i].getTitle().compareTo(returningBook) == 0)
                if (Books[i].isBorrowed()) {
                    Books[i].returned();
                    System.out.println("You successfully returned " + returningBook);
                    return;
                }
        System.out.println("Sorry, this book is not from our catalog.");
    }


    void printAvailableBooks() {
        for (int i = 0; i < Books.length; i++)
            if (!Books[i].isBorrowed())
                System.out.println(Books[i].getTitle());

        if (Books.length == 0)
            System.out.println("Nos in catalog");
    }


    void borrowBook(String requestedBook) {
        for (int i = 0; i < Books.length; i++)
            if (Books[i].getTitle().compareTo(requestedBook) == 0)
                if (Books[i].isBorrowed()) {
                    System.out.println("Sorry, this book is already borrowed.");
                    return;
                } else {
                    Books[i].rented();
                    System.out.println("You successfully borrowed " + requestedBook);
                    return;
                }
        System.out.println("Sorry, this book is not in our catalog.");
    }


    private static void printOpeningHours() {
        System.out.println("Libraries are open daily from 9am to 5pm.");
    }


    void printAddress() {
        System.out.println(this.libraryAddress);

    }
}