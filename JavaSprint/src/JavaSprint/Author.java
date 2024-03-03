package JavaSprint;

import java.util.ArrayList;

public class Author {
    public Integer authorID;
    public String authorName;
    public String dateOfBirth;
    public ArrayList<Book> authorBookList;

    // Constructor
    public Author(Integer authorID, String authorName, String dateOfBirth, ArrayList<Book> authorBookList) {
        this.authorID = authorID;
        this.authorName = authorName;
        this.dateOfBirth = dateOfBirth;
        this.authorBookList = new ArrayList<Book>();
    }

    public Author() {
        this.authorID = null;
        this.authorName = null;
        this.dateOfBirth = null;
        this.authorBookList = new ArrayList<Book>();
    }

    // Getters and Setters
    public Integer getAuthorID(Author bookAuthor) {
      return bookAuthor.authorID;
    }

    public void setAuthorID(Integer authorID) {
      this.authorID = authorID;
    }

    public String getAuthorName() {
      return this.authorName;
    }

    public void setAuthorName(String authorName) {
      this.authorName = authorName;
    }

    public String getDateOfBirth(Author bookAuthor) {
      return bookAuthor.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
      this.dateOfBirth = dateOfBirth;
  }

    // Method to get author's book list
    public ArrayList<Book> getAuthorBookList(Author bookAuthor) {
      return bookAuthor.authorBookList;
    }

    public void setAuthorBookList(ArrayList<Book> authorBookList) {
      this.authorBookList = authorBookList;
    }

    public void addBookToAuthor(Book book) {
      this.authorBookList.add(book);
    }

    // Method to print author information
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
  

