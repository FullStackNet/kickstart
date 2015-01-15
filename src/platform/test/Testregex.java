package platform.test;


public class Testregex {
	public static void main(String[] args) throws Exception {
		String searchString = "aj";
		String text1 = "Ajay";
		String text2 = "sajay";
		if (text1.matches("(?i:.*"+searchString+".*)")) {
			System.out.println("Matched");
		}
	}
}	
