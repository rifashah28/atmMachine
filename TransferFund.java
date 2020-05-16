/**
 * Description: The class handles the transfer transaction for the accounts.
 * CECS 343 Spring 2020
 * ATM Machine: TransferFunds
 * @author Nathaniel Monte De Ramos and Rifa Safeer Shah
 * Date: 05/06/2020
 */

package atmMachine;

import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/**
 * Transfers fund from open file to another.
 */
public class TransferFund {

	public static void transferFund() {

		/* Amount to be transferred */
		double transferAmount;

		Scanner scan = new Scanner(System.in);

		System.out.println("==================TRANSFER================");

		/* Balance from the user */
		System.out.println("Your balance is " + Account.getBalance());

		/**
		 * User gets 3 tries.
		 */
		for(int i = 0; i < 3; i++) {

			System.out.println("How much would you like to Transfer?");

			transferAmount = scan.nextDouble();

			if(transferAmount >= Account.getBalance()) {

				System.out.println("Transfer Amount is Greater than your Balance.\nPlease Try Again.");
			} // End of if-statement

			else {

				/* For the user that is transferring */
				double newBalance = Double.parseDouble(Account.balance) - transferAmount;

				System.out.println("Enter the Card Number of the Person you want to transfer the money ");

				/* Account that the money is being transferred to */
				int cardNum2 = scan.nextInt();

				try {

					/* Find the file with the card number */
					Path fileScan = Paths.get(cardNum2 + ".txt");

					/* Make the list */
					List<String> lines = Files.readAllLines(fileScan);

					String numCard2 = lines.get(0);

					String numPin2 = lines.get(1);

					/* Take the third number. Account balance of the transfee */
					String balanceFromFile2 = lines.get(2);

					/* Add the transfer amount */
					double accBalance2 = Double.parseDouble(balanceFromFile2) + transferAmount;

					FileWriter fw = new FileWriter(numCard2 + ".txt");

					fw.write(numCard2 + "\n" + numPin2 + "\n" + accBalance2);

					fw.close();

					System.out.println("Transfer was successful");
				} // End of try block

				catch(Exception e) {

					System.out.println("Card does not Exist");

					System.exit(0);
				} // End of catch block

				Account.setBalance(newBalance);

				System.out.println("==========================================");

				i += 2;
			} // End of else-statement
		} // End of for loop
	} // End of transferFund
} // End of TransferFund
