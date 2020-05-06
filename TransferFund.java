/**
 * Description: Carry out the transfer funds transaction in the ATM machine.
 * CECS 343 SPRING 2020
 * ATM Machine: Transfer Fund
 * @author Nathaniel Monte De Ramos and Rifa Safeer Shah
 * Date: 05/05/2020
 */

package atmMachine;

import java.util.Scanner;

public class TransferFund {

	static String name = "Transfer from Balance";

	public static void transferFund() {

		/* The amount to transfer */
		double transferAmount;
		/* Balance in the account */
		double accBalance;

		/*check the amount */
		boolean wrongAmount = true;
		
		/* account number to transfer the funds */
		int accountNum;
		int choice;

		Scanner scan = new Scanner(System.in);

		System.out.println("Your balance is " + Account.getBalance());
		
		/* The user gets 3 tries */
		for(int i = 0; i < 3 && wrongAmount; i++) {
			
			System.out.println("Enter Account Number you want to transfer money to? ");
			accountNum = scan.nextInt();

			System.out.println("How much would you like to transfer?");
			transferAmount = scan.nextDouble();

			

			if(transferAmount >= Account.getBalance()) 

			{

				System.out.println("Transfer Amount is Greater than your Balance.\nPlease Try Again.");

			}

			else 

			{

				accBalance = Account.getBalance() - transferAmount;

				
				System.out.println(transferAmount + " has been deposited to the account " + accountNum);
				System.out.println("Your new balance is " + accBalance);

				Account.setBalance(accBalance);

				wrongAmount = false;

				System.out.println("Would you like a Receipt?\n1. Yes\n2. No");

				choice = scan.nextInt();

				if(choice == 1) 

				{

					//make receipt class

				}

				else 

				{

					System.out.println("Thank you! Have a nice day.");

				}

			}

		

		}

	}

}

//DO SOME TEST TO CHECK IF ITS RIGHT
