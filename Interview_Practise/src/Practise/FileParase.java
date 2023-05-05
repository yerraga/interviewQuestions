package Practise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileParase {
 public static void main(String[] args) {
	String fileName = "C:\\Users\\Ganesh\\OneDrive\\Desktop\\Ganesh.txt";
	
	List <String> lines = new ArrayList<>();
	
	try(BufferedReader bf = new BufferedReader(new FileReader(fileName)) ){
		
		String line;
		
		while ((line = bf.readLine()) != null) {
			lines.add(line);
		}
	}
	catch (IOException e) {
		  System.err.format("IOException: %s%n", e);
	}
	System.out.println("File contents :");
	for (String line : lines) {
		System.out.println(line);
	}
}
}
