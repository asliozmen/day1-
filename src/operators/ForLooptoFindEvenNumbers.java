package operators;

public class ForLooptoFindEvenNumbers {

	public static void main(String[] args) {
		
		
		    // 1.kisim; 2.kisim(condition)
		for(int num =0; num<=50; num++) {
			                      //3.kisim update
			
			
			if(num % 2==0) {  // body 
				System.out.print(num);  // even ise numarayi cikar demek.
				
			}else {
				System.out.print ("  ");// tek sayi ise bosluk cikar demek.
			}
		}

	}

}
