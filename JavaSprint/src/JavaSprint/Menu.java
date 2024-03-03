package JavaSprint;

import java.util.List;
import java.util.Scanner;

// Main Menu Class
public class Menu {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Library library = new Library();
    List<Book> bookList = library.getBookList();
    List<Author> authorList = library.getAuthorList();
    List<Patron> patronList = library.getPatronList(); 
    Patron patron = new Patron();
    Book book = new Book();
    Author author = new Author();
    PatronAddress patronAddress = new PatronAddress();   

    // Generating dummy data for bookList
    Book book1 = new Book("1234567890", "Book 1", new Author(1, "Author 1", "01/01/1980", null), "Publisher 1", 5, BookStatus.AVAILABLE, null, null);
    Book book2 = new Book("0987654321", "Book 2", new Author(2, "Author 2", "02/02/1990", null), "Publisher 2", 3, BookStatus.AVAILABLE, null, null);
    Book book3 = new Book("9876543210", "Book 3", new Author(3, "Author 3", "03/03/2000", null), "Publisher 3", 7, BookStatus.AVAILABLE, null, null);
    library.getBookList().add(book1);
    library.getBookList().add(book2);
    library.getBookList().add(book3);

    // Generating dummy data for authorList
    Author author1 = new Author(1, "Author 1", "01/01/1980", null);
    Author author2 = new Author(2, "Author 2", "02/02/1990", null);
    Author author3 = new Author(3, "Author 3", "03/03/2000", null);
    library.getAuthorList().add(author1);
    library.getAuthorList().add(author2);
    library.getAuthorList().add(author3);

    // Generating dummy data for patronList
    Patron patron1 = new Patron(null, "Patron 1", "01/01/1970", null, "1234567890", "patron1@example.com", null);
    Patron patron2 = new Patron(null, "Patron 2", "02/02/1980", null, "0987654321", "patron2@example.com", null);
    Patron patron3 = new Patron(null, "Patron 3", "03/03/1990", null, "9876543210", "patron3@example.com", null);
    library.getPatronList().add(patron1);
    library.getPatronList().add(patron2);
    library.getPatronList().add(patron3);

