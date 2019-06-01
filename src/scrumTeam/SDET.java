package scrumTeam;

public class SDET extends ScrumTeam{
 @Override
 public void work() {
	 System.out.println("SDET is writing automation code.");
 }
 static {
	 System.out.println("Static block of SDET class.");
	 }
    {
    	System.out.println("Instance block of SDET class.");
    }
    public SDET() {
        System.out.println("Constractor of SDET class");
    }
	
	
	
	
}
