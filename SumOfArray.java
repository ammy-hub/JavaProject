package JavaBasic;

public class SumOfArray {

	public static void main(String[] args) {
		
		int a[]= {5,6,2,7,6,1};
		
		int sum=0;
		
		for(int i=0;i<a.length-1;i++)
		{
			sum=sum+a[i];
			
		}
		
		System.out.println("The Sum Of Array is..."+ sum);
		

	}

}
