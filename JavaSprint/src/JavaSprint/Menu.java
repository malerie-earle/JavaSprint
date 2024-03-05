package JavaSprint;

import java.util.List;
import java.util.Scanner;

/**
 * Main Menu Class for Bookworm Buddy - Library Management System
 */
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
      Book book1 = new Book("9780590353427", "Harry Potter and the Philosopher's Stone", new Author(1, "J.K. Rowling", "31/07/1965", null), "Bloomsbury Publishing", 5, BookStatus.AVAILABLE, null, null);
      Book book2 = new Book("9780439554930", "The Hunger Games", new Author(2, "Suzanne Collins", "10/08/1962", null), "Scholastic Corporation", 3, BookStatus.AVAILABLE, null, null);
      Book book3 = new Book("9780439139601", "Twilight", new Author(3, "Stephenie Meyer", "24/12/1973", null), "Little, Brown and Company", 7, BookStatus.AVAILABLE, null, null);
      Book book4 = new Book("9780439136365", "The Hobbit", new Author(4, "J.R.R. Tolkien", "03/01/1892", null), "Allen & Unwin", 4, BookStatus.AVAILABLE, null, null);
      Book book5 = new Book("9780439358071", "A Game of Thrones", new Author(5, "George R.R. Martin", "20/09/1948", null), "Bantam Spectra", 6, BookStatus.AVAILABLE, null, null);
      Book book6 = new Book("9780439784542", "The Da Vinci Code", new Author(6, "Dan Brown", "22/06/1964", null), "Doubleday", 8, BookStatus.AVAILABLE, null, null);
      Book book7 = new Book("9780545010221", "Murder on the Orient Express", new Author(7, "Agatha Christie", "15/09/1890", null), "Collins Crime Club", 10, BookStatus.AVAILABLE, null, null);
      Book book8 = new Book("9780439139592", "The Handmaid's Tale", new Author(8, "Margaret Atwood", "18/11/1939", null), "McClelland & Stewart", 3, BookStatus.AVAILABLE, null, null);
      Book book9 = new Book("9780439203524", "To Kill a Mockingbird", new Author(9, "Harper Lee", "28/04/1926", null), "J. B. Lippincott & Co.", 5, BookStatus.AVAILABLE, null, null);
      Book book10 = new Book("9780545139700", "Matilda", new Author(10, "Roald Dahl", "13/09/1916", null), "Jonathan Cape", 7, BookStatus.AVAILABLE, null, null);

      library.getBookList().add(book1);
      library.getBookList().add(book2);
      library.getBookList().add(book3);
      library.getBookList().add(book4);
      library.getBookList().add(book5);
      library.getBookList().add(book6);
      library.getBookList().add(book7);
      library.getBookList().add(book8);
      library.getBookList().add(book9);
      library.getBookList().add(book10);

      // Generating dummy data for authorList
      Author author1 = new Author(1, "J.K. Rowling", "31/07/1965", null);
      Author author2 = new Author(2, "Suzanne Collins", "10/08/1962", null);
      Author author3 = new Author(3, "Stephenie Meyer", "24/12/1973", null);
      Author author4 = new Author(4, "J.R.R. Tolkien", "03/01/1892", null);
      Author author5 = new Author(5, "George R.R. Martin", "20/09/1948", null);
      Author author6 = new Author(6, "Dan Brown", "22/06/1964", null);
      Author author7 = new Author(7, "Agatha Christie", "15/09/1890", null);
      Author author8 = new Author(8, "Margaret Atwood", "18/11/1939", null);
      Author author9 = new Author(9, "Harper Lee", "28/04/1926", null);
      Author author10 = new Author(10, "Roald Dahl", "13/09/1916", null);

      library.getAuthorList().add(author1);
      library.getAuthorList().add(author2);
      library.getAuthorList().add(author3);
      library.getAuthorList().add(author4);
      library.getAuthorList().add(author5);
      library.getAuthorList().add(author6);
      library.getAuthorList().add(author7);
      library.getAuthorList().add(author8);
      library.getAuthorList().add(author9);
      library.getAuthorList().add(author10);

      PatronAddress address1 = new PatronAddress("123 Elm Street", "Springfield", "IL", "12345");
      Patron patron1 = new Patron(1, "John Doe", "01/01/1970", address1, "555-123-4567", "john.doe@example.com", null);
      PatronAddress address2 = new PatronAddress("456 Oak Avenue", "Birmingham", "AL", "54321");
      Patron patron2 = new Patron(2, "Jane Smith", "02/02/1980", address2, "555-987-6543", "jane.smith@example.com", null);
      PatronAddress address3 = new PatronAddress("789 Maple Street", "New York", "NY", "67890");
      Patron patron3 = new Patron(3, "Bob Johnson", "03/03/1990", address3, "555-456-7890", "bob.johnson@example.com", null);
      PatronAddress address4 = new PatronAddress("1010 Pine Road", "Los Angeles", "CA", "98765");
      Patron patron4 = new Patron(4, "Emily Brown", "04/04/1985", address4, "555-789-0123", "emily.brown@example.com", null);
      PatronAddress address5 = new PatronAddress("1313 Cedar Avenue", "Chicago", "IL", "54321");
      Patron patron5 = new Patron(5, "Michael Wilson", "05/05/1975", address5, "555-321-6789", "michael.wilson@example.com", null);
      PatronAddress address6 = new PatronAddress("1515 Birch Street", "San Francisco", "CA", "13579");
      Patron patron6 = new Patron(6, "Sarah Davis", "06/06/1989", address6, "555-987-6543", "sarah.davis@example.com", null);
      PatronAddress address7 = new PatronAddress("1717 Spruce Avenue", "Seattle", "WA", "24680");
      Patron patron7 = new Patron(7, "David Wilson", "07/07/1987", address7, "555-456-7890", "david.wilson@example.com", null);
      PatronAddress address8 = new PatronAddress("1919 Oak Lane", "Denver", "CO", "13579");
      Patron patron8 = new Patron(8, "Emma Johnson", "08/08/1988", address8, "555-123-4567", "emma.johnson@example.com", null);
      PatronAddress address9 = new PatronAddress("2020 Maple Drive", "Boston", "MA", "97531");
      Patron patron9 = new Patron(9, "James Smith", "09/09/1986", address9, "555-987-2121", "cat@gmail.com", null);

      library.getPatronList().add(patron1);
      library.getPatronList().add(patron2);
      library.getPatronList().add(patron3);
      library.getPatronList().add(patron4);
      library.getPatronList().add(patron5);
      library.getPatronList().add(patron6);
      library.getPatronList().add(patron7);
      library.getPatronList().add(patron8);
      library.getPatronList().add(patron9);

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

    /**
     * Displays the main menu options
     */
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

   /**
     * Displays the book menu options.
     * @param library The library object.
     * @param input The scanner object for user input.
     */
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
          System.out.println();
          book.printBookInfo();
          System.out.println("Book added successfully!");
          break;
        
        case 3:
          // Edit Book
          library.editBook();
          break;

        case 4:
          // Remove Book
          library.removeBook();
          break;

        case 5:
          // search Book by ISBN
          System.out.println();
          library.searchBookByISBN();
          System.out.println();
          break;

        case 6:
          // search Book by Title
          System.out.println();
          library.searchBookByTitle();
          System.out.println();
          break;

        case 7:
          // search Book by Author
          System.out.println();
          library.searchBookByAuthor();
          System.out.println();
          break;

        case 8:
          // Exit
          System.out.println();
          System.out.println("Thank you for using Bookworm Buddy - Library Management System");
          System.out.println();
          break;

        default:
          System.out.println(); 
          System.out.println("Enter Number Between 0 to 8");
          System.out.println();
    }
    } while (choice != 0 && choice < 8);
}

    private static void displayBookMenu() {
      System.out.println();
      System.out.println("Bookworm Buddy - Book Menu");
      System.out.println();
      System.out.println("1. View All Books in BookList");
      System.out.println("2. Add Book");
      System.out.println("3. Edit Book");
      System.out.println("4. Remove Book");
      System.out.println("5. Search Book by ISBN");
      System.out.println("6. Search Book by Title");
      System.out.println("7. Search Book by Author");
      System.out.println("8. Exit");
      System.out.println();
      System.out.print("Enter your choice: ");
      System.out.println();
  }

   /**
     * Displays the author menu options.
     * @param library The library object.
     * @param input The scanner object for user input.
     */
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

    /**
     * Displays the patron menu options.
     * @param library The library object.
     * @param input The scanner object for user input.
     */
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

    /**
     * Displays the library menu options.
     * @param library The library object.
     * @param input The scanner object for user input.
     * @param book The book object.
     * @param patron The patron object.
     */
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
            library.borrowBook();
            System.out.println();
            break;

          case 2:
            // returnBook
            System.out.println();
            library.returnBook();
            System.out.println();
            break;

          case 3:
            // payLateFee
            System.out.println();
            library.payLateFee();
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
