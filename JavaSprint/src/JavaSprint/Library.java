package JavaSprint;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * The Library class represents a library system.
 * It manages books, authors, and patrons.
 */
public class Library {
  public List<Book> bookList;
  public List<Author> authorList;
  public List<Patron> patronList;

  /**
     * Constructs a Library object with empty lists for books, authors, and patrons.
     */
  public Library() {
      bookList = new ArrayList<>();
      authorList = new ArrayList<>();
      patronList = new ArrayList<>();
  }

  /**
   * Retrieves the list of books in the library.
   * @return The list of books.
   */
  public List<Book> getBookList() {
      return bookList;
  }

  /**
   * Retrieves the list of authors in the library.
   * @return The list of authors.
   */
  public List<Author> getAuthorList() {
      return authorList;
  }

  /**
   * Retrieves the list of patrons in the library.
   * @return The list of patrons.
   */
  public List<Patron> getPatronList() {
      return patronList;
  }

    /**
     * Displays information about all books in the library.
     */
    public void viewAllBooks() {
      if (bookList.isEmpty()) {
        System.out.println();
        System.out.println("No books in library.");
        System.out.println();
      } else {
        for (int i = 0; i < bookList.size(); i++) {
          System.out.println();
          System.out.println("Index: " + (i + 1));
          bookList.get(i).printBookInfo(); 
          System.out.println();
        }
      }
    }

    /**
     * Adds a new book to the library.
     * @param book The book to be added.
     */
    public void addToBookList(Book book) {
      Scanner input = new Scanner(System.in);
      
      // Get book information from user
      System.out.println();
      System.out.println("Enter Book Information to Add to BookList: ");
      System.out.println();
      System.out.println("Enter ISBN: ");
      book.setISBN(input.nextLine());
      System.out.println();
      System.out.println("Enter Title: ");
      book.setTitle(input.nextLine());
      System.out.println();

      // Create new Author object
      Author author = new Author();
      System.out.println("Enter Author Information: ");
      System.out.println();
      System.out.println("Enter Author ID: ");
      author.setAuthorID(input.nextInt());
      input.nextLine(); // Consume newline
      System.out.println();
      System.out.println("Enter Author Name: ");
      author.setAuthorName(input.nextLine());
      System.out.println();
      System.out.println("Enter Author Date of Birth (YYYY-MM-DD): ");
      author.setDateOfBirth(input.nextLine());
      System.out.println();

      // Set author of book
      book.setAuthor(author);
      System.out.println();

      // Get remaining book information
      System.out.println("Enter Publisher: ");
      book.setPublisher(input.nextLine());
      System.out.println();
      System.out.println("Enter Total Number of Copies: ");
      book.setCopies(input.nextInt());
      System.out.println();

      // Set status of book
      book.setNewStatus(book);
      bookList.add(book);
  }

    /**
     * Edits information about a book in the library.
     * @param book The book to be edited.
     */
    public void editBook() {
      Scanner input = new Scanner(System.in);
      if (bookList.isEmpty()) {
        System.out.println("No books in the library to edit!");
        return;
      }
      Book book = null;
      // Display all books in the library
      viewAllBooks();
      System.out.println("Enter the index of the book: ");
      int index = input.nextInt(); 
      index--;
      if (index >= 0 && index < bookList.size()) {
        book = bookList.get(index);
      } else {
          System.out.println("Invalid index.");
      }
        // Get book information from user
        System.out.println();
        System.out.println("Enter New Book Information to Update BookList: ");
        System.out.println();
        System.out.println("Enter New ISBN: ");
        input.nextLine(); // Consume newline
        book.setISBN(input.nextLine());
        System.out.println();
        System.out.println("Enter New Title: ");
        book.setTitle(input.nextLine());
        System.out.println();

        // Create new Author object
        Author author = new Author();
        System.out.println("Enter New Author Information: ");
        System.out.println();
        System.out.println("Enter New Author ID: ");
        author.setAuthorID(input.nextInt());
        input.nextLine(); // Consume newline

        System.out.println();
        System.out.println("Enter New Author Name: ");
        author.setAuthorName(input.nextLine());
        System.out.println();
        System.out.println("Enter New Author Date of Birth (YYYY-MM-DD): ");
        author.setDateOfBirth(input.nextLine());
        System.out.println();
  
        // Set author of book
        book.setAuthor(author);
        System.out.println();
  
        // Get remaining book information
        System.out.println("Enter New Publisher: ");
        book.setPublisher(input.nextLine());
        System.out.println();
        System.out.println("Enter Total Number of Copies: ");
        book.setCopies(input.nextInt());
        System.out.println();
  
        // Set status of book
        book.setNewStatus(book);
        System.out.println();

        System.out.println();
        System.out.println("Book edited successfully!");
        System.out.println();

        viewAllBooks();
    }

