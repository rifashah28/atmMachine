/**
 * Description of the class
 * ATM Machine: ATM
 * @author Rifa Safeer Shah, Fernando Gonzales, Nathaniel Monte De Ramos.
 * Date: 04/14/2020
 */

package atmMachine;

public class ATM {
	/**
	 * i added customer to the menu arguement so you can use the functions in account which are inside of customer
	 * 
	 */
	public void menu(Customer customer) {
		
		Withdraw withdraw = new Withdraw();
		int choice = -1;
		
		
		System.out.println("Welcome to the ATM.");
		System.out.println("Choose from the following Transactions or Exit.");
		System.out.println("1 - Deposit Funds.");
		System.out.println("2 - Withdraw Funds.");		
		System.out.println("3 - Check Balance.");
		System.out.println("4 - Transfer Balance.");
		System.out.println("5 - Exit.");
	} // End of menu
} // End of ATM class


