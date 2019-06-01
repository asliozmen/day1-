package arrays;

public class FindingTheDuplicateElement {

	public static void main(String[] args) {

		int[] sAge = { 9, 8, 6, 4, 4, 7, 8, 1 };

		for (int i = 0; i < sAge.length; i++) {

			for (int k = (i + 1); k < sAge.length; k++) {

				if (sAge[i] == sAge[k]) {

			System.out.println(sAge[i]); // sAge[k] de olur cunku ikisi de ayni duplicate element

				}
			}

		}
	}
}
