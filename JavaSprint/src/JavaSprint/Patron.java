package JavaSprint;
// Import ArrayList
import java.util.ArrayList;
import java.util.Date;

// Patron Class
public class Patron {
    public Integer libraryCard;
    public String patronName;
    public String dateOfBirth;
    public PatronAddress patronAddress;
    public String phNum;
    public String email;
    public ArrayList<Book> booksBorrowed;
    public double lateFee;
    public double lostFee;

    // Constructor
    public Patron(Integer libraryCard, String patronName, String dateOfBirth, PatronAddress patronAddress, String phNum, String email, ArrayList<Book> booksBorrowed) {
        this.libraryCard = libraryCard;
        this.patronName = patronName;
        this.dateOfBirth = dateOfBirth;
        this.patronAddress = patronAddress;
        this.phNum = phNum;
        this.email = email;
        this.booksBorrowed = new ArrayList<Book>();
    }

    public Patron() {
        this.libraryCard = null;
        this.patronName = null;
        this.dateOfBirth = null;
        this.patronAddress = new PatronAddress();
        this.phNum = null;
        this.email = null;
        this.booksBorrowed = new ArrayList<Book>();
    }

    // Getters and Setters
    public Integer getNewLibraryCard(Integer lastLibraryCard) {
        libraryCard = lastLibraryCard++;
        return libraryCard;
    }

    public Integer getLibraryCard(Patron patron) {
        return libraryCard;
    }

    public void setLibraryCard(Integer libraryCard) {
        this.libraryCard = libraryCard;
    }

    public String getPatronName(Patron patron) {
        return patronName;
    }

    public void setPatronName(String patronName) {
        this.patronName = patronName;
    }

    public String getDateOfBirth(Patron patron) {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public PatronAddress addPatronAddress(Patron patron) {
        return patronAddress;
    }

    public PatronAddress getPatronAddress() {
        patronAddress = new PatronAddress();
        return this.patronAddress;
    }

    public void setPatronAddress(PatronAddress patronAddress) {
        patronAddress = new PatronAddress();
        this.patronAddress = patronAddress;
    }

    public String getPhNum(Patron patron) {
        return phNum;
    }

    public void setPhNum(String phNum) {
        this.phNum = phNum;
    }

    public String getEmail(Patron patron) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Book> getBooksBorrowed(Patron patron) {
        return booksBorrowed;
    }

    public void setBooksBorrowed(ArrayList<Book> booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }

      // Method to add book to borrowed book list
    public void addToBorrowedBooks(Patron patron, Book book) {
      patron.booksBorrowed.add(book);
    }

    // Method to remove book from borrowed book list
    public void removeFromBorrowedBooks(Patron patron, Book book) {
        patron.booksBorrowed.remove(book);
    }

    // Method to borrow book
    public void borrowBook(Patron patron, Book book) {
        if (book.status == BookStatus.BORROWED || book.status == BookStatus.OVERDUE || book.status == BookStatus.LOST || book.status == BookStatus.UNAVAILABLE || book.status == BookStatus.REMOVED) {
        System.out.println("Sorry, Book is already borrowed and unavailable. Try a different book!");
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
        } else if (book.status == BookStatus.LOST) {
            lostFee = 10 + lateFee;
        } else {
            lateFee = 0;
            lostFee = 0;
            book.status = BookStatus.AVAILABLE;
        }
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }  

    // Method to pay late fee
    public void payLateFee(Patron patron, Book book) {
        double lateFee = 0; 
        book.status = BookStatus.AVAILABLE;
    }

    // Method to print patron information
    public void printPatronInfo(Patron patron) {
        System.out.println();
        System.out.println("Patron Information:");
        System.out.println();
        System.out.println("Library Card: ");
        patron.getLibraryCard(patron);
        System.out.println("Name: " + patron.getPatronName(patron));
        System.out.println("Date of Birth: " + patron.getDateOfBirth(patron));
        System.out.println("Address: " + patron.getPatronAddress());
        System.out.println("Phone Number: " + patron.getPhNum(patron));
        System.out.println("Email: " + patron.getEmail(patron));
        System.out.println("Books Borrowed: ");
        for (Book book : patron.getBooksBorrowed(patron)) {
          System.out.println();
          System.out.println(book);
          System.out.println();
        }
        System.out.println();
      }
  }

