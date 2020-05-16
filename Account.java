/**
 * Description: The account operator for the ATM machine.
 * CECS 343 Spring 2020
 * ATM Machine: Account
 * @author Nathaniel Monte De Ramos and Rifa Safeer Shah
 * Date: 05/06/2020
 */

package atmMachine;

public class Account {

	/* Card number for the account */
	static int cardNum;

	/* Pin number for the account */
	static int pinNum;

	/* Balance in the account */
	static String balance;

	public Account(int card,int pin, String bal) {

		Account.cardNum = card;

		Account.pinNum = pin;

		Account.balance = bal;
	} // End of Account

	/**
	 * Gets the balance in the account.
	 * @return balance. Balance as a double.
	 */
	public static double getBalance() {

		return Double.parseDouble(balance);
	} // End of getBalance

	/**
	 * Gets the card number.
	 * @return card number. Card Number as an integer.
	 */
	public static int getCardNum() {

		return cardNum;
	} // End of getCardNum

	/**
	 * Sets the balance in the account.
	 * @param bal balance in the account.
	 */
	public static void setBalance(double bal) {

		if (Double.parseDouble(balance) >= 0) {

			balance = String.valueOf(bal);
		} // End of if-statement
	} // End of setBalance
} // End of Account class
