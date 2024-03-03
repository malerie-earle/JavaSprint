package JavaSprint;

import java.util.Date;

public enum BookStatus {
  AVAILABLE,
  BORROWED,
  OVERDUE,
  LOST,
  UNAVAILABLE,
  REMOVED
}

class borrowed {
  private BookStatus status;
  private Date borrowedDate;
  private Date returnDate;

  double lateFee;
  double lostFee;

  public BookStatus getStatus(Book book) {
    BookStatus status = book.status;
    return status;
  }

  public void setStatus(Book book) {
    book.status = status;
  }

  public Date getBorrowedDate() {
    if (borrowedDate == null) {
      borrowedDate = new Date();
    }
    return borrowedDate;
  }

  public void setBorrowedDate(Date borrowedDate) {
    this.borrowedDate = borrowedDate;
  }

  public Date getReturnDate() {
    return returnDate;
  }

  // Method to add book to borrowed book list
    public void addToBorrowedBooks(Patron patron, Book book) {
      patron.booksBorrowed.add(book);
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
    patron.removeFromBorrowedBooks(patron, book);
    long timeDifference = returnDate.getTime() - borrowedDate.getTime();
    double daysDifference = timeDifference / (1000 * 60 * 60 * 24);
    if (daysDifference > 14) {
      status = BookStatus.OVERDUE;
      lateFee = daysDifference * 0.25;
    } else if (status == BookStatus.LOST) {
      lostFee = 10 + lateFee;
    } else {
      lateFee = 0;
      lostFee = 0;
      status = BookStatus.AVAILABLE;
    }
  }

  // Method to pay late fee
  public void payLateFee(Patron patron, Book book) {
    lateFee = 0;
    book.status = BookStatus.AVAILABLE;
  }
}
      
  
