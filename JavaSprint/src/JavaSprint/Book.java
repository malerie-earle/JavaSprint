package JavaSprint;

import java.util.Date;

public class Book {
  public String ISBN;
  public String bookTitle;
  public Author bookAuthor;
  public String bookPublisher;
  public int numCopies;
  public BookStatus status;
  public Date borrowedDate;
  public Date returnDate;

  // Constructor
  public Book(String ISBN, String bookTitle, Author bookAuthor, String bookPublisher, int copies, BookStatus status, Date borrowedDate, Date returnDate) {
    this.ISBN = ISBN;
    this.bookTitle = bookTitle;
    this.bookAuthor = bookAuthor;
    this.bookPublisher = bookPublisher;
    this.numCopies = copies;
    this.status = status;
    this.borrowedDate = null;
    this.returnDate = null;
  }

  public Book() {
    this.ISBN = null;
    this.bookTitle = null;
    this.bookAuthor = null;
    this.bookPublisher = null;
    this.numCopies = 0;
    this.status = null;
    this.borrowedDate = null;
    this.returnDate = null;
  }

  // Getters and Setters
  public String getISBN(Book book) {
    return book.ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public String getTitle(Book book) {
    return book.bookTitle;
  }

  public void setTitle(String bookTitle) {
    this.bookTitle = bookTitle;
  }

  public String getBookAuthorName() {
    return this.bookAuthor.getAuthorName();
}

  public Author getAuthor(Book book) {
    return book.bookAuthor;
  }

  public void setAuthor(Author bookAuthor) {
    this.bookAuthor = bookAuthor;
  }

  public String getPublisher(Book book) {
    return book.bookPublisher;
  }

  public void setPublisher(String publisher) {
    this.bookPublisher = publisher;
  }

  public int getNumCopies(Book book) {
    return book.numCopies;
  }

  public int getCopies(Book book) {
    return book.numCopies;
  }

  public void setCopies(int copies) {
    this.numCopies = copies;
  }

  public BookStatus getStatus(Book book) {
    return book.status;
  }

  public void setStatus(BookStatus status) {
    this.status = status;
  }

  public void setNewStatus(Book book) {
    book.status = BookStatus.AVAILABLE;
  }

  public Date getBorrowedDate() {
    return borrowedDate;
  }

  public void setBorrowedDate(Date borrowedDate) {
    this.borrowedDate = borrowedDate;
  }

  public Date getReturnDate() {
    return returnDate;
  }

  public String getAuthorName() {
    return this.bookAuthor.getAuthorName();
  }

  public void printBookInfo(Book book) {
    System.out.println("ISBN: " + book.ISBN);
    System.out.println("Title: " + book.bookTitle);
    System.out.println("Author: " + book.getAuthorName());
    System.out.println("Publisher: " + book.bookPublisher);
    System.out.println("Number of Copies: " + book.numCopies);
    System.out.println("Status: " + book.status);
  }

  } 

      