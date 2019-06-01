package mAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestSatellite {

	public static void main(String[] args) {
		
		
		Satellite Moon = new Satellite ("Moon",1.0, 27.3, 384000 );
		Satellite Io = new Satellite ("Io", 17.33, 1.77, 421700);
		Satellite Europa = new Satellite("Europa", 13.74, 3.55, 670900);
		Satellite Ganymede =new Satellite("Ganymede", 10.88, 7.16, 1070000);
		Satellite Callisto = new Satellite("Callisto", 8.20 ,16.69 , 1880000);
		Satellite Phobos= new Satellite ("Phobos", 2.14, 0.32 , 9400);
		Satellite Ceres=new Satellite ("Ceres", 17.88 ,266633, 4140000);
		
        Map Satellite= new HashMap();
        Satellite.put("Moon", "Earth");
        Satellite.put("Io", "Jupiter");
        Satellite.put("Europa","Jupiter");
        Satellite.put("Ganymede", "Jupiter");
        Satellite.put("Callisto", "Jupiter");
        Satellite.put("Phobos","Mars");
        Satellite.put("Ceres", "Sun");
        Satellite.put("Earth", "Sun");
        Satellite.put("Jupiter", "Sun");
        Satellite.put("Venus", "Sun");
        
      //  System.out.println(Satellite.get("Moon"));
        
        Set<String>Globe=Satellite.keySet();
        
        for(String a:Globe) {
        	System.out.println(a + " " + Satellite.get(a));
        }
        
        
        
        
        
        
        
        
	}

}
