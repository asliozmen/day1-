package methodPractice;

public class Student {
	
	int age= 20;
	String name= "Mustafa";
	String attandenceDate= "04/06/1999";
	int classNumber= 77;
	String address= "16 Kenneth Ave." ;
	
	public void printClass(String[] className) { 
		
		int creditMath=3;
		int creditBio=2;
		int creditESL=2;
		int creditComp=4;
		
		for(int i=0; i<className.length; i++) {
			
			if (className[i].equals("Math")) {
				System.out.println("Math class credit is " + creditMath);
			}else if (className[i].equals("Biology")) {
				System.out.println("Biology class credit is "+ creditBio);
			}else if (className[i].equals("ESL")) {
				System.out.println("ESL class credit is "+ creditESL);
			}else if (className[i].equals("Computer")) {
				System.out.println("Computer class credit is "+ creditComp);
				
			}
			}
		}
	// int [
	public int [] removeDuplicate(int [] duplicate) {
		int[] temp = new int [duplicate.length];
		int count=0;
		boolean found= false;
		for (int i=0; i< duplicate.length; i++) {
			found = false;
			if (i==0) {temp[count++] = duplicate[i];
			}else {
				for (int k=0;k<count; k++) {
					if (temp [k]== duplicate[i]) {
						found=true;
						
					}
				
			}
			
			
		}
				
	}
		return temp;
	}}


