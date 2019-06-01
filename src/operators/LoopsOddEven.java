package operators;

public class LoopsOddEven {

	public static void main(String[] args) {
		
		int number = 0;
		
		while(number<=100) {
			
			if(number %2 == 0) {
				
        System.out.print(number + "," + " ");
			}
			number++;
		}
		
		System.out.println();  // Bu satiri koymazsak butun rakamlari tek satirda yaziyor. 
		
         number=0;
         
         while (number<=100) {
        	 if (number%2==1) {
        		 System.out.print(number + " ");
        	 }
        	 number++;
         }
	}

}
