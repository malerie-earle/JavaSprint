package JavaSprint;

/**
 * The PatronAddress class represents the address of a patron.
 * It contains information such as street address, city, province, and postal code.
 */
public class PatronAddress {
  /** The street address of the patron. */
  private String streetAddress;
  /** The city of the patron. */
  private String city;
  /** The province of the patron. */
  private String province;
  /** The postal code of the patron. */
  private String postalCode;

  /**
   * Constructs a new PatronAddress object with the specified parameters.
   * @param streetAddress The street address of the patron.
   * @param city The city of the patron.
   * @param province The province of the patron.
   * @param postalCode The postal code of the patron.
   */
  public PatronAddress(String streetAddress, String city, String province, String postalCode) {
    this.streetAddress = streetAddress;
    this.city = city;
    this.province = province;
    this.postalCode = postalCode;
  }

  /**
  * Constructs a new empty PatronAddress object.
  */
  public PatronAddress() {
    this.streetAddress = null;
    this.city = null;
    this.province = null;
    this.postalCode = null;
  }

  // Getters and Setters
  /**
   * Gets the street address of the patron.
   * @param patronAddress The PatronAddress object.
   * @return The street address of the patron.
   */
  public String getStreetAddress(PatronAddress patronAddress) {
    return patronAddress.streetAddress;
  }

  /**
  * Sets the street address of the patron.
  * @param streetAddress The street address to be set.
  */
  public void setStreetAddress(String streetAddress) {
    this.streetAddress = streetAddress;
  }

  /**
  * Gets the city of the patron.
  * @param patronAddress The PatronAddress object.
  * @return The city of the patron.
  */
  public String getCity(PatronAddress patronAddress) {
    return patronAddress.city;
  }

  /**
  * Sets the city of the patron.
  * @param city The city to be set.
  */
  public void setCity(String city) {
    this.city = city;
  }

  /**
     * Gets the province of the patron.
     * @param patronAddress The PatronAddress object.
     * @return The province of the patron.
     */
  public String getProvince(PatronAddress patronAddress) {
    return patronAddress.province;
  }

  /**
     * Sets the province of the patron.
     * @param province The province to be set.
     */
  public void setProvince(String province) {
    this.province = province;
  }

    /**
   * Gets the postal code of the patron.
   * @param patronAddress The PatronAddress object.
   * @return The postal code of the patron.
   */
  public String getPostalCode(PatronAddress patronAddress) {
    return patronAddress.postalCode;
  }

  /**
   * Sets the postal code of the patron.
   * @param postalCode The postal code to be set.
   */
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  /**
   * Prints the address of the patron.
   * @param patronAddress The PatronAddress object.
   */
  public void printPatronAddress(PatronAddress patronAddress) {
    System.out.println("Street Address: " + patronAddress.streetAddress);
    System.out.println("City: " + patronAddress.city);
    System.out.println("Province: " + patronAddress.province);
    System.out.println("Postal Code: " + patronAddress.postalCode);
  }
}
