package JavaBasic;

public class ArrayDuplicateElements {

	public static void main(String[] args) {
		
		String a[]= {"java","c","c++","python","java"};
		
		
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Found Duplication Element: "+a[i]);
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate Element Not Found");
		}
		

	}

}
