/**
 * Description: Carry out the check balance transaction in the ATM machine.
 * CECS 343 SPRING 2020
 * ATM Machine: Check Balance
 * @author Nathaniel Monte De Ramos and Rifa Safeer Shah
 * Date: 05/05/2020
 */


package atmMachine;



//checks the balance in the account

public class CheckBalance

{

	public static void checkBalance()

	{

		System.out.println("===============CHECK BALANCE===============");

		System.out.println("Card Number : " + Account.getCardNum());

		System.out.println("Balance     : " + Account.getBalance());

		System.out.println("===========================================");

	}

}



//ACT DIAGRAM FOR CHECH BALANCE NEEDS TO CHANGE... 

//TAKE ERROR PATH OUT
