package ��.����;

import ��.ShenXian;

public class Test {

	public static void main(String[] args) {
		//������  ����ʵ����  ���ɶ��� 
		ShenXian shifu = new ShenXian();
		//Ϊ�����е�����  ���и�ֵ .
		shifu.name  ="��ɮ";
		shifu.wuqi = "����";
		shifu.zdl = 0;
		shifu.nl = 9;
		
		ShenXian wukong = new ShenXian();
		wukong.name  ="���";
		wukong.wuqi = "�𹿰�";
		wukong.zdl = 10;
		wukong.nl = 10;
		
		ShenXian bajie = new ShenXian();
		//Ϊ�����е�����  ���и�ֵ .
		bajie.name  ="�˽�";
		bajie.wuqi = "����";
		bajie.zdl = 7;
		bajie.nl = 1;
		
		ShenXian wujing = new ShenXian();
		//Ϊ�����е�����  ���и�ֵ .
		wujing.name  ="�⾩";
		wujing.wuqi = "������";
		wujing.zdl = 5;
		wujing.nl = 9;
		
		
		System.out.println(wujing.wuqi);
		
		bajie.Ŀ��();
		wukong.Ŀ��();
		
		
		bajie.С��˼("��һ�����  ����ׯ . . Ȣϱ�� .....");
		
		
		bajie.������("�׹Ǿ�");
		

	}

}
