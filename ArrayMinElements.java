package JavaBasic;

public class ArrayMinElements {

	public static void main(String[] args) {

		int a[] = { 50, 100, 40, 20, 60 };

		int min = a[0]; // 50

		for (int i = 1; i < a.length; i++) // 30 40 20 60
		{
			if (a[i] < min) // 100<50 40<50 20<50 60<50
			{
				min = a[i]; // 50  40  20  
			}
		}
		System.out.println("the minimum value is..." + min);

	}

}
