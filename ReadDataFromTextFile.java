package JavaBasic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws Exception {
		
		//Approach 1-----Using BufferReader
	   
		/*FileReader fr=new FileReader("C:\\Users\\hp\\Desktop\\ReadMe.txt");
		
		BufferedReader br=new BufferedReader(fr);
		
		String str;
		
		while((str= br.readLine()) != null)
		{
			System.out.println(str);
		}
		br.close(); */

		
		
	//Approach 1-----Using Scanner & File
		
		File file=new File("C:\\Users\\hp\\Desktop\\ReadMe.txt");
		Scanner sc=new Scanner(file);
		
	/*	while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		*/
		
		
		
		
		//Approach 3---
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		
		
		
	}

}
