package arrays;

public class MoreExample {

	public static void main(String[] args) {
		
		double[] d= { 45.9, 656.8, 543, 765.4 ,543};
		char[] c= {'a', 'a', 'a',};
		byte[] b= {1,2,3,4,5}	;
		String temp = "   ";
		String temp1= " ";
		String temp2= " ";
		
		for (int i=0; i<d.length; i++) {
			temp = d[i]+ " , " ;
		    System.out.print(temp);
		}
         for (int i=0; i<c.length; i++) {
        	 temp1 += c[i]+ " , ";
        	 
        	 System.out.println(temp1);
         }
         for (int i=0; i<b.length; i++) {
        	 temp2 += b[i]+ " , ";
         }
         System.out.println(temp2);
	}

}
