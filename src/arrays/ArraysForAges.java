package arrays;

public class ArraysForAges {

	public static void main(String[] args) {
		
		
		int  [] [] studentAge= new int [4] [3];
		studentAge [0][0] = 18;
		studentAge [0][1] =21;
		studentAge [0][2] =19;
		studentAge [1][0] =22;
		studentAge [1][1] =30;
		studentAge [1][2] =24;
		studentAge [2][0] =17;
		studentAge [2][1] =28;
		studentAge [2][2] =23;
		studentAge [3][0] =24;
		studentAge [3][1]= 33;
		studentAge [3][2]= 31;
		 
		// int [] [] studentAge = {{18,21,19} 
		
		
		for (int i=0; i<studentAge.length; i++) {
			  for (int k=0 ; k<studentAge[i].length; k++ ) {
			  
			  System.out.println(i + "   " + k); // yada System.out.println(studentAge [i][k]);
				
			}

		}
	



	}

}
