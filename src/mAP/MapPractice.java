package mAP;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapPractice {

	public static void main(String[] args) {
		
		Map dictionary=new HashMap();
		
		dictionary.put("Grammer", "Advise on some of the trickiest points of English Grammer");
        dictionary.put("Spelling", "Quick tips and other useful quidelines.");
        
        System.out.println(dictionary.get("Grammer"));
        System.out.println(dictionary.get("Spelling"));
        
        
        Map dictionary2= new HashMap();
        dictionary2.put("Usage", "This section gives you lots of practical advice.");
        
        dictionary2.putAll(dictionary);
        
        System.out.println(dictionary2.get("Spelling"));
        
        dictionary2.remove("Usage","This section gives you lots of practical advice");
        
        System.out.println(dictionary2.get("Usage"));
        
        //TASK
        //Create one map with called employee.
        //give the name of the employee and employee department.
        //key is employee and value is empDepartment
        //Account,IT,Research, UX team, UAT team, SIT
        //Create more than one people which is under same team.
        //==========================================================
        
        
        Map employee= new HashMap();
        employee.put("Danial", "Account");
        employee.put("Sarah", "IT");
        employee.put("Ali","SIT");
        employee.put("Kushal", "IT");
        employee.put("Samir", "Account");
        employee.put("Jake", "IT");
        employee.put("Asley","UX");
        
        System.out.println(employee.get("Kushal"));
        
        //How to alterate the keys..which are names? We have to convert to the SET.
        
        Set<String>department=employee.keySet();
        
        for(String str:department) {
        	System.out.println(str + " " + employee.get(str));
        }
      // I wanna print name and values who is department is account.
        	
        	for(String str: department) {
        		if(employee.get(str).equals("Account")) {
        			System.out.println(str + " "+ employee.get(str));
        		}}
        	for(String str1: department) {
        		if (employee.get(str1).equals("IT")) {
        		System.out.println(str1 + " "+ employee.get(str1));
        		}
        	}
        	for(String str2: department) {
        		if (employee.get(str2).equals("UX")) {
        			System.out.println(str2 + " is in " + employee.get(str2)+ " team.");
        			}
        		}
          System.out.println(employee.entrySet());
          
          Set entry= employee.entrySet();
          System.out.println(entry);
        
          Iterator n= entry.iterator();
          
         while (n.hasNext()) {
        	  System.out.println(n.next());
          }
           employee.replace("Kushal", "UX");
           System.out.println("Kushal department is " + employee.get("Kushal"));
           
           System.out.println(employee.values());
       //    Collection cl= employee.values();
           System.out.println(employee.size());
           
         	employee.clear();   //it will clear all the value inside the map.
         	
         	System.out.println(employee);
            System.out.println(employee.containsValue("Account")); 
            
            System.out.println("Jake is not avalible "+ employee.containsKey("Jake"));
            
            System.out.println(employee.isEmpty());
	}
        
        
        
        
        
        
        
	}


