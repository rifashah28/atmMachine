/**
 * Description: The class that allows customers to deposit money into the account.
 * CECS 343 Spring 2020
 * ATM Machine: Deposit
 * @author Nathaniel Monte De Ramos and Rifa Safeer Shah
 * Date: 05/06/2020
 */

package atmMachine;

import java.util.Scanner;

/**
 * Adds amount to the account.
 */
public class Deposit {

	public static void deposit() {

		/* Initial for deposit amount */
		double depositAmmount;

		/* Initial for the account balance */
		double accBalance;

		System.out.println("===============DEPOSIT===============");

		/* For scanning the user input for deposit */
		Scanner scan = new Scanner(System.in);

		/* Show the user the balance before deposit */
		System.out.println("Your balance is $" + Account.getBalance());

		System.out.println("How much would you like to deposit?");
		
		/* Taking in the deposit */
		depositAmmount = scan.nextDouble();

		/* The new balance */
		accBalance = Account.getBalance() + depositAmmount;

		/* Print out the new balance */
		System.out.println("Your new balance is $" + accBalance);

		/* Set the customer balance to the new balance */
		Account.setBalance(accBalance);

		System.out.println("=====================================");
	} // End of deposit
} // End of Deposit class
