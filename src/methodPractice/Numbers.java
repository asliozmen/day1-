package methodPractice;

public class Numbers {
    boolean canAttend= false;
	public void checkAge(int age) {
		
		if (age>=18) {
			System.out.println("the person can attend the organization");
		} else if (age<18) {
			System.out.println("the person can NOT attend the organization");
		}
	}
	public boolean checkAgeBoolean(int age) {
		if(age>= 18) {
			
			canAttend= true;
			
			System.out.println(canAttend);
			
		} else if (age <18) {
			
			canAttend= false;
			
			System.out.println(canAttend);   // Printi buraya da koyabiliriz. NumbersTest kismina da
		}
			return canAttend;
	}
	
public void checkName(String name) {
		
      if(name.startsWith("M")) {
			
		System.out.println("The person is accepted.");
		
	} else {
		
	    System.out.println("The person is not accepted.");
		
	}
		}
   public void canAttend (String name , int age) {
	
	if (name.startsWith("T") && age>=18) {
		System.out.println("the person can attend the organization.");
	}else if (name.startsWith("T") && age<18) {
		System.out.println("the person can not attend the org. because age is less than 18.");
	}else if (! name.startsWith("T") && age<18) {
		System.out.println ("the person can not attend the organization.");}
	
   }
		
		public void printNumber(int [] number) { //Arraydaki butun elementleri yazdirmak icin for loop
			for (int i=0; i<number.length; i++) {
				System.out.print(number[i]+ ",");
				
			}
			System.out.println();
		}
		
		
		public void checkString(String[] names) {
			for(int i=0 ; i< names.length; i++) {
				if(names[i].startsWith("P")) {
					System.out.println(names[i]);
				}
				System.out.println();
			}
		}
		
		public void increaseNumber(int num) {
			int addNumber=5;
			//num amd addNumber is local variables.
			//local variables we can not access outside of the method body.
			//local variables we should initialize
			// local variables will not take default value.
			num +=addNumber;
			System.out.println(num);
		}
		public static void main (String[]args) {
		
		
		
 	}}







	
