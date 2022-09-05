package JavaBasic;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		System.out.println("Enter The String");
		Scanner sc = new Scanner (System.in);
		
		String str=sc.nextLine();
		String org_st=str;
		String rev="";
		
        int len=str.length(); //4
		
		for(int i=len-1;i>=0;i--)    // 3 2 1 0
		{
			rev=rev+str.charAt(i);    //DCBA
		}
		
		if(org_st.equals(rev))
		{
			System.out.println(org_st+"  Palindrome");
		}
		else
		{
			System.out.println(org_st+"  Not Palindrome");
		}
	

	}

}
