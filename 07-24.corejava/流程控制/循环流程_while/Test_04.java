package ѭ������_while;

import java.util.Scanner;

public class Test_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����������.......");
		
		int x = sc.nextInt();

		for(  ; x<=50 ; x++ ) {

			if((x%2==0)) {
				continue;  //����
			}
			
			System.out.println(x);
			
			
		}
		


		
	}

}