    /**
     * Removes a book from the library.
     * @param book The book to be removed.
     */
    public void removeBook() {
      Scanner input = new Scanner(System.in);
      if (bookList.isEmpty()) {
        System.out.println("No books in the library to edit!");
        return;
      }
      viewAllBooks();
      System.out.println("Enter the index of the book: ");
      int index = input.nextInt(); 
      index--;
      if (index >= 0 && index < bookList.size()) {
          Book book = bookList.get(index);
      } else {
          System.out.println("Invalid index.");
      }
        bookList.remove(index);
        System.out.println();
        System.out.println("Book Removed Successfully");
        System.out.println();
        viewAllBooks();
    }
  

    /**
     * Prints the information of the book, including its ISBN, title, author,
     * publisher, number of copies, and status.
     * @param book The book object whose information is to be printed.
     */
    public void printBookInfo() {
      for (Book book : bookList) {
        if (bookList.isEmpty()) {
          System.out.println();
          System.out.println("No books in the library to search!");
          System.out.println();
          break;
        } else {
          System.out.println();
          viewAllBooks();
          System.out.println();
          Scanner input = new Scanner(System.in);
          System.out.println();
          System.out.println("Enter the index of the book you want to edit: ");
          System.out.println();
          int index = input.nextInt() - 1;
          System.out.println();
          System.out.println("Book Information:");
          System.out.println();
          System.out.println("ISBN: " + book.ISBN);
          System.out.println("Title: " + book.bookTitle);
          System.out.println("Author: " + book.bookAuthor);
          System.out.println("Publisher: " + book.bookPublisher);
      System.out.println("Number of Copies: " + book.numCopies);
      System.out.println("Status: " + book.status);
      System.out.println();
    }
  }
}
    /**
    * Method to print the list of books.
    */
    public void printBookList() {
      for (Book book : bookList) {
        System.out.println();
        book.printBookInfo();
        System.out.println();
      }
    }

