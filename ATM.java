/**
 * Description: The main runner for the ATM program.
 * CECS 343 Spring 2020
 * ATM Machine: ATM
 * @author Nathaniel Monte De Ramos and Rifa Safeer Shah
 * Date: 05/06/2020
 */

package atmMachine;

import java.util.List;
import java.util.Scanner;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ATM {

	public static void main(String args[]) {
		
		/* Holder of the card number */
		int cardNumberFromFile = 0;
		
		/* Holder of the pin number */
		int pinNumberFromFile = 0;

		/* Holder of the balance that is on the file. String so that it can read */
		String balanceFromFile = null;

		Scanner sc = new Scanner(System.in);

		List<String> lines = null;

		System.out.println("==========================================================================================");

		System.out.println("==========================================================================================");

		System.out.println(

				"888       888          888                                                888                       \r\n" + 

				"888   o   888          888                                                888                       \r\n" + 

				"888  d8b  888          888                                                888                       \r\n" + 

				"888 d888b 888  .d88b.  888  .d8888b  .d88b.  88888b.d88b.   .d88b.        888888  .d88b.            \r\n" + 

				"888d88888b888 d8P  Y8b 888 d88P\"    d88\"\"88b 888 \"888 \"88b d8P  Y8b       888    d88\"\"88b           \r\n" + 

				"88888P Y88888 88888888 888 888      888  888 888  888  888 88888888       888    888  888           \r\n" + 

				"8888P   Y8888 Y8b.     888 Y88b.    Y88..88P 888  888  888 Y8b.           Y88b.  Y88..88P           \r\n" + 

				"888P     Y888  \"Y8888  888  \"Y8888P  \"Y88P\"  888  888  888  \"Y8888         \"Y888  \"Y88P\"            \r\n" + 

				"                                                                                                    \r\n" + 

				"   8888888b.   .d8888b.     888b    888              d8888 88888888888 888b     d888 \r\n" + 

				"   888   Y88b d88P  \"88b    8888b   888             d88888     888     8888b   d8888 \r\n" + 

				"   888    888 Y88b. d88P    88888b  888            d88P888     888     88888b.d88888 \r\n" + 

				"   888   d88P  \"Y8888P\"     888Y88b 888           d88P 888     888     888Y88888P888 \r\n" + 

				"   8888888P\"  .d88P88K.d88P 888 Y88b888          d88P  888     888     888 Y888P 888 \r\n" + 

				"   888 T88b   888\"  Y888P\"  888  Y88888         d88P   888     888     888  Y8P  888 \r\n" + 

				"   888  T88b  Y88b .d8888b  888   Y8888        d8888888888     888     888   \"   888 \r\n" + 

				"   888   T88b  \"Y8888P\" Y88b888    Y888       d88P     888     888     888       888");

		System.out.println("==========================================================================================");

		System.out.println("==========================================================================================\n\n\n");

		System.out.println("===========================================");

		/* Give a 5 digit card number */
		System.out.print("Please Enter Card Number: ");

		/* Takes the card number from the user */
		String cardNum1 = sc.next();

		boolean willUserExit = false;

		try {
			
			/* Search for card number text file */
			Path fileScan = Paths.get(cardNum1 + ".txt");

			/* Put all lines in a list of strings */
			lines = Files.readAllLines(fileScan);
			
			/* The card number that is on the file (file name) */
			cardNumberFromFile = Integer.parseInt(lines.get(0));
			
			/* the pin number that is on the file */
			pinNumberFromFile = Integer.parseInt(lines.get(1));
			
			/* Balance amount on the file */
			balanceFromFile = lines.get(2);
		} // End of try block

		/**
		 * Expected in the file:
		 * line 0 -> card number
		 * line 1 -> pin number
		 * line 2 -> checking balance
		 */
		catch(Exception e) {

			System.out.println("Error: Card does not Exist");

			System.exit(0);
		} // End of catch block

		/**
		 * There are three attempts to enter pin number.
		 */
		for(int i = 0; i < 3; i++) {

			/* 5 digit pin number */
			System.out.print("Please Enter Pin Number : ");
			
			/**
			 * If card number and pin number are right then this menu will be shown
			 * If not then the program will exit after 3 attempts
			 */
			try {

				String pinNum = sc.next();

				if(Integer.parseInt(pinNum) == pinNumberFromFile) {

					i += 2;

					Account userBankAccount = new Account(cardNumberFromFile, pinNumberFromFile, balanceFromFile);//THE ACCOUNT OF THE CURRENT USER

					/* Welcome Message */
					System.out.println("===========================================\n\n");

					System.out.println("Hello, Welcome to your Bank Account");
					
					/**
					 * After the program shows the balance this menu is shown.
					 */
					while(!willUserExit) {

						menuChoice();

						/* return to menu */
						System.out.println("Would like to return to MENU?");

						System.out.println("1. Yes\n2. No");

						int userReturn = sc.nextInt();

						if(userReturn == 1) {

							willUserExit = false;
						} // End of if-statement
						
						else if(userReturn == 2) {

							willUserExit = true;
						} // End of else if-statement
					} // End of while loop
					
					/* Print the receipt */
					PrintReceipt.printReceipt();
				} // End of if-statement
				
				/**
				 * Else if the pin number entered by the user is right.
				 */
				else {

					System.out.println("Wrong Pin Number. Please try again");

					/**
					 * If the user has used the 3 attempts. Else go back to loop.
					 */
					if(i == 2) {

						System.out.println("Login Attempt Exceeded Allowed Ammount.");

						System.exit(0);
					} // End of if-statement
				} // End of else-statement
			} // End of try block

			catch(NumberFormatException ex) {

				System.out.println("Error: Wrong Pin Number. Please try again");
			} // End of catch block
		} // End of for loop

		/**
		 * Save to file.
		 * Opens the same text then writes the new balance.
		 */
		try {

			/* String value of card number */
			String numCard = String.valueOf(Account.cardNum);
			
			/* String value of pin number */
			String numPin = String.valueOf(Account.pinNum);

			/* String value of balance */
			String numBalance = String.valueOf(Account.balance);

			FileWriter fw = new FileWriter(numCard + ".txt");

			fw.write(numCard + "\n" + numPin + "\n" + numBalance);

			fw.close();
		} // End of try block

		catch(Exception e) {

			System.out.print("Writing to file problem");
		} // End of catch block
	} // End of main

	public static void menuChoice() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Choose from the following Transactions or Exit.");

		System.out.println("1 - Deposit Funds.");

		System.out.println("2 - Withdraw Funds.");

		System.out.println("3 - Check Balance.");

		System.out.println("4 - Transfer Balance.");

		System.out.println("5 - Exit.");

		/* Choice for menu */
		int choice = sc.nextInt();

		/**
		 * Switch case to send to different class.
		 */
		switch(choice) {

			case 1:

				Deposit.deposit();

				break;

			case 2:

				Withdraw.withdraw();

				break;

			case 3:

				CheckBalance.checkBalance();

				break;

			case 4:

				TransferFund.transferFund();

				break;

			case 5:

				System.out.println("Thank you for using our ATM. Have a nice day.");

				System.exit(0);					
		} // End of switch case
	} // End of menuChoice
} // End of ATM class
