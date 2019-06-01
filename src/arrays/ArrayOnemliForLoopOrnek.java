package arrays;

public class ArrayOnemliForLoopOrnek {

	public static void main(String[] args) {
		
int[] number = {0,1,2,3,4,5,6,7,8,9,10};
		
		for (int i=0; i < number.length; i++) {
			
		
		     for (int k=i+1; k<number.length; k++){
		      
				if (number[i] + number[k]==13) {
					
					System.out.println(number[i] + "  " +number[k]);

	}

}
}}}