package ѭ������_while;

import java.util.Scanner;

public class Test_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����뿪ʼλ��");
		
		int x = sc.nextInt(); 
		
		
		System.out.println("���������λ��");
		int y = sc.nextInt(); 

		for(  ; x<= y ; x++ ) {

			if(x%2==0) {
				continue;  //����
			}
			
			System.out.println(x);
		
			
		}
		


		
	}

}
