package JavaBasic;

public class ArrayEvenOddNumber {

	public static void main(String[] args) {
	
		int a[]= {1,2,3,4,5,6};
		
		//Extracting even number...
		System.out.println("Even number in array......");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
			
		}
		
		System.out.println("Odd number in array......");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
			
		}

	}

}
