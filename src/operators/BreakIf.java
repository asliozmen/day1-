package operators;

public class BreakIf {

	public static void main(String[] args) {
	  
		stop: for(int i =0 ; i < 10 ; i++ ) {
			
			if (i==4) {
				break stop;
			}
				
		System.out.println(i);

	}

	}}
