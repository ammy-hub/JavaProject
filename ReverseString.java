package JavaBasic;

public class ReverseString {

	public static void main(String[] args) {
		
		//1) Using + (String Concatenation) operater
		
		String str="ABCD";
		String rev= "";
		
		/*int len=str.length(); //4
		
		for(int i=len-1;i>=0;i--)    // 3 2 1 0
		{
			rev=rev+str.charAt(i);    //DCBA
		}
		System.out.println("The String is reversre...."+rev);*/
		
		
		
		//2) Using charactor array
		
/*		char a[]=str.toCharArray();
		int len= a.length;   //4
		
		for(int i=len-1;i>=0;i--)   // 3 2 1 0
		{
			rev=rev+a[i];
		}
		System.out.println("The String is reversre...."+rev);  */
		
		
		//3) Using String Buffer Class
		
		StringBuffer sb= new StringBuffer(str);
		System.out.println(sb.reverse());

	}

}
