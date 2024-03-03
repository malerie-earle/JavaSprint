package JavaSprint;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Library {
  private List<Book> bookList;
  private List<Author> authorList;
  private List<Patron> patronList;

  public Library() {
      bookList = new ArrayList<>();
      authorList = new ArrayList<>();
      patronList = new ArrayList<>();
  }

  public List<Book> getBookList() {
      return bookList;
  }

  public List<Author> getAuthorList() {
      return authorList;
  }

  public List<Patron> getPatronList() {
      return patronList;
  }

    // Method to View All Books
    public void viewAllBooks() {
        for (Book book : bookList) {
          if (bookList.isEmpty()) {
            System.out.println();
            System.out.println("No books in library.");
            System.out.println();
            break;
          } else {
            System.out.println();
            book.printBookInfo(book);
            System.out.println();
        }
    }
  }

    // Method to Add Book to library books
    public void addToBookList(Book book) {
      Author author = new Author();
      Scanner input = new Scanner(System.in);
      System.out.println();
      System.out.println("Enter Book Information to Add to BookList: ");
      System.out.println();
      System.out.println("Enter ISBN: ");
      System.out.println();
      book.setISBN(input.nextLine());
      System.out.println();
      System.out.println("Enter Title: ");
      System.out.println();
      book.setTitle(input.nextLine());
      System.out.println();
      System.out.println("Enter Author Information: ");
      System.out.println();
      book.setAuthor(author);
      System.out.println();
      System.out.println("Enter Author ID: ");
      System.out.println();
      author.setAuthorID(input.nextInt());
      System.out.println();
      System.out.println("Enter Author Name: ");
      System.out.println();
      author.setAuthorName(input.nextLine());
      System.out.println();
      System.out.println("Enter Author Date of Birth: ");
      System.out.println();
      author.setDateOfBirth(input.nextLine());
      System.out.println();
      book.setAuthor(author);
      System.out.println();
      System.out.println("Enter Publisher: ");
      System.out.println();
      book.setPublisher(input.nextLine());
      System.out.println();
      System.out.println("Enter Total Number of Copies: ");
      System.out.println();
      book.setCopies(input.nextInt());
      System.out.println();
      book.setNewStatus(book);
      System.out.println();
      bookList.add(book);
      System.out.println();
  }

    // Method to Edit Book in library bookList
    public void editBook(Book book) {
        Scanner input = new Scanner(System.in);
        Author author = new Author();
        System.out.println();
        System.out.println("Enter New Book Information: ");
        System.out.println();
        System.out.println("Enter New ISBN: ");
        System.out.println();
        book.setISBN(input.nextLine());
        System.out.println();
        System.out.println("Enter New Title: ");
        System.out.println();
        book.setTitle(input.nextLine());
        System.out.println();
        System.out.println("Enter Author Information: ");
        System.out.println();
        book.setAuthor(author);
        System.out.println();
        System.out.println("Enter Author ID: ");
        System.out.println();
        author.setAuthorID(input.nextInt());
        System.out.println();
        System.out.println("Enter Author Name: ");
        System.out.println();
        author.setAuthorName(input.nextLine());
        System.out.println();
        System.out.println("Enter Author Date of Birth: ");
        System.out.println();
        author.setDateOfBirth(input.nextLine());
        System.out.println();
        book.setAuthor(author);
        System.out.println();
        System.out.println("Enter Publisher: ");
        System.out.println();
        book.setPublisher(input.nextLine());
        System.out.println();
        System.out.println("Enter Total Number of Copies: ");
        System.out.println();
        book.setCopies(input.nextInt());
        System.out.println();
        book.setNewStatus(book);
        System.out.println();
        bookList.add(book);
        System.out.println();
    }

    // Method to Remove Book from library bookList
    public void removeBook(Book book) {
        bookList.remove(book);
        System.out.println();
        System.out.println("Book Removed Successfully");
        System.out.println();
    }

      // Method to Print Book Info
    public void printBookInfo(Book book) {
      System.out.println("Book Information:");
      System.out.println();
      System.out.println("Title: " + book.bookTitle);
      System.out.println("Author: " + book.bookAuthor);
      System.out.println("Publisher: " + book.bookPublisher);
      System.out.println("ISBN: " + book.ISBN);
      System.out.println("Number of Copies: " + book.numCopies);
      System.out.println("Status: " + book.status);
      System.out.println();
    }

    // Method to print bookList
    public void printBookList() {
      for (Book book : bookList) {
        System.out.println();
        book.printBookInfo(book);
        System.out.println();
      }
    }

    // Method to Add Copies
    public void addCopies() {
      Library library = new Library();
        for (Book book : bookList) {
          if (bookList.isEmpty()) {
            System.out.println();
            System.out.println("No books in the library to search!");
            System.out.println();
            break;
          } else {
            System.out.println();
            library.viewAllBooks();
            System.out.println();
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("Enter the index of the book you want to edit: ");
            System.out.println();
            int index = input.nextInt() - 1;
            System.out.println();
            System.out.println("Enter the number of copies to add: ");
            System.out.println();
            int copies = input.nextInt();
            System.out.println();
            int newCopies = book.getNumCopies(book) + copies;
            System.out.println();
            book.setCopies(newCopies);
            System.out.println();
            System.out.println("Copies have been added.");
            System.out.println();
            System.out.println("Total Number of Copies: " + book.getNumCopies(book));
            System.out.println();
            break;
          }
         }
    }

    // Method to Remove Copies
    public void removeCopies() {
      Library library = new Library();
        for (Book book : bookList) {
          if (bookList.isEmpty()) {
            System.out.println();
            System.out.println("No books in the library to search!");
            System.out.println();
            break;
          } else {
            library.viewAllBooks();
            Scanner input = new Scanner(System.in);
            System.out.println();
            System.out.println("Enter the index of the book you want to edit: ");
            System.out.println();
            int index = input.nextInt() - 1;
            System.out.println();
            System.out.println("Enter the number of copies to remove: ");
            System.out.println();
            int copies = input.nextInt();
            int currentCopies = book.getNumCopies(book);
            if (currentCopies > 0 && currentCopies >= copies) {
                int newCopies = currentCopies - copies;
                book.setCopies(newCopies);
                System.out.println();
                System.out.println("Copies have been removed.");
                System.out.println();
                System.out.println("Total Number of Copies: " + book.getNumCopies(book));
                System.out.println();
                break;
            } else {
              System.out.println();
              System.out.println("No copies to remove.");
              System.out.println();
              break;
          }
          }
        }
      }

    // Search for book by ISBN
    public Book searchBookByISBN() {
      if (bookList.isEmpty()) {
        System.out.println();
        System.out.println("No books in the library to search!");
        System.out.println();
        return null;
      }
      Scanner input = new Scanner(System.in);
      System.out.println();
      System.out.println("Enter ISBN to Search Books: ");
      System.out.println();
      String searchISBN = input.nextLine();
      for (Book book : bookList) {
          if (book.getISBN(book).equals(searchISBN)) {
            System.out.println();
              System.out.println("Book found successfully!");
              System.out.println();
              book.printBookInfo(book);
              System.out.println();
              return book;
          }
      }
      System.out.println();
      System.out.println("Book not found!");
      System.out.println();
      return null;
    }

      // Search for book by Title
      public Book searchBookByTitle() {
        if (bookList.isEmpty()) {
          System.out.println();
          System.out.println("No books in the library to search!");
          System.out.println();
          return null;
        }
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Title to Search Books: ");
        System.out.println();
        String searchTitle = input.nextLine();
        for (Book book : bookList) {
            if (book.getTitle(book).equalsIgnoreCase(searchTitle)) {
              System.out.println();
              System.out.println("Book found successfully!");
              System.out.println();
              book.printBookInfo(book);
              System.out.println();
              return book;
            }
        }
        System.out.println();
        System.out.println("Book not found!");
        System.out.println();
        return null;
      }

      // Search for book by Author
      public void searchBookByAuthor() {
        if (bookList.isEmpty()) {
          System.out.println();
          System.out.println("No books in the library to search!");
          System.out.println();
          return;
        }
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter Author Name to Search Books: ");
        System.out.println();
        String searchAuthorName = input.nextLine();
        for (Book book : bookList) {
            if (book.getAuthor(book).getAuthorName().equalsIgnoreCase(searchAuthorName)) {
              System.out.println();
              System.out.println("Book found successfully!");
              System.out.println();
              book.printBookInfo(book);
              System.out.println();
              return;
            }
        }
        System.out.println();
        System.out.println("Book not found!");
        System.out.println();
      }

      // Method to view chosen book
      public void viewChosenBook() {
        for (Book book : bookList) {
          if (bookList.isEmpty()) {
            System.out.println();
            System.out.println("No books in the library to search!");
            System.out.println();
            break;
          } else {
            Scanner input = new Scanner(System.in);
            Library library = new Library();
            System.out.println();
            library.viewAllBooks();
            System.out.println();
            System.out.println("Enter the index of the book you want to view: ");
            System.out.println();
            int index = input.nextInt() - 1;
            System.out.println();
            book.printBookInfo(book);
            System.out.println();
            break;
        }
      }
    }


    // Author Methods
    // Method to View All Authors
    public void viewAllAuthors() {
        for (Author author : authorList) {
          System.out.println();
          author.printAuthorInfo();
          System.out.println();
        }
    }

    // Method to Add New Author
    public void addNewAuthor() {
        Author newAuthor = new Author();
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter New Author Information: ");
        System.out.println();
        System.out.println("Enter Author ID: ");
        newAuthor.setAuthorID(input.nextInt());
        System.out.println();
        System.out.println("Enter Author Name: ");
        // wont work with just one for some reason
        newAuthor.setAuthorName(input.nextLine()); 
        newAuthor.setAuthorName(input.nextLine()); 
        System.out.println();
        System.out.println("Enter Author Date of Birth: ");
        newAuthor.setDateOfBirth(input.nextLine());
        System.out.println();
        System.out.println("Enter Book List: ");
        newAuthor.printAuthorInfo();
        System.out.println();
        authorList.add(newAuthor);
        System.out.println();
    }

    // Method to edit an author
    public void editAuthor() {
      viewAllAuthors();
      for (Author author : authorList) {
        if (authorList.isEmpty()) {
          System.out.println();
          System.out.println("No authors in the library to search!");
          System.out.println();
          break;
        } else {
          Scanner input = new Scanner(System.in);
          System.out.println();
          System.out.println("Enter the index of the author you want to edit: ");
          System.out.println();
          int index = input.nextInt() - 1;
          System.out.println();
          System.out.println("Enter New Author Information: ");
          System.out.println();
          System.out.println("Enter Author ID: ");
          author.setAuthorID(input.nextInt());
          System.out.println();
          System.out.println("Enter Author Name: ");
          author.setAuthorName(input.nextLine());
          author.setAuthorName(input.nextLine()); 
          System.out.println();
          System.out.println("Enter Date of Birth: ");
          author.setDateOfBirth(input.nextLine());
          System.out.println();
          System.out.println("Enter Book List: ");
          author.printAuthorInfo();
          System.out.println();
          break;
      }
    }
  }

    // Method to remove an author
    public void removeAuthor() {
      viewAllAuthors();
        if (authorList.isEmpty()) {
          System.out.println();
          System.out.println("No authors in the library to search!");
          System.out.println();
          return;
        } else {
          Scanner input = new Scanner(System.in);
          System.out.println();
          System.out.println("Enter the index of the author you want to edit: ");
          System.out.println();
          int index = input.nextInt() - 1;

          if (index < 0 || index >= authorList.size()) {
            System.out.println("Invalid index. Please try again.");
            return;
        }
        authorList.remove(index);
        System.out.println("Author removed successfully!");
    }
    }

    // Method to add a book to the author's book list
    public void addBookToAuthor() {
      viewAllAuthors();
      if (authorList.isEmpty()) {
          System.out.println("No authors in the library to search!");
          return;
      }
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the index of the author you want to edit: ");
      int index = input.nextInt() - 1;
      if (index < 0 || index >= authorList.size()) {
          System.out.println("Invalid index. Please try again.");
          return;
      }
      Author selectedAuthor = authorList.get(index);
      viewAllBooks();
      System.out.println("Enter the index of the book you want to add: ");
      if (index < 0 || index >= bookList.size()) {
          System.out.println("Invalid index. Please try again.");
          return;
      }
      Book book = bookList.get(index);
      selectedAuthor.authorBookList.add(book);
      System.out.println("Book added to author successfully!");
  }

    // Method to remove a book to the author's book list
    public void removeBookFromAuthor() {
      viewAllAuthors();
      if (authorList.isEmpty()) {
          System.out.println("No authors in the library to search!");
          return;
      }
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the index of the author you want to edit: ");
      int index = input.nextInt() - 1;
      if (index < 0 || index >= authorList.size()) {
          System.out.println("Invalid index. Please try again.");
          return;
      }
      Author selectedAuthor = authorList.get(index);
      viewAllBooks();
      System.out.println("Enter the index of the book you want to remove: ");
      if (index < 0 || index >= bookList.size()) {
          System.out.println("Invalid index. Please try again.");
          return;
      }
      Book book = bookList.get(index);
      selectedAuthor.authorBookList.remove(book);
      System.out.println("Book removed from author successfully!");
  }

    // Method to print chosen author
    public void printChosenAuthorInfo() {
      viewAllAuthors();
      if (authorList.isEmpty()) {
          System.out.println("No authors in the library to search!");
          return;
      }
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the index of the author you want to print: ");
      int index = input.nextInt() - 1;
      if (index < 0 || index >= authorList.size()) {
          System.out.println("Invalid index. Please try again.");
          return;
      }
      Author selectedAuthor = authorList.get(index);
      selectedAuthor.printAuthorInfo();
  }


    // Patron Methods
    // Method to View All Patrons
    public void viewAllPatrons() {
      for (Patron patron : patronList) {
        System.out.println();
        patron.printPatronInfo(patron);
        System.out.println();
      }
  }

    // Method to Add New Patron
    public void addNewPatron() {
        Patron newPatron = new Patron();
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter New Patron Information: ");
        System.out.println();
        System.out.println("Enter Library Card: ");
        newPatron.setLibraryCard(input.nextInt());
        System.out.println();
        System.out.println("Enter Patron Name: ");
        newPatron.setPatronName(input.nextLine());
        newPatron.setPatronName(input.nextLine());
        System.out.println();
        System.out.println("Enter Date of Birth: ");
        newPatron.setDateOfBirth(input.nextLine());
        System.out.println();
        System.out.println("Enter Patron Address: ");
        newPatron.addPatronAddress(newPatron);
        System.out.println();
        System.out.println("Enter Phone Number: ");
        newPatron.setPhNum(input.nextLine());
        System.out.println();
        System.out.println("Enter Email: ");
        newPatron.setEmail(input.nextLine());
        System.out.println();
        System.out.println("Patron Added Successfully");
        newPatron.printPatronInfo(newPatron);
        System.out.println();
        patronList.add(newPatron);
        newPatron.printPatronInfo(newPatron);
        System.out.println();
    }

        // Method to Edit Patron
        public void editPatron() {
          viewAllPatrons();
      for (Patron patron : patronList) {
        if (patronList.isEmpty()) {
          System.out.println();
          System.out.println("No patrons in the library to search!");
          System.out.println();
          break;
        } else {
          Scanner input = new Scanner(System.in);
          System.out.println();
          System.out.println("Enter the index of the patron you want to edit: ");
          System.out.println();
          int index = input.nextInt() - 1;
          System.out.println();
          System.out.println("Enter New Patron Information: ");
          System.out.println();
          System.out.println("Enter New Library Card: ");
          patron.setLibraryCard(input.nextInt());
          System.out.println();
          System.out.println("Enter New Patron Name: ");
          patron.setPatronName(input.nextLine());
          patron.setPatronName(input.nextLine());
          System.out.println();
          System.out.println("Enter New Date of Birth: ");
          patron.setDateOfBirth(input.nextLine());
          System.out.println();
          System.out.println("Enter New Patron Address: ");
          patron.addPatronAddress(patron);
          System.out.println();
          System.out.println("Enter New Phone Number: ");
          patron.setPhNum(input.nextLine());
          System.out.println();
          System.out.println("Enter New Email: ");
          patron.setEmail(input.nextLine());
          System.out.println();
          System.out.println("Patron Edited Successfully");
          System.out.println();
          patron.printPatronInfo(patron);
          System.out.println();
          break;
      }
    }
  }

    // Method to remove patron
    public void removePatron() {
      viewAllPatrons();
      if (patronList.isEmpty()) {
          System.out.println("No patrons in the library to search!");
          return;
      }
  
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the index of the patron you want to remove: ");
      int index = input.nextInt();
  
      if (index < 0 || index >= patronList.size()) {
          System.out.println("Invalid index. Please try again.");
          return;
      }
  
      patronList.remove(index);
      System.out.println("Patron removed successfully!");
  }

    // Method to add patron address
    public void addPatronAddress(Patron patron) {
      PatronAddress patronAddress = new PatronAddress();
      Scanner input = new Scanner(System.in);
      System.out.println();
      System.out.println("Enter New Patron Address: ");
      System.out.println();
      System.out.println("Enter Street Address: ");
      patronAddress.setStreetAddress(input.nextLine());
      System.out.println();
      System.out.println("Enter City: ");
      patronAddress.setCity(input.nextLine());
      System.out.println();
      System.out.println("Enter Province: ");
      patronAddress.setProvince(input.nextLine());
      System.out.println();
      System.out.println("Enter Postal Code: ");
      patronAddress.setPostalCode(input.nextLine());
      System.out.println();
      System.out.println("Patron Address Added Successfully");
      System.out.println();
      patronAddress.printPatronAddress(patronAddress);
      System.out.println();
    }

    // Method to edit patron address
    public void editPatronAddress(PatronAddress patronAddress) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter New Patron Address: ");
        System.out.println();
        System.out.println("Enter Street Address: ");
        patronAddress.setStreetAddress(input.nextLine());
        System.out.println();
        System.out.println("Enter City: ");
        patronAddress.setCity(input.nextLine());
        System.out.println();
        System.out.println("Enter Province: ");
        patronAddress.setProvince(input.nextLine());
        System.out.println();
        System.out.println("Enter Postal Code: ");
        patronAddress.setPostalCode(input.nextLine());
        System.out.println();
        System.out.println("Patron Address Updated Successfully");
        System.out.println();
        patronAddress.printPatronAddress(patronAddress);
        System.out.println();
    }

    // Method to remove patron address
    public void removePatronAddress(PatronAddress patronAddress) {
        patronAddress = null;
    }

    // Method to print patron information
    public void printChosenPatronInfo() {
      viewAllPatrons();
      if (patronList.isEmpty()) {
          System.out.println("No patrons in the library to search!");
          return;
      }
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the index of the patron you want to print: ");
      int index = input.nextInt() - 1;
      if (index < 0 || index >= patronList.size()) {
          System.out.println("Invalid index. Please try again.");
          return;
      }
      Patron selectedPatron = patronList.get(index);
      selectedPatron.printPatronInfo(selectedPatron);
  }


    // Method to borrow book
    public void borrowBook(Patron patron, Book book) {
      if (book.status == BookStatus.BORROWED || book.status == BookStatus.OVERDUE || book.status == BookStatus.LOST || book.status == BookStatus.UNAVAILABLE || book.status == BookStatus.REMOVED) {
        System.out.println();
      System.out.println("Sorry, Book is already borrowed and unavailable. Try a different book!");
      System.out.println();
      } else if (book.status == BookStatus.AVAILABLE) {
          book.numCopies--;
          book.borrowedDate = new Date();
          book.returnDate = null;
          patron.addToBorrowedBooks(patron, book);
          
          if (book.numCopies ==  0) {
          book.status = BookStatus.BORROWED;
          } else {
          book.status = BookStatus.AVAILABLE;
          }
  }
  }

  // Method to print late fee
  public void printLateFee(Patron patron, double lateFee) {
    System.out.println();
    System.out.println("Late Fee: " + lateFee);
    System.out.println();
  }

  // Method to return book
  public void returnBook(Patron patron, Book book) {
      book.numCopies++;
      double lateFee = 0; 
      double lostFee = 0;
      patron.removeFromBorrowedBooks(patron, book);
      Date returnDate = new Date();
      Date borrowedDate = book.borrowedDate;
      long timeDifference = returnDate.getTime() - borrowedDate.getTime();
      double daysDifference = timeDifference / (1000 * 60 * 60 * 24);
      if (daysDifference > 14) {
          book.status = BookStatus.OVERDUE;
          lateFee = daysDifference * 0.25;
      } else if (daysDifference > 45) {
        book.status = BookStatus.LOST;
        lostFee = 10 + lateFee;
      } else {
          lateFee = 0;
          lostFee = 0;
          book.status = BookStatus.AVAILABLE;
      }
      printLateFee(patron, lateFee);
  }

    public void setLateFee(Patron patron, double lateFee) {
      patron.setLateFee(lateFee);
    }  

    // Method to pay late fee
    public void payLateFee(Patron patron, Book book) {
      double lateFee = 0; 
      book.setStatus(BookStatus.AVAILABLE);
    }


  }
