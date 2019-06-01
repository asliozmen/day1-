package arrays;

public class StringArray {

	public static void main(String[] args) {
		
		String [] names = new String[5]; // 5 tane string save edebiliyoruz demek.
		 names[0] ="Dmytro";
		 names[1] = "Kuttubek";
		 names[2] = "Mehmet";
		 names[3] = "Enes";
		 names[4] = "Asiyat";  // isimleri tek tek yazdirmamak icin for loop yaptik.
		 
		 for(int index=0; index<names.length; index++) {
			 System.out.println(names[index]);
			 
		}
         System.out.println("================================="); // daha kolay bir yol varmis. adi For Each Loop
         
         for(String n : names) {              // n degiskeni once 1.yani index0 oluyor nameslerden aliyor bakiyor baska var mi var oyle devam
        	 System.out.println(n);         // Great!!!
         }
	}

}
