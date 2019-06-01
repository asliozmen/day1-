package operators;

import java.util.Scanner;

public class LOOPSUnread {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Please enter READ message:");
		
		int read = input.nextInt();
		
		System.out.println("Please enter UNREAD messages:");
		
		int unread = input.nextInt();
		
		while(unread>0) {
			System.out.println("User is reading a message..");
			System.out.println("Unread:"+ unread);
			System.out.println("Read:" + read);
			System.out.println("..........\n"); // Bu satiri koyunca aralik veriyor..koymayinca alt alta satir satir yaziyor.. 
			
			unread--;
			read++;
			
		}
		System.out.println("The number of unread messages: "+ unread);

	}

}
