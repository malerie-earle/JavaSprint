package JavaSprint;

public interface Borrowable {
  BookStatus borrowBook(Patron patron);
    void returnBook(Patron patron);
}

