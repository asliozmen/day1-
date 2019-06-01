package methodPractice;

import java.util.Scanner;

public class NumbersTest {
    public static void main (String [] args) {
    	
    	Numbers num = new Numbers();
    	
    	num.checkAge(18);
    	num.checkAge(16);
    	num.checkAge(100);
    	
    	System.out.println(num.checkAgeBoolean(22));
    	num.checkAgeBoolean(12);
    	num.checkAgeBoolean(22);
    	
    	Numbers attendance= new Numbers();
    	
    	attendance.checkName("Muammer");
    	attendance.checkName("Ali");
    	attendance.checkName("Meryem");
    	attendance.checkName("mustafa");
    	
    	Numbers organization= new Numbers();
    	organization.canAttend("Tima", 20);
    	organization.canAttend("Temur", 17);
    	
    	int  [] digits= {1,3,5,7,12,13,16,43}; // I have two arrays names are digits and ages.
    	int [] ages= {14,33,52,71,77,89,31,79,36,55,68};
    	 
    	
    	String[] students= {"Aidana", "David", "Kusha","Pasha"};
    	String[] sNAmes = {"Pinar", "Pavlo", "Glia"};
    	
    	attendance.checkString(students);
    	attendance.checkString(sNAmes);
    	
    	// Scanner sc = new Scanner(System.in); Sordular scanner kullanabilir miyiz diye evet dedi yazdi.
    	
    	//num.checkAge(sc.nextInt());
    }
}
