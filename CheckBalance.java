/**
 * Description: The class that checks balance in the account.
 * CECS 343 Spring 2020
 * ATM Machine: CheckBalance
 * @author Nathaniel Monte De Ramos and Rifa Safeer Shah
 * Date: 05/06/2020
 */

package atmMachine;

/**
 * Checks the balance in the account.
 */
public class CheckBalance {

	public static void checkBalance() {

		System.out.println("===============CHECK BALANCE===============");

		System.out.println("Card Number          : " + Account.getCardNum());

		System.out.println("Checking Balance     : " + Account.getBalance());

		System.out.println("===========================================");
	} // End of checkBalance
} // End of CheckBalance class
