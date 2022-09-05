package JavaBasic;

public class ArrayMaxElements {

	public static void main(String[] args) {
		
		int a[]= {50,30,40,20,60};
		
		int max=a[0];    //50
		
		for(int i=1;i<a.length;i++) //30  40  20  60
		{
			if(a[i]>max)  //30>50  40>50  20>50  60>50
			{
				max=a[i];  //50  60
			}
		}
		System.out.println("the maximum value is..."+max);

	}

}
