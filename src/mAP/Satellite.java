package mAP;

public class Satellite {
	private String Names;
	private double orbitalSpeed;
	private double timeOfOneOrbit;
	private long OrbitalRadius;
	
	public Satellite(String Names, double orbitalSpeed, double timeOfOneOrbit, long OrbitalRadius) {
	this.Names=Names;
	this.orbitalSpeed=orbitalSpeed;
	this.timeOfOneOrbit=timeOfOneOrbit;
	this.OrbitalRadius=OrbitalRadius;
	}
	public String getNames() {
		return Names;
	}
	public void setNames(String Names) {
		this.Names=Names;
	}
	
	public double getOrbitalSpeed() {
		return orbitalSpeed;
	}
	public void setOrbitalSpeed(double orbitalSpeed) {
		this.orbitalSpeed= orbitalSpeed;
	}
	public double getTimeOfOneOrbit() {
		return timeOfOneOrbit;
	} 
	public void setTimeOfOneOrbit(double timeOfOneOrbit) {
		this.timeOfOneOrbit=timeOfOneOrbit;
	}
	public long OrbitalRadius() {
		return OrbitalRadius;
	}
	public void setOrbitalRadius(long OrbitalRadius) {
		this.OrbitalRadius=OrbitalRadius;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
