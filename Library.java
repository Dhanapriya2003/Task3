package task3;

public class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookID() == bookID) {
                books[i] = books[--bookCount];
                books[bookCount] = null; // Clear the last spot
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public Book searchBook(int bookID) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookID() == bookID) {
                return books[i];
            }
        }
        return null;
    }

    public void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Books in the library:");
            for (int i = 0; i < bookCount; i++) {
                System.out.println(books[i]);
            }
        }
    }

}
