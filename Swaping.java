package JavaBasic;

public class Swaping {
	
	public static void main(String arg[]) {
		
		int a=10;
		int b=50;
		
		System.out.println("Before swaping....."  +a+" "+b);
		
		//Logic1 ---Using third Variable
		
		/*int t=a;
		a=b;
		b=t;
		
		System.out.println("After swaping....."  +a+" "+b);*/
		
		
		
		//Logic2 -----Use + & - without third variable
		
		/*a=a+b;  //10+50=60
		b=a-b;  //60-50=10
		a=a-b;  //60-10=50
		
		System.out.println("After swaping....."  +a+" "+b);*/
		
		//Logic3 -----use * and / without third variable
		//here a & b should not be zero
		
	
		a=a*b;  //10+50=60
		b=a/b;  //60-50=10
		a=a/b;  //60-10=50

		System.out.println("After swaping....."  +a+" "+b);
		
	}
	
	
			

}
