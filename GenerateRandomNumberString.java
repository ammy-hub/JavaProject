package JavaBasic;

import java.util.Random;

public class GenerateRandomNumberString {

	public static void main(String[] args) {
		
		//Approach1 - Random
		
		Random rand= new Random();
		
		int rand_num=rand.nextInt(20);
		System.out.println(rand_num);

		
		//Double rand_dbl=rand.nextDouble();   //range 0.0 and less than 1.0
		//System.out.println(rand_dbl);
		
		
		
		//Approach2 - Math Class
		
		//System.out.println(Math.random());
		
	}

}
