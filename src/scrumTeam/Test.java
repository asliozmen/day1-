package scrumTeam;

public class Test {

	public static void main(String[] args) {
		
		SDET sdet = new SDET();
		System.out.println("=====================");
		
		SDET sdet2= new SDET();                     //Static bllock exacuted once.
		
		System.out.println("++++++++++++++++++++++");
		
		Developer d= new Developer();
		d.work();
		

	}

}
