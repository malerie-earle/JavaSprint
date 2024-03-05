package JavaSprint;

import java.util.ArrayList;

/**
 * The Author class represents an author in the library system.
 * It stores information about the author, including their ID, name,
 * date of birth, and a list of books authored by them.
 */

public class Author {
    /** The unique identifier for the author. */
    public Integer authorID;
    /** The name of the author. */
    public String authorName;
    /** The date of birth of the author. */
    public String dateOfBirth;
    /** The list of books authored by the author. */
    public ArrayList<Book> authorBookList;

    /**
     * Constructs an author object with the specified parameters.
     * @param authorID The unique identifier for the author.
     * @param authorName The name of the author.
     * @param dateOfBirth The date of birth of the author.
     * @param authorBookList The list of books authored by the author.
     */
    public Author(Integer authorID, String authorName, String dateOfBirth, ArrayList<Book> authorBookList) {
        this.authorID = authorID;
        this.authorName = authorName;
        this.dateOfBirth = dateOfBirth;
        this.authorBookList = new ArrayList<Book>();
    }

    /**
     * Constructs an empty author object.
     */
    public Author() {
        this.authorID = null;
        this.authorName = null;
        this.dateOfBirth = null;
        this.authorBookList = new ArrayList<Book>();
    }

    // Getters and Setters

    /**
     * Returns the author's ID.
     * @return The author's ID.
     */
    public Integer getAuthorID(Author bookAuthor) {
      return bookAuthor.authorID;
    }

    /**
     * Sets the author's ID.
     * @param authorID The author's ID.
     */
    public void setAuthorID(Integer authorID) {
      this.authorID = authorID;
    }

    /**
     * Returns the author's name.
     * @return The author's name.
     */
    public String getAuthorName() {
      return this.authorName;
    }

     /**
     * Sets the author's name.
     * @param authorName The author's name.
     */
    public void setAuthorName(String authorName) {
      this.authorName = authorName;
    }

      /**
     * Returns the author's date of birth.
     * @return The author's date of birth.
     */
    public String getDateOfBirth(Author bookAuthor) {
      return bookAuthor.dateOfBirth;
    }

      /**
     * Sets the author's date of birth.
     * @param dateOfBirth The author's date of birth.
     */
    public void setDateOfBirth(String dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
  }

      /**
     * Returns the list of books authored by the author.
     * @return The list of books authored by the author.
     */

    public ArrayList<Book> getAuthorBookList(Author bookAuthor) {
      return bookAuthor.authorBookList;
    }

    /**
     * Sets the list of books authored by the author.
     * @param authorBookList The list of books authored by the author.
     */
    public void setAuthorBookList(ArrayList<Book> authorBookList) {
      this.authorBookList = authorBookList;
    }

     /**
     * Adds a book to the list of books authored by the author.
     * @param book The book to be added.
     */
    public void addBookToAuthor(Book book) {
      this.authorBookList.add(book);
    }

    /**
     * Prints the author's information, including their ID, name, date of birth, and books authored.
     */
    public void printAuthorInfo() {
      System.out.println("Author ID: " + authorID);
      System.out.println("Author Name: " + authorName);
      System.out.println("Date of Birth: " + dateOfBirth);
      System.out.println("Books: ");
      for (Book book : authorBookList) {
          System.out.println(book);
      }
    }
    } 
  

