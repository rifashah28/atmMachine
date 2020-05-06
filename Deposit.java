/**
 * Description: Carry out the deposit transaction in the ATM machine.
 * CECS 343 SPRING 2020
 * ATM Machine: Deposit
 * @author Nathaniel Monte De Ramos and Rifa Safeer Shah
 * Date: 05/05/2020
 */

package atmMachine;



import java.util.Scanner;



//adds and amount to the account

public class Deposit 

{

	static String name = "Deposit to Balance";

	public static void deposit()

	{

		double depositAmmount;//initial for the deposit ammount

		double accBalance;//initial for the account balance

		

		Scanner scan = new Scanner(System.in);//for scanning the user input for deposit

		System.out.println("Your balance is $" + Account.getBalance());//show the user the balance before deposit

		System.out.println("How much would you like to deposit?");

		

		depositAmmount = scan.nextDouble();//taking in the deposit

		accBalance = Account.getBalance() + depositAmmount;//the new balance 

		

		System.out.println("Your new balance is $" + accBalance);//print out new balance

		Account.setBalance(accBalance);//set the customer balance to the new 	

		

	}

}





// DO SOME TEST TO CHECK IF ITS RIGHT
