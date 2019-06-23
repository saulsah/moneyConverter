/* 
 * Reads the monetary amount entered by the user and converts said amount into the least number of dollar and coin amounts.
 * @author Alexander Saul
 * @version 1.0
 */
import java.util.Scanner;
public class MoneyConverter {
	/*
	*  Converts any amount entered by user into the least number of bills and coin amounts.
	*/
	public static void main(String[] args) {
		
		//Declaring scanner object.
		Scanner sc = new Scanner (System.in);
		
		//Declaring the local variables.
		double originalAmount;
		int remainBalance, tenDollar, fiveDollar, oneDollar, quarter, dime, nickel, penny;
		
	//Input:
		//Reads a monetary amount given by the user.
		System.out.print("Enter monetary amount:");
		originalAmount = sc.nextDouble();
		
	//Processing:
		//Total number of pennies are calculated by multiplying the original amount entered by user by 100.
		int amountInPennies = (int) (originalAmount * 100);
		
		//Divide the amount by $10 to get the number of $10.
		tenDollar = amountInPennies / 1000;
		//Calculate the remaining amount.
		remainBalance = amountInPennies % 1000;
		
		//Divide the remaining amount by $5 to get the number of $5.
		fiveDollar = remainBalance / 500;
		//Calculate the remaining amount.
		remainBalance = remainBalance % 500;
		
		//Divide the remaining amount by $1 to get the number of $1.
		oneDollar = remainBalance / 100;
		//Calculate the remaining amount.
		remainBalance = remainBalance % 100;
		
		//Divide the remaining amount by $0.25 to get the number of $0.25.
		quarter = remainBalance / 25;
		//Calculate the remaining amount.
		remainBalance = remainBalance % 25;
		
		//Divide the remaining amount by $0.10 to get the number of $0.10.
		dime = remainBalance / 10;
		//Calculate the remaining amount.
		remainBalance = remainBalance % 10;
		
		//Divide the remaining amount by $0.05 to get the number of $0.05.
		nickel = remainBalance / 5;
		//Calculate the remaining amount.
		remainBalance = remainBalance % 5;
		
		//Total amount of pennies is equal to the remaining balance.
		penny = remainBalance;
		
		
	//Output:
		//Displays the amount given by the user in the least number of bills and coin.
		System.out.println("That's equivalent to:");
		//Display the number of $10.
		System.out.println(tenDollar + " ten dollar bills");
		//Display the number of $5.
		System.out.println(fiveDollar + " five dollar bills");
		//Display the number of $1.
		System.out.println(oneDollar + " one dollar bills");
		//Display the number of $0.25.
		System.out.println(quarter + " quarters");
		//Display the number of $0.10.
		System.out.println(dime + " dimes");
		//Display the number of $0.05.
		System.out.println(nickel + " nickels");
		//Display the number of $0.01.
		System.out.println(penny + " pennies");
	}
}

