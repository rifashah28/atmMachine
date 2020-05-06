/**
 * Description: Carry out the transfer funds transaction in the ATM machine.
 * CECS 343 SPRING 2020
 * ATM Machine: Transfer Fund
 * @author Nathaniel Monte De Ramos and Rifa Safeer Shah
 * Date: 05/05/2020
 */

package atmMachine;

import java.util.List;
import java.util.Scanner;

public class TransferFund {

	static String name = "Transfer from Balance";

	public static void transferFund() {
		
		double transferAmount;

		double accBalance;

		Scanner scan = new Scanner(System.in);

		System.out.println("===============TRANSFER===========================");

		System.out.println("Your balance is " + Account.getBalance());



		for(int i = 0; i < 3; i++)//user gets 3 tries

		{

			System.out.println("How much money would you like to transfer?");

			transferAmount = scan.nextDouble();

			

			if(transferAmount >= Account.getBalance()) 

			{

				System.out.println("Transfer Amount is Greater than your Balance.\nPlease Try Again.");

			}

			else 

			{

				accBalance = Account.getBalance() - transferAmount;

				System.out.println("Your new balance is " + accBalance);

				Account.setBalance(accBalance);

				i += 2;

			}

		}
		
	}
}

//DO SOME TEST TO CHECK IF ITS RIGHT
