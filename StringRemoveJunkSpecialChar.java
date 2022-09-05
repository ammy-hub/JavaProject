package JavaBasic;

public class StringRemoveJunkSpecialChar {

	public static void main(String[] args) {
		
		String s="%$ testing is importatnt ###$&%&";
		
		s=s.replaceAll("[^a-zA-Z0-9]"," ");
		
		System.out.println(s);

	}

}
