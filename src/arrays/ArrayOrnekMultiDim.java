package arrays;

import java.util.Scanner;

public class ArrayOrnekMultiDim {

	public static void main(String[] args) {
		// Create mutlidimensionel array size od 3 and 2
		//store the number of students for different classes.
		//First array should include the students in bio class students are (aidana and enes)
		//Second array "      "           "       in math class students are (Kaynbek and Ruslan)
		// Third array                             in comp. class students are (muanner and tima)
 
		String [] [] students = new String [3] [2];
		students [0][0]= " aidana";
		students [0][1]=" enes";
		students [1][0]="Kaynbek ";
		students [1][1]="Ruslan";
		students [2][0]="Muammer";
		students [2][1]="Tima";
		
		for (int i=0; i<students.length; i++) {
			
			for (int k=0; k<students[i].length; k++) {
				System.out.println(students[i][k]); 
			}
		
	}}}


			
		
		
		
		
