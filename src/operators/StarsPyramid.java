package operators;

public class StarsPyramid {

	public static void main(String[] args) {
		
		String stars = "*************";
		String spaces ="             ";
        int starNum = 1;
        int spaceNum = 6;
         
        for (; spaceNum>=0; spaceNum--, starNum+=2) {
        	System.out.println(spaces.substring(0,spaceNum));
        	System.out.println(stars.substring(starNum));
        }
	}

}
