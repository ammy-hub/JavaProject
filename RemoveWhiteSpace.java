package JavaBasic;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
	   
		String str= "java   programing  selenium   automation";
		
		System.out.println("Before removing the white spacec.."+str);
		
		str=str.replaceAll("\\s","");
		
		System.out.println("After removing the white spacec.."+str);

	}

}
