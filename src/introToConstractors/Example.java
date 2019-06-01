 package introToConstractors;

public class Example {
	
	private int age;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHeigth() {
		return heigth;
	}

	public void setHeigth(float heigth) {
		this.heigth = heigth;
	}

	public boolean isHealty() {
		return healty;
	}

	public void setHealty(boolean healty) {
		this.healty = healty;
	}

	private double weigth;
	private String name;
	private float heigth;
	private boolean healty;
	
	
	private Example (String name) {
		this.name= name;
	}
	
	public Example (int age) {
		this();
		
	}
	public Example (double weigth) {
		
	}
    public Example (boolean healty) {
    	
    }
    
    public Example() {
    	this("Boy");
    }
}
