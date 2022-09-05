package JavaBasic;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner (System.in);
		int num =sc.nextInt();
		
		int org_num=num;
		
		int rev=0;
		
		while(num!=0)
		{
			rev=rev*10 + num%10;
			num=num/10;
			
		}
		if(org_num==rev)
		{
			System.out.println("This is the palindrome Number");
		}
		else
		{
			System.out.println("This is not palindrome Number");
		}
		
	

	}

}
