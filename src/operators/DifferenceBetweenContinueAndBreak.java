package operators;

public class DifferenceBetweenContinueAndBreak {

	public static void main(String[] args) {
		
		for(int i=0; i<=10 ; i++) {
			if(i==3 ) {
				continue;
			} System.out.println(i); }
			
			System.out.println("--------------------");
			
			for(int i=0 ; i<=10; i++) {
				
				if(i==3) {
					break;
				} System.out.println(i);         // ozetleyecek olursak continue bir onceki satiri yaptirtmiyor basa donduruyor
			}                                    //cunku sart saglanmiyor. Break tamamen sonlandiriyor.
		}

	}


