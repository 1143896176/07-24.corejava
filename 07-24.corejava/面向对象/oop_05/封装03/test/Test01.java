package oop_05.��װ03.test;

import oop_05.��װ03.Emp;
import oop_05.��װ03.Person;

public class Test01 {

	public static void main(String[] args) {

		Person boss = new Person();
		boss.setAge(50);
		boss.setEmail("boss@neusoft.com");
		boss.setName("boss");
		
		Emp empBoss = new Emp();
		empBoss.setPerson(boss); // ָ���������Ϣ
		empBoss.setSalary(100000);

		Person scott = new Person();
		scott.setAge(40);
		scott.setEmail("111@11.com");
		scott.setName("scott");
		Emp empScott = new Emp();
		empScott.setPerson(scott);
		empScott.setSalary(10000);

		
		Person jack = new Person();
		jack.setAge(20);
		jack.setEmail("jack@123.com");
		jack.setName("jack");
		Emp empJack = new Emp();
		empJack.setPerson(jack);
		empJack.setSalary(500);
		
		Person tom = new Person();
		tom.setAge(25);
		tom.setEmail("tom@123.com");
		tom.setName("tom");
		Emp empTom = new Emp();
		empTom.setPerson(tom);
		empTom.setSalary(600);

		////////////////////////////////////////////////////////
		// �����ϼ�
		empScott.setUp(empBoss);
		// ��������
		Emp[] emps = { empJack, empTom };
		empScott.setDowns(emps);

		System.out.println("scott ���ϼ� ��  : " + empScott.getUp().getPerson().getName());

		System.out.println("scott �ĵ�һ�� ���������� : " + empScott.getDowns()[0].getPerson().getName());

		// scott ��ְ�� ������һλ jerry �滻����
		Person jerry = new Person();
		jerry.setName("jerry");
		Emp empJerry = new Emp();
		empJerry.setPerson(jerry);
		
		empJack.setUp(empJerry);
		
		System.out.println("jack������˾�� : " + empJack.getUp().getPerson().getName());

	}

}
