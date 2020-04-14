/**
 * Description of the class
 * ATM Machine: Customer
 * @author Rifa Safeer Shah, Fernando Gonzales, Nathaniel Monte De Ramos.
 * Date: 04/14/2020
 */

package atmMachine;

public class Customer {
	/** First Name of the Customer. */
	private String firstName;
	/** Last Name of the Customer. */
	private String lastName;
	/** Account Number of the Customer. */
	private String accountNumber;
	/** Pin Number for the Account. */
	private String pinNumber;
	/** Balance in the Account. */
	private double balance;
	
	/**
	 * Constructor for the Customer class.
	 * @param firstName is the First Name of the Customer.
	 * @param lastName is the Last Name of the Customer.
	 * @param accountNumber is the Account Number of the Customer.
	 * @param pinNumber is the Pin Number for the Account
	 */
	public Customer (String firstName, String lastName, String accountNumber, String pinNumber) {
		setFirstName(firstName);
		setLastName(lastName);
		setAccountNumber(accountNumber);
		setPinNumber(pinNumber);
	} // End of Customer constructor
	
	/**
	 * Sets the Pin Number for the Account.
	 * @param pinNumber is the Pin Number for the Account.
	 */
	private void setPinNumber(String pinNumber) {
		// TODO Auto-generated method stub
		if (pinNumber != null) {
			this.pinNumber = pinNumber;
		} // End of if-statement
	} // End of setPinNumber
	
	/**
	 * Gets the pin Number for the Account.
	 * @return pinNumber. Pin Number as a String.
	 */
	public String getPinNumber() {
		return pinNumber;
	} // End of getPinNumber
	
	/**
	 * Sets the Account Number of the Customer.
	 * @param accountNumber is the Account Number of the Customer.
	 */
	private void setAccountNumber(String accountNumber) {
		// TODO Auto-generated method stub
		if (accountNumber != null) {
			this.accountNumber = accountNumber;
		} // End of if-statement
	} // End of setAccountNumber
	
	/**
	 * Gets the Account Number of the Customer.
	 * @return accountNumber. Account Number as a String.
	 */
	public String getAccountNumber() {
		return accountNumber;
	} // End of getAccountNumber

	/**
	 * Sets the Last Name of the Customer.
	 * @param lastName is the Last Name of the Customer.
	 */
	private void setLastName(String lastName) {
		// TODO Auto-generated method stub
		if (lastName != null) {
			this.lastName = lastName;
		} // End of if-statement
	} // End of setLastName
	
	/**
	 * Gets the Last Name of the Customer.
	 * @return lastName. Last Name as a String.
	 */
	public String getLastName() {
		return lastName;
	} // End of getLastName

	/**
	 * Sets the First Name of the Customer.
	 * @param firstName is the First Name of the Customer.
	 */
	private void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		if (firstName != null) {
			this.firstName = firstName;
		} // End of if-statement
	} // End of setFirstName
	
	/**
	 * Gets the First Name of the Customer.
	 * @return firstName. First Name as a String.
	 */
	public String getFirstName() {
		return firstName;
	} // End of getFirstName
	
} // End of Customer class
