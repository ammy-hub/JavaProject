package JavaBasic;

public class CountCharactorOccures {

	public static void main(String[] args) {
		
		String s = "Java Programing Java oops";
		
		int totalCount=s.length();   //total length
		
		int totalCount_afterRemove= s.replace("a","").length();  //total count after removing 'a'
		
		int count=totalCount-totalCount_afterRemove;
		
		System.out.println("total count of a is...."+count);
		
		
	}

}
