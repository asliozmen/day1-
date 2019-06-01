package arrays; 

public class MultiDimensionalProjectWithTeam {

	public static void main(String[] args) {
		
		int [][] array= {{1,2,3},{4,5,6},{7,8,9}}; 
		int num=0;                      // array2={{7,4,1},{8,5,2},{9,6,3}}
		                                 // i  y        a  b           i   y            a  b
		                                 //[0][0]----> [0][2]         [1] [0]          [0] [1]  
		                                 //[0][1]----> [1][2]         [1] [0]          [
	    int cal = array.length;          //[0][2]----> [2][2]	
	    int row = array[0].length;
	    int [][]array2= new int [cal][row];
	    
	    for(int i=0, b=array.length-1; i<=array.length-1; i++,b--) {
	    	for(int y=0, a=0; y<array[i].length; y++, a++) {
	    		num= array[i][y];
	    		
	    		array2 [a][b]= num;
	    		
	    		
//	    		 for (int i =0; i< array2.length; i++) {
//	    			 for (int y=0; y<array2[i].length; y++) {
//	    		 
//	    	System.out.println(array2[i][y]+ " "); 
//	      
//			}
			
		
		}}}}
		           
		           
		      
		

	
