package arrays;

import java.util.Scanner;

public class VendingMachineArray {

	public static void main(String[] args) {
		// Create 3 different arrays and store the values inside
		// toblerone, sneakers,lays, ruffles,cookies,pepsi,m&m, fanta,7up
	//number 1,       2,          3,   4  ,     5  ,  6  ,  7    , 8,  9
	//prices  3          4       5     6       7      8      9     10   11
		//Write the code for vending machine
		//First user sould enter the product number
		//then the machine will ask the price of the product
		//if product price is matching with expected price
		//then print enjoy with the product name
		//if product price is not matching with expected amount
		//print please try again.
		
		
		
		String[] productName= {"toblerone","snekars","lays","ruffles","cookies","pepsi","m&m","fanta","7up"};
		int[] productNumber= {1,2,3,4,5,6,7,8,9};
		int[] productPrice = {3,4,5,6,7,8,9,10,11};
		
		
		Scanner sc= new Scanner (System.in);
		System.out.println("What is the product you would like to buy? Please enter the number of it?");
		
		int pNumber= sc.nextInt();
		
		
		for (int i=0 ; i<productNumber.length; i++) {
			if(pNumber==productNumber[i]) {
				
				System.out.println("Please enter the product price: $ " + productPrice[i]);
				int pPrice= sc.nextInt();
				if (pPrice==productPrice[i]) {
					
					System.out.println("Enjoy with the  " + productName[i] + " :)) " );
					
				}else {
					System.out.println("Please try again");
					
				}
				
				}
			}
		}
		
		
		

	}


