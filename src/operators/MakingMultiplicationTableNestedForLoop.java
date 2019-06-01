package operators;

public class MakingMultiplicationTableNestedForLoop {

	public static void main(String[] args) {
	 
		for(int n=1; n<=10; n++) {    //  1 den 10 a kadar alterate etsin.
			
			for(int n2= 1; n2<=12; n2++) {
				
				System.out.println( n + " * " + n2 + " = " + n*n2);
				}
				System.out.println("==============");
				
// first loop 1--> second loop 1,2,3,4,5,6,7,8,9,10 bitince ic kisimdaki loop bitiyor...first loopta 2 yapiyor.Tekrar icerdeki loop a gi
//first loop 2 ---> second loop 1,2,3,4,5,6,7,8,9,10 diye devam ediyor.
				
			}
		}

	}


