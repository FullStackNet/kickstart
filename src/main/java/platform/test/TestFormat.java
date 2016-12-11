package platform.test;



public class TestFormat {
	public static void main(String[] args) throws Exception {
		String a = "ajay/name";
		String b = "sanjay/sriva";
		int c =30;
		int d = 900;
		
		System.out.println(String.format("%-12s %3d", a,c));
		System.out.println(String.format("%-12s %3d", b,d));
		
		
	}
}
