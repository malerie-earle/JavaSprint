package JavaSprint;

import java.util.ArrayList;

/**
 * The Patron class represents a library patron.
 * It contains information about the patron such as name, address, contact details,
 * library card number, books borrowed, and late/lost fees.
 */
public class Patron {
    /** The library card number of the patron. */
    public Integer libraryCard;
    /** The name of the patron. */
    public String patronName;
    /** The date of birth of the patron. */
    public String dateOfBirth;
    /** The address of the patron. */
    public PatronAddress patronAddress;
    /** The phone number of the patron. */
    public String phNum;
    /** The email address of the patron. */
    public String email;
    /** The list of books borrowed by the patron. */
    public ArrayList<Book> booksBorrowed;
    // /** The late fee accumulated by the patron. */
    // public double lateFee;
    // /** The fee for lost books paid by the patron. */
    // public double lostFee;

    /**
     * Constructs a new Patron object with the specified parameters.
     * @param libraryCard The library card number of the patron.
     * @param patronName The name of the patron.
     * @param dateOfBirth The date of birth of the patron.
     * @param patronAddress The address of the patron.
     * @param phNum The phone number of the patron.
     * @param email The email address of the patron.
     * @param booksBorrowed The list of books borrowed by the patron.
     */
    public Patron(Integer libraryCard, String patronName, String dateOfBirth, PatronAddress patronAddress, String phNum, String email, ArrayList<Book> booksBorrowed) {
        this.libraryCard = libraryCard;
        this.patronName = patronName;
        this.dateOfBirth = dateOfBirth;
        this.patronAddress = patronAddress;
        this.phNum = phNum;
        this.email = email;
        this.booksBorrowed = new ArrayList<Book>();
    }

    /**
     * Constructs a new empty Patron object.
     */
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

    /**
     * Returns a new library card number incremented from the last library card number.
     * @param lastLibraryCard The last library card number used.
     * @return The new library card number.
     */
    public Integer getNewLibraryCard(Integer lastLibraryCard) {
        libraryCard = lastLibraryCard++;
        return libraryCard;
    }

    /**
     * Returns the library card number of the patron.
     * @param patron The patron whose library card number is to be retrieved.
     * @return The library card number of the patron.
     */
    public Integer getLibraryCard(Patron patron) {
        return libraryCard;
    }

    /**
     * Sets the library card number of the patron.
     * @param libraryCard The library card number to be set.
     */
    public void setLibraryCard(Integer libraryCard) {
        this.libraryCard = libraryCard;
    }

    /**
     * Returns the name of the patron.
     * @param patron The patron whose library card number is to be retrieved.
     * @return name of the patron.
     */
    public String getPatronName(Patron patron) {
        return patronName;
    }

    /**
     * Sets the name of the patron.
     * @param patron name to be set.
     */
    public void setPatronName(String patronName) {
        this.patronName = patronName;
    }

    /**
     * Returns the date of birth of the patron.
     * @param patron The patron whose date of birth is to be retrieved.
     * @return date of birth of the patron.
     */
    public String getDateOfBirth(Patron patron) {
        return dateOfBirth;
    }

    /**
     * Sets the date of birth of the patron.
     * @param patron date of birth to be set.
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
    * Adds a new address of the patron.
    * @param patron The patron whose address is to be retrieved.
    * @return address of the patron.
    */
    public PatronAddress addPatronAddress(Patron patron) {
        return patronAddress;
    }

    /**
     * Gets the patron address.
     * @param patron The patron whose address is to be retrieved.
     * @return The patron address.
     */
    public PatronAddress getPatronAddress() {
        patronAddress = new PatronAddress();
        return this.patronAddress;
    }

    /**
     * Sets the patron address.
     * @param patronAddress The patron address to be set.
     */
    public void setPatronAddress(PatronAddress patronAddress) {
        patronAddress = new PatronAddress();
        this.patronAddress = patronAddress;
    }

    /**
     * Returns the phone number of the patron.
     * @param patron The patron whose phone number is to be retrieved.
     * @return phone number of the patron.
     */
    public String getPhNum(Patron patron) {
        return phNum;
    }

    /**
     * Sets the phone number of the patron.
     * @param phNum The phone number to be set.
     */
    public void setPhNum(String phNum) {
        this.phNum = phNum;
    }

    /**
     * Returns the email address of the patron.
     * @param patron The patron whose email address is to be retrieved.
     * @return email address of the patron.
     */
    public String getEmail(Patron patron) {
        return email;
    }

    /**
     * Sets the email address of the patron.
     * @param email The email address to be set.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns the list of books borrowed by the patron.
     * @param patron The patron whose list of books borrowed is to be retrieved.
     * @return The list of books borrowed by the patron.
     */
    public ArrayList<Book> getBooksBorrowed(Patron patron) {
        return booksBorrowed;
    }

    /**
     * Sets the list of books borrowed by the patron.
     * @param booksBorrowed The list of books borrowed to be set.
     */
    public void setBooksBorrowed(ArrayList<Book> booksBorrowed) {
        this.booksBorrowed = booksBorrowed;
    }

    /**
     * Prints the patron info.
     * @param patron
     */
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

/**
   * Method to add a book to the list of books borrowed by the patron.
   * @param patron
   * @param book
   */
  public void addToBorrowedBooks(Patron patron, Book book) {
    patron.booksBorrowed.add(book);
  }

  /**
   * Method to remove a book from the list of books borrowed by the patron.
   * @param patron
   * @param book
   */
  public void removeFromBorrowedBooks(Patron patron, Book book) {
    patron.booksBorrowed.remove(book);
  }

    /**
     * Print patron address.
     * @param patron
     */
    public void printPatronAddress(Patron patron) {
        patron.getPatronAddress().printPatronAddress(patron.getPatronAddress());
  }
}

