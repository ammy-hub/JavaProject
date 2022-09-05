package JavaBasic;

public class CountDigitNumber {

	public static void main(String[] args) {
		
		int num=45663242;
		int count=0;
		
		while(num>0)
		{
			num=num/10;
			count++;
					
		}
		System.out.println("the count is.."+count);
		

	}

}
