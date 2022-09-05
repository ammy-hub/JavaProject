package JavaBasic;

import java.util.Arrays;

public class ArrayEqualOrNot {

	public static void main(String[] args) {
		
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4};
		
		boolean status =Arrays.equals(a1,a2);
		
		if(status==true)
		{
			System.out.println("Array is equal");
		}
		else
		{
			System.out.println("Array not equal");
		}

	}

}
