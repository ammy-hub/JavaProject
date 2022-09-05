package JavaBasic;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortElement {

	public static void main(String[] args) {
		
		int a[]= {30,50,20,10,60};
		
		//Approach 1  --- Using Parallel method
	/*	
		System.out.println("Array Element Before Sorting: "+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array Element After Sorting: "+Arrays.toString(a));
	*/

		
		//Approach2 ---- Using sort method  (Ascending Order)
		
		/*System.out.println("Array Element Before Sorting: "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array Element After Sorting: "+Arrays.toString(a));*/
		
		
		//Approach3 ---- Using sort method  (Descending Order)
		
		Integer b[]= {30,50,20,10,60};
		System.out.println("Array Element Before Sorting: "+Arrays.toString(b));
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println("Array Element After Sorting: "+Arrays.toString(b));
	}
	

}