    int choice;
    do {
      displayMainMenu();
      choice = input.nextInt();
      switch (choice) {
        case 1:
          displayBookMenu(library, input);
          break;

        case 2:
          displayAuthorMenu(library, input);
          break;

        case 3:
          displayPatronMenu(library, input);
          break;

        case 4:
          displayLibraryMenu(library, input, book, patron);
          break;

        case 5:
          System.out.println();
          System.out.println("Thank you for using Bookworm Buddy - Library Management System");
          System.out.println();
          break;
        default:
          System.out.println();
          System.out.println("Enter Number Between 1 to 5");
          System.out.println();
    }
} while (choice != 0 && choice < 5);
}

    private static void displayMainMenu() {
      System.out.println();
      System.out.println("****************** Welcome to ******************");
      System.out.println("   Bookworm Buddy - Library Management System");
      System.out.println("************************************************");
      System.out.println("1. Book Menu");
      System.out.println("2. Author Menu");
      System.out.println("3. Patron Menu");
      System.out.println("4. Library Menu");
      System.out.println("5. Exit");
      System.out.println();
      System.out.print("Enter your choice: ");
      System.out.println();
  }

    // Book Menu
    private static void displayBookMenu(Library library, Scanner input) {
    int choice;
    do {
      displayBookMenu();
      choice = input.nextInt();
      switch (choice) {
        case 1:
          // View All Books in BookList
          library.viewAllBooks();
          System.out.println();
          System.out.println("Book List: " + library.getBookList());
          System.out.println();
          break;

        case 2:
          // Add Book
          Book book = new Book(); 
          library.addToBookList(book);
          System.out.println();
          System.out.println("Book added successfully!");
          System.out.println();
          book.printBookInfo(book);
          break;
        
        case 3:
          // Edit Book
          library.viewAllBooks();
          int index;
          if (library.getBookList().isEmpty()) {
            System.out.println();
            System.out.println("No books in the library to edit!");
            System.out.println();
            break;
          }
          System.out.println();
          System.out.println("Enter the index of the book you want to edit: ");
          System.out.println();
          index = input.nextInt();
          library.editBook(library.getBookList().get(index));
          System.out.println();
          System.out.println("Book edited successfully!");
          System.out.println();
          library.getBookList().get(index).printBookInfo(library.getBookList().get(index));
          System.out.println();
          break;

        case 4:
          // Remove Book
          library.viewAllBooks();
          System.out.println();
          System.out.println("Enter the index of the book you want to edit: ");
          System.out.println();
          index = input.nextInt();
          if (library.getBookList().isEmpty()) {
            System.out.println();
            System.out.println("No books in the library to remove!");
            System.out.println();
            break;
          }
          library.removeBook(library.getBookList().get(index));
          System.out.println();
          System.out.println("Book removed successfully!");
          System.out.println();
          library.printBookList();
          System.out.println();
          break;

        case 5:
          // Add Book Copy
          System.out.println();
          library.addCopies();
          System.out.println();
          break;

        case 6:
          // Remove Book Copy
          System.out.println();
          library.removeCopies();
          System.out.println();
          break;

        case 7:
          // search Book by ISBN
          System.out.println();
          library.searchBookByISBN();
          System.out.println();
          break;

        case 8:
          // search Book by Title
          System.out.println();
          library.searchBookByTitle();
          System.out.println();
          break;

        case 9:
          // search Book by Author
          System.out.println();
          library.searchBookByAuthor();
          System.out.println();
          break;

        case 10:
          // Print Book Info
          System.out.println();
          library.viewChosenBook();
          System.out.println();
          break;

        case 11:
          // Exit
          System.out.println();
          System.out.println("Thank you for using Bookworm Buddy - Library Management System");
          System.out.println();
          break;

        default:
          System.out.println(); 
          System.out.println("Enter Number Between 0 to 11");
          System.out.println();
    }
    } while (choice != 0 && choice < 11);
}

    private static void displayBookMenu() {
      System.out.println();
      System.out.println("Bookworm Buddy - Book Menu");
      System.out.println();
      System.out.println("1. View All Books in BookList");
      System.out.println("2. Add Book");
      System.out.println("3. Edit Book");
      System.out.println("4. Remove Book");
      System.out.println("5. Add Book Copy");
      System.out.println("6. Remove Book Copy");
      System.out.println("7. Search Book by ISBN");
      System.out.println("8. Search Book by Title");
      System.out.println("9. Search Book by Author");
      System.out.println("10. Print Book Info");
      System.out.println("11. Exit");
      System.out.println();
      System.out.print("Enter your choice: ");
      System.out.println();
  }

    // Author Menu
    private static void displayAuthorMenu(Library library, Scanner input) {
      int choice;
      do {
        displayAuthorMenu();
        Author author = new Author();
        Book book = new Book();
        choice = input.nextInt();
        
        switch (choice) {
          case 1:
            // View All Authors in AuthorList
            System.out.println();
            library.viewAllAuthors();
            System.out.println();
            break;

          case 2:
            // Add Author
            System.out.println();
            library.addNewAuthor();
            System.out.println();
            break;

          case 3:
            // Edit Author
            System.out.println();
            library.editAuthor();
            System.out.println();
            break;

          case 4:
            // Remove Author
            System.out.println();
            library.removeAuthor();
            System.out.println();
            break;

          case 5:
            // Add Book to Author
            System.out.println();
            library.addBookToAuthor();
            System.out.println();
            break;

          case 6:
            // Remove Book from Author
            System.out.println();
            library.removeBookFromAuthor();
            System.out.println();
            break;

          case 7:
            // Print Author Info
            System.out.println();
            library.printChosenAuthorInfo();
            System.out.println();
            break;

          case 8:
            // Exit
            System.out.println();
            System.out.println("Thank you for using Bookworm Buddy - Library Management System");
            System.out.println();
            System.exit(0);

          default:
            System.out.println();
            System.out.println("Enter Number Between 0 to 8");
            System.out.println();
      }
    } while (choice != 0 && choice <= 8);
  }

    private static void displayAuthorMenu() {
      System.out.println();
      System.out.println("Bookworm Buddy - Author Menu");
      System.out.println();
      System.out.println("1. View All Authors in AuthorList");
      System.out.println("2. Add Author");
      System.out.println("3. Edit Author");
      System.out.println("4. Remove Author");
      System.out.println("5. Add Book to Author");
      System.out.println("6. Remove Book from Author");
      System.out.println("7. Print Author Info");
      System.out.println("8. Exit");
      System.out.println();
      System.out.print("Enter your choice: ");
      System.out.println();
  }

    // Patron Menu
    private static void displayPatronMenu(Library library, Scanner input) {
      int choice;
      do {
        displayPatronMenu();
        choice = input.nextInt();
        Patron patron = new Patron();

        switch (choice) {
          case 1:
            // View All Patrons in PatronList
            System.out.println();
            library.viewAllPatrons();
            System.out.println();
            break;

          case 2:
            // Add Patron
            System.out.println();
            library.addNewPatron();
            System.out.println();
            break;

          case 3:
            // Edit Patron
            System.out.println();
            library.editPatron();
            System.out.println();
            break;

          case 4:
            // Remove Patron
            System.out.println();
            library.removePatron();
            System.out.println();
            break;

          case 5:
            // Print Patron Info
            System.out.println();
            library.printChosenPatronInfo();
            System.out.println();
            break;

          case 6:
            // Exit
            System.out.println();
            System.out.println("Thank you for using Bookworm Buddy - Library Management System");
            System.out.println();
            System.exit(0);

          default:
            System.out.println();
            System.out.println("Enter Number Between 0 to 6");
            System.out.println();
      }
  } while (choice != 0 && choice <= 6);
}
    // Patron Menu
    private static void displayPatronMenu() {
      System.out.println();
      System.out.println("Bookworm Buddy - Patron Menu");
      System.out.println("1. View All Patrons in PatronList");
      System.out.println("2. Add Patron");
      System.out.println("3. Edit Patron");
      System.out.println("4. Remove Patron");
      System.out.println("5. Print Patron Info");
      System.out.println("6. Exit");
      System.out.println();
      System.out.print("Enter your choice: ");
      System.out.println();
  }

    // Library Menu
    public static void displayLibraryMenu(Library library, Scanner input, Book book, Patron patron) {
      int choice;
      do {
        displayLibraryMenu();
        choice = input.nextInt();
        BookStatus status = book.status;
        switch (choice) {
          case 1:
            // borrowBook
            System.out.println();
            library.borrowBook(patron, book);
            System.out.println();
            break;

          case 2:
            // returnBook
            System.out.println();
            library.returnBook(patron, book);
            System.out.println();
            break;

          case 3:
            // payLateFee
            System.out.println();
            library.payLateFee(patron, book);
            System.out.println();
            break;

          case 4:
            // Exit
            System.out.println();
            System.out.println("Thank you for using Bookworm Buddy - Library Management System");
            System.out.println();
            System.exit(0);

          default:
            System.out.println();
            System.out.println("Enter Number Between 0 to 4:");
            System.out.println();
      }
    } while (choice != 0 && choice <= 4);
}

    private static void displayLibraryMenu() {
      System.out.println();
      System.out.println("Bookworm Buddy - Library Menu");
      System.out.println();
      System.out.println("1. Borrow Book");
      System.out.println("2. Return Book");
      System.out.println("3. Pay Late Fee");
      System.out.println("4. Print Library Info");
      System.out.println("5. Exit");
      System.out.println();
      System.out.print("Enter your choice: ");
      System.out.println();
    }
}
