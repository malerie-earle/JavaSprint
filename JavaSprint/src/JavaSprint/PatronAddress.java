package JavaSprint;

// Patron Address Class
public class PatronAddress {
  private String streetAddress;
  private String city;
  private String province;
  private String postalCode;

  // Constructor
  public PatronAddress(String streetAddress, String city, String province, String postalCode) {
    this.streetAddress = streetAddress;
    this.city = city;
    this.province = province;
    this.postalCode = postalCode;
  }

  public PatronAddress() {
    this.streetAddress = null;
    this.city = null;
    this.province = null;
    this.postalCode = null;
  }

  // Getters and Setters
  public String getStreetAddress(PatronAddress patronAddress) {
    return patronAddress.streetAddress;
  }

  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  public String getCity(PatronAddress patronAddress) {
    return patronAddress.city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getProvince(PatronAddress patronAddress) {
    return patronAddress.province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public String getPostalCode(PatronAddress patronAddress) {
    return patronAddress.postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  // Method to print patron address
  public void printPatronAddress(PatronAddress patronAddress) {
    System.out.println("Street Address: " + patronAddress.streetAddress);
    System.out.println("City: " + patronAddress.city);
    System.out.println("Province: " + patronAddress.province);
    System.out.println("Postal Code: " + patronAddress.postalCode);
  }

}
