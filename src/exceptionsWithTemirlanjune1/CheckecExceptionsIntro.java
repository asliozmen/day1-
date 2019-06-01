package exceptionsWithTemirlanjune1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckecExceptionsIntro {

	public static void main(String[] args) throws FileNotFoundException{  // throws key words==>declaration
                                                     //you can make as many declaration as you want.
		
			File file = new File ("credentionals.properties");        // try-catch block ==> handling 
			FileReader reader = new FileReader(file);
	}}	//You have to declare or handle the checked exceptions. but for unchecked exceptions you have not.
		
		 
		
	


