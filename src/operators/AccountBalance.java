package operators;

import java.util.Scanner;

public class AccountBalance {

	public static void main(String[] args) {
	
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your balance: ");
		
		int balance = input.nextInt(); // diyelim 100 dolari var. Giriyor burada. Balance = 100
		
		while (balance>0) {
			
			System.out.println ("Please enter your transaction: ");
			
			int transaction = input.nextInt(); //20, 40,..
			
			if(transaction>balance) {
				
				System.out.println("Hey, you trying to be sneaky!");
				continue ; // bunu koyunca while loopunun basina donuyor. Koymazsak sonununa gidiyor.
			}
			
			balance = balance-transaction;
			
			System.out.println ("Your current balance is :" +balance);// Burayi sonradan ekledik ne kadar kaldigini gorsun diye.
		}
		System.out.println("You are out of balance:(");	
		}
		
		

	}


