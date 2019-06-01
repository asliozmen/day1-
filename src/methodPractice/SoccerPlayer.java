package methodPractice;

public class SoccerPlayer {
	
	String name= "Cristiano";
	String lastName= "Ronaldo";
	int age= 34;
	String team= "Juventus";
	String national = "Portuguase";
	int legs=2;
	int eyes=2;
	String hairColor= "Brown";
	double height = 1.88;
	int weight=75;
	boolean injured= false;
	boolean penalty= true;
	int training=4;   // Check etmek istedigimiz husus mactan once 4 gun antrenman 
	                    //yapmissa oynayabilir. Degilse oynayamaz seklinde. 
	
	public boolean checkNational (String nation) {
		if(nation.equals("Portuguase")) {
			return true;
		}else {
			return false;
		}
	}
	public void canPlay(int days) {
		if (days >=4) {
			System.out.println("Ronaldo can play.");
		}else {
			System.out.println("Ronaldo can not play.");
			
		}                        //simdi "method overloading" yapacak.Ayni method altinda
	}
	public void canPlay() {
		if (checkNational("Portuguase")) {
			System.out.println("Ronaldo can play");
		}
		
	}
	public void canPlay(int days, boolean injured) {
		if (days >=4 && injured==false) {
			System.out.println("Ronaldo can play.");
	}else {
		System.out.println("Ronaldo can not play.");
	}
		}
	
	
	public static void main(String[] args) {
		
		
		SoccerPlayer player = new SoccerPlayer();
		player.canPlay(5);
		player.canPlay(3);
		player.canPlay(4,  true);
		player.canPlay(4, false);
		
	}

}
