package oop_03.����������;

public class Customer {

	public static int count = 0;
	
	//����  ,  ��Ա����  , ʵ������
	public String name ;	
	public String img = "default.jpg";
	
	
	public Customer() {
		count++;
		System.out.println("�� " + count + " λ �û���¼�� . ");
	}
	
	/*
	 * name �Ƿ������β�  Ҳ�Ǿֲ�����
	 * age Ҳ�Ǿֲ����� 
	 * �ֲ����������г�ʼֵ ,  ����������
	 * */
	public void sayHello(String name) {
		int age = 0 ;
		System.out.println("��ӭ����¼ , " + name );
		System.out.println("age : " + age);
	}
	
}