    /**
    * Method to search for a book by ISBN.
    * @return The book found, or null if not found.
    */
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
          if (book.getISBN().equals(searchISBN)) {
            System.out.println();
              System.out.println("Book found successfully!");
              System.out.println();
              book.printBookInfo();
              System.out.println();
              return book;
          }
      }
      System.out.println();
      System.out.println("Book not found!");
      System.out.println();
      return null;
    }

    /**
    * Method to search for a book by title.
    * @return The book found, or null if not found.
    */
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
          if (book.getTitle().equalsIgnoreCase(searchTitle)) {
            System.out.println();
            System.out.println("Book found successfully!");
            System.out.println();
            book.printBookInfo();
            System.out.println();
            return book;
          }
      }
      System.out.println();
      System.out.println("Book not found!");
      System.out.println();
      return null;
    }

    /**
     * Method to search for a book by author.
     */
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
            if (book.getAuthor().getAuthorName().equalsIgnoreCase(searchAuthorName)) {
              System.out.println();
              System.out.println("Book found successfully!");
              System.out.println();
              book.printBookInfo();
              System.out.println();
              return;
            }
        }
        System.out.println();
        System.out.println("Book not found!");
        System.out.println();
      }

    // Author Methods

    /**
    * Method to view all authors.
    */
    public void viewAllAuthors() {
        for (Author author : authorList) {
          System.out.println();
          author.printAuthorInfo();
          System.out.println();
        }
    }

    /**
     * Method to add a new author.
     */
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

    /**
     * Method to edit an existing author.
     */
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

    /**
     * Method to remove an existing author.
     */
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

    /**
     * Method to add a book to an author's book list.
     */
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

    /**
     * Method to remove a book from an author's book list.
     */
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

    /**
    * Method to print detailed information about a chosen author.
    */
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

    /**
     * Method to view all patrons.
     */ 
    public void viewAllPatrons() {
      for (Patron patron : patronList) {
          System.out.println();
          patron.printPatronInfo(patron);
          System.out.println();
      }
    }

  public void addNewPatron() {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter New Patron Information: ");
      Patron newPatron = new Patron();
      System.out.println("Enter Library Card: ");
      newPatron.setLibraryCard(input.nextInt());
      input.nextLine(); // Consume newline
      System.out.println("Enter Patron Name: ");
      newPatron.setPatronName(input.nextLine());
      System.out.println("Enter Date of Birth: ");
      newPatron.setDateOfBirth(input.nextLine());
      System.out.println("Enter Patron Address: ");
      newPatron.addPatronAddress(newPatron);
      System.out.println("Enter Phone Number: ");
      newPatron.setPhNum(input.nextLine());
      System.out.println("Enter Email: ");
      newPatron.setEmail(input.nextLine());
      patronList.add(newPatron);
      System.out.println("Patron Added Successfully");
      newPatron.printPatronInfo(newPatron);
  }

  public void editPatron() {
      viewAllPatrons();
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the index of the patron you want to edit: ");
      int index = input.nextInt() - 1;
      if (index < 0 || index >= patronList.size()) {
          System.out.println("Invalid index. Please try again.");
          return;
      }
      Patron patron = patronList.get(index);
      System.out.println("Enter New Patron Information: ");
      System.out.println("Enter New Library Card: ");
      patron.setLibraryCard(input.nextInt());
      input.nextLine(); // Consume newline
      System.out.println("Enter New Patron Name: ");
      patron.setPatronName(input.nextLine());
      System.out.println("Enter New Date of Birth: ");
      patron.setDateOfBirth(input.nextLine());
      System.out.println("Enter New Patron Address: ");
      patron.addPatronAddress(patron);
      System.out.println("Enter New Phone Number: ");
      patron.setPhNum(input.nextLine());
      System.out.println("Enter New Email: ");
      patron.setEmail(input.nextLine());
      System.out.println("Patron Edited Successfully");
      patron.printPatronInfo(patron);
  }

  public void removePatron() {
      viewAllPatrons();
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the index of the patron you want to remove: ");
      int index = input.nextInt() - 1;
      if (index < 0 || index >= patronList.size()) {
          System.out.println("Invalid index. Please try again.");
          return;
      }
      patronList.remove(index);
      System.out.println("Patron removed successfully!");
  }

    /**
     * Method to add a patron's address.
     */
    public void addPatronAddress() {
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
      PatronAddress patronAddress = new PatronAddress();
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
  }
}

    /**
     * Method to edit a patron's address.
     */
    public void editPatronAddress(PatronAddress patronAddress) {
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
            }
          }

              /**
               * Method to remove a patron's address.
               */
              public void removePatronAddress(PatronAddress patronAddress) {
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
                  patronAddress = null;
              }
            }
          }

              /**
               * Method to print detailed information about a chosen patron.
               */
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


              /**
               * Method for a patron to borrow a book.
               */
              public void borrowBook() {
                while (true) {
                  viewAllPatrons();
                  Scanner input = new Scanner(System.in);
                  System.out.println();
                  System.out.println("Enter the index of the patron: ");
                  System.out.println();
                  int index = input.nextInt() - 1;
                  System.out.println();
                  for (Patron patron : patronList) {
                    if (patronList.isEmpty()) {
                      System.out.println();
                      System.out.println("No patrons in the library to search!");
                      System.out.println();
                      break;
                    } else {
                      viewAllBooks();
                      System.out.println();
                      System.out.println("Enter the index of the book you want: ");
                      System.out.println();
                      int bookIndex = input.nextInt() - 1;
                      if (index >= 0 && index < bookList.size()) {
                        Book book = bookList.get(index);
                        if (bookList.isEmpty()) {
                          System.out.println();
                          System.out.println("No books in the library to search!");
                          System.out.println();
                          break;
                        } else {
                          if (book.status == BookStatus.BORROWED || book.status == BookStatus.OVERDUE || book.status == BookStatus.LOST || book.status == BookStatus.UNAVAILABLE || book.status == BookStatus.REMOVED) {
                          System.out.println();
                          System.out.println("Sorry, Book is already borrowed and unavailable. Try a different book!");
                          System.out.println();
                          } else if (book.status == BookStatus.AVAILABLE) {
                              book.numCopies--;
                              book.borrowedDate = new Date();
                              book.returnDate = null;
                              patron.addToBorrowedBooks(patron, book);
                              break;
                          } else {
                              if (book.numCopies ==  0) {
                              book.status = BookStatus.BORROWED;
                              System.out.println("Successfully borrowed book!");
                              break;
                              } else {
                              book.status = BookStatus.AVAILABLE;
                              System.out.println("Successfully borrowed book!");
                              break;
                            }
                        }
                      }
                    }
                  }
                }}  
        }




            /**
             * Method to add a book to the list of books borrowed by the patron.
             * @param patron
             * @param book
             */
            public void addToBorrowedBooks() {
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
                    System.out.println("Enter the index of the patron: ");
                    System.out.println();
                    int index = input.nextInt() - 1;
                    System.out.println();
                  
                    viewAllBooks();
                      for (Book book : bookList) {
                        if (bookList.isEmpty()) {
                          System.out.println();
                          System.out.println("No books in the library to search!");
                          System.out.println();
                          break;
                        } else {
                          System.out.println();
                          System.out.println("Enter the index of the book you want: ");
                          System.out.println();
                          patron.booksBorrowed.add(book);
                        }
                      }
                    }
                  }
          }


            /**
             * Method to remove a book from the list of books borrowed by the patron.
             * @param patron
             * @param book
             */
            public void removeFromBorrowedBooks() {
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
                    System.out.println("Enter the index of the patron: ");
                    System.out.println();
                    int index = input.nextInt() - 1;
                    System.out.println();
                    viewAllBooks();
                    for (Book book : bookList) {
                      if (bookList.isEmpty()) {
                        System.out.println();
                        System.out.println("No books in the library to search!");
                        System.out.println();
                        break;
                      } else {
                        System.out.println();
                        System.out.println("Enter the index of the book you want: ");
                        System.out.println();
                        System.out.println();
          patron.booksBorrowed.remove(book);
          }
          }
          }
          }
            }

              /**
               * Method to print the late fee for a patron.
               */
              public void printLateFee(Patron patron, double lateFee) {
                System.out.println();
                System.out.println("Late Fee: " + lateFee);
                System.out.println();
              }

              /**
                 * Method for a patron to return a book.
                 */
              public void returnBook() {
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
                    System.out.println("Enter the index of the patron: ");
                    System.out.println();
                    int index = input.nextInt() - 1;
                    System.out.println();
                  
                    viewAllBooks();
                      for (Book book : bookList) {
                        if (bookList.isEmpty()) {
                          System.out.println();
                          System.out.println("No books in the library to search!");
                          System.out.println();
                          break;
                        } else {
                          System.out.println();
                          System.out.println("Enter the index of the book you want: ");
                          System.out.println();
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
                      }
                    }
                  }
                }
              




     /**
     * Method for a patron to pay late fees.
     */
    public void payLateFee() {
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
            System.out.println("Enter the index of the patron: ");
            System.out.println();
            int index = input.nextInt() - 1;
            System.out.println();
          
            viewAllBooks();
              for (Book book : bookList) {
                if (bookList.isEmpty()) {
                  System.out.println();
                  System.out.println("No books in the library to search!");
                  System.out.println();
                  break;
                } else {
                  System.out.println();
                  System.out.println("Enter the index of the book you want: ");
                  System.out.println();
                }
              }
            }
          }
        }
      }
