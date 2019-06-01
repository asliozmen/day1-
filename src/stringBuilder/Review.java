package stringBuilder;

public class Review {

	public static void main(String[] args) {
            
		String str= "";
		
		for(char ch='a'; ch< 'z'; ch++) {
			//System.out.println(ch+ "");
			str+=ch; // append ile ayni seyi yapiyor.
			
			System.out.println(str);
			
		}
		StringBuilder strbl= new StringBuilder("");
		for (char ch= 'a'; ch<='z'; ch++) { // nurada char yerine int yazarsan bak..
           strbl.append(ch);
	}
         System.out.println("StringBuilder--->" + strbl);
         StringBuilder builder= new StringBuilder(" Techtorial ");
         builder.append(10);
         builder.append(" Academy ").append(2019).append(" ---->Muammer").append(true);
         System.out.println(builder);
         
         StringBuilder success= new StringBuilder("Working Hard");
         System.out.println(success);
         success.append("does not makes you successful");
         StringBuilder truth= success.append("Thinking hard will make you successful.");
         System.out.println(truth);
         System.out.println(success);
         
         StringBuilder person = new StringBuilder("Arslan");
         System.out.println(person.charAt(1));
         System.out.println(person.indexOf("s"));
         
         person.length();
         System.out.println(person.length());
         person.substring(1);
         System.out.println(person.substring(1));
         person.substring(2,4);
         System.out.println(person.substring(2,4));
         
         person.insert(3, "yw");
         System.out.println(person);
         person.replace(0, 2, "MMM");
         System.out.println(person);
         
         person.delete(0, 4);
         System.out.println(person);
         
         person.deleteCharAt(0);
         System.out.println(person);
         
         person.reverse();
         System.out.println(person);
         
         String name1= person.toString();  //stringBuilderi stringe ceviriyor.
         
         String city= "Chicago";
         String city1= new String("Chicago");
         System.out.println(city.equals(city1)); //true because checking just values.
         System.out.println(city==city1); //false because checkhing references
         
         StringBuilder build= new StringBuilder("Techtorial");
         StringBuilder build1= new StringBuilder("Techtorial");
         
         System.out.println(build.equals(build1)); //false neden 
         System.out.println(build==build1);//false neden
         
         
         
         
         
         
         
         
         
         
         
         
         
         
}}
