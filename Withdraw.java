/**
 * Description: This class allows users to take money out of the account.
 * CECS 343 Spring 2020
 * ATM Machine: Withdraw
 * @author Nathaniel Monte De Ramos and Rifa Safeer Shah
 * Date: 05/06/2020
 */

package atmMachine;

import java.util.Scanner;

/**
 * Subtracts an amount from the account balance.
 */
public class Withdraw {

	public static void withdraw() {

		double withdrawAmount;

		double accBalance;

		Scanner scan = new Scanner(System.in);

		System.out.println("===============WITHDRAW===============");

		System.out.println("Your balance is " + Account.getBalance());
		
		/**
		 * User gets 3 tries.
		 */
		for(int i = 0; i < 3; i++) {

			System.out.println("How much would you like to withdraw?");

			withdrawAmount = scan.nextDouble();

			if (withdrawAmount >= Account.getBalance()) {

				System.out.println("Withdrawal Amount is Greater than your Balance.\nPlease Try Again.");
			} // End of if-statement

			else {

				accBalance = Account.getBalance() - withdrawAmount;

				System.out.println("Your new balance is " + accBalance);

				Account.setBalance(accBalance);

				i += 2;
			} // End of else-statement
		} // End of for loop

		System.out.println("======================================");
	} // End of withdraw
} // End of Withdraw class
