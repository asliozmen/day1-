package operators;

public class NestedForLoop {

	public static void main(String[] args) {
		
		 outerLoop: for(int i=0 ; i<=10 ; i++) {
			
			System.out.print("i: " +i+  "--->");
			
			for(int i2=1 ; i2<=10; i2++) {
				
				System.out.print(i2+ ",");
				 
				if(i2==3) {
					
					break outerLoop;
				
					
				}
			}
			System.out.println();
		}

	}}


