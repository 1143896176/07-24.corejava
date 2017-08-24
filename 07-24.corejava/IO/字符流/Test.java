package ×Ö·ûÁ÷;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Test {

	public static void main(String[] args) throws Exception {
		
		Reader reader = new InputStreamReader(new FileInputStream("io.txt") , "utf-8");
		
		BufferedReader buffer = new BufferedReader(reader);
		
		while(buffer.ready()) {
			System.out.println(buffer.readLine());
		}
		
	}

}
