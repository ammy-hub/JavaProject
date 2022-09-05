package JavaBasic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws Exception {
		
		FileWriter fw=new FileWriter("C:\\Users\\hp\\Desktop\\ReadMe.txt");
		
		BufferedWriter bw= new BufferedWriter(fw);
		
		bw.write("Selenium with java");
		bw.write("Selenium with Python");
		bw.write("Selenium with c++");
		
		System.out.println("Finished....");
          
		bw.close();
	}

}
