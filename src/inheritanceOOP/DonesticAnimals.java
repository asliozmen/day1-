package inheritanceOOP;

public class DonesticAnimals extends Animals{
    String animalName;
	@Override   // it is called annotation
	
	public void run() {
		super.animalName="Domestic animal";
		
		System.out.println("Domestic animal is running.");
		
	}
	@Override // yazsak da olur yazmasak da ama eger yanlis yazarak override yazmaya calisiyorsak hata vermesi yazmaya bagli.
	public void sleep() {
		System.out.println("Domestic animal is sleeping");
	
		
		

	}

}
