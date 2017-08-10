package oop_05.��װ03.test;

import oop_05.��װ03.Addr;
import oop_05.��װ03.Dept;
import oop_05.��װ03.Emp;
import oop_05.��װ03.Person;
import oop_05.��װ03.WorkType;

public class Test02 {
	
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
		
		/////////////////////////////////////////////////////
		
		//����/����
		Dept dev = new Dept();
		dev.setMgr(empScott);
		dev.setDid(1);
		dev.setdName("������");
		
		
		//�����λ
		WorkType t1 = new WorkType(1 , "�������ʦ" , 2 ) ;
		WorkType t2 = new WorkType(1 , "��Ŀ����" , 3 ) ;
		
		
		empScott.setType(t2);
		empJack.setType(t1);
		empTom.setType(t1);
		
		
		//scott ��Ǯ��. �������ױ����ķ���
		Addr a1 = new Addr();
		Addr a2 = new Addr();
		
		scott.setAddrs(new Addr[] { a1 , a2});
	
		
		
		
	}

}
