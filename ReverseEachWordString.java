package JavaBasic;

public class ReverseEachWordString {

	public static void main(String[] args) {
		
		
		//Approach 1----Using Logic
		
	/*	String str= "Welcom to java";    //original string
		
		String[] word=str.split(" ");  //splitting string in to words
		
		String reverseString = " ";
		
		for(String w:word)
		{
			String reverseword="";
			
			for(int i=w.length()-1;i>=0;i--)     //Welcome to java
			{
				reverseword=reverseword+w.charAt(i);
				
			}
			reverseString=reverseString+reverseword+" ";   //emocleW  ot  avaj
		}
		System.out.println(reverseString);           */
		
		
		
		
		//Approach 2----using build in
		
		String str= "Welcome to java";
		
		String[] word= str.split("\\s");
		
		String reverseword="";
		
		for(String w:word)  //java
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			
			reverseword=reverseword+sb.toString()+" ";     // avaj
			
		}
		System.out.println(reverseword);
		
		
		
		
		
		

	}

}
