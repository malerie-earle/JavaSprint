package JavaSprint;

import java.util.Date;

/**
 * The Book class represents a book in the library system.
 * It stores information about the book, including its ISBN, title,
 * author, publisher, number of copies, status, borrowed date, and return date.
 */

public class Book {
  /** The ISBN (International Standard Book Number) of the book. */
  public String ISBN;
  /** The title of the book. */
  public String bookTitle;
  /** The author of the book. */
  public Author bookAuthor;
  /** The publisher of the book. */
  public String bookPublisher;
  /** The number of copies of the book available in the library. */
  public int numCopies;
  /** The status of the book (e.g., available, checked out). */
  public BookStatus status;
  /** The date when the book was borrowed. */
  public Date borrowedDate;
  /** The date when the book is due to be returned. */
  public Date returnDate;

  /**
   * Constructs a book object with the specified parameters.
   * @param ISBN The ISBN of the book.
   * @param bookTitle The title of the book.
   * @param bookAuthor The author of the book.
   * @param bookPublisher The publisher of the book.
   * @param copies The number of copies of the book.
   * @param status The status of the book.
   * @param borrowedDate The date when the book was borrowed.
   * @param returnDate The date when the book is due to be returned.
   */
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

  /**
  * Constructs an empty book object.
  */
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

  /**
   * Returns the ISBN of the book.
   * @return The ISBN of the book.
   */
  public String getISBN() {
    return ISBN;
  }

  /**
   * Sets the ISBN of the book.
   * @param ISBN The ISBN of the book.
   */
  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  /**
   * Returns the title of the book.
   * @return title of the book.
   */
  public String getTitle() {
    return bookTitle;
  }

  /**
   * Sets the title of the book.
   * @param title of the book.
   */
  public void setTitle(String bookTitle) {
    this.bookTitle = bookTitle;
  }

  /**
   * Returns the author name of the book.
   * @return author name of the book.
   */
  public String getAuthorName() {
    return this.bookAuthor.getAuthorName();
  }

  /**
   * Returns the author of the book.
   * @return author of the book.
   */
  public Author getAuthor() {
    return bookAuthor;
  }

  /**
     * Sets the author of the book.
     * @param author of the book.
     */
  public void setAuthor(Author bookAuthor) {
    this.bookAuthor = bookAuthor;
  }

  /**
   * Returns the publisher of the book.
   * @return The publisher of the book.
   */
  public String getPublisher() {
    return bookPublisher;
  }

  /**
     * Sets the publisher of the book.
     * @param publisher of the book.
     */
  public void setPublisher(String publisher) {
    this.bookPublisher = publisher;
  }

  /**
   * Returns the number of copies of the book.
   * @return The number of copies of the book.
   */
  public int getNumCopies() {
    return numCopies;
  }

  /**
     * Sets the number of copies of the book.
     * @param numCopies of the book.
     */
  public void setCopies(int numCopies) {
    this.numCopies = numCopies;
  }

    /**
   * Returns the status of the book.
   * @return The status of the book.
   */
  public BookStatus getStatus() {
    return status;
  }

  /**
     * Sets the status of the book.
     * @param status of the book.
     */
  public void setStatus(BookStatus status) {
    this.status = status;
  }

  /**
     * Sets the new status of the book.
     * @param newStatus of the book.
     */
  public void setNewStatus(Book book) {
    book.status = BookStatus.AVAILABLE;
  }

    /**
   * Returns the date borrowed of the book.
   * @return The date borrowed of the book.
   */
  public Date getBorrowedDate() {
    return borrowedDate;
  }

  /**
   * Sets the borrowed of the book.
   * @param borrowedDate of the book.
   */
  public void setBorrowedDate(Date borrowedDate) {
    this.borrowedDate = borrowedDate;
  }

    /**
   * Returns the return date of the book.
   * @return The return date of the book.
   */
  public Date getReturnDate() {
    return returnDate;
  }

  /**
     * Prints the information of the book, including its ISBN, title, author,
     * publisher, number of copies, and status.
     * @param book The book object whose information is to be printed.
     */
  public void printBookInfo() {
    System.out.println("ISBN: " + ISBN);
    System.out.println("Title: " + bookTitle);
    System.out.println("Author: " + getAuthorName());
    System.out.println("Publisher: " + bookPublisher);
    System.out.println("Number of Copies: " + numCopies);
    System.out.println("Status: " + status);
  }
  } 

      