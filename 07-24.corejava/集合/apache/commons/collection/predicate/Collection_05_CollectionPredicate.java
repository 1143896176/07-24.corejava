package apache.commons.collection.predicate;


import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;

import apache.commons.collection.support.EarthQuake;





public class Collection_05_CollectionPredicate {

	
	public static void main(String[] args) {
		
		ArrayList<EarthQuake> quakes = new ArrayList<EarthQuake>(); // ��������  ��ŵ����ź�
		//ArrayList<EarthQuake> quakes2= new ArrayList<EarthQuake>();
		
		EarthQuake quake1 = new EarthQuake();
		quake1.setLocation("Chicago, IL");
		quake1.setIntensity(new Float(6.4f));
		quake1.setDepth(new Float(5.23f));
		quake1.setTime(new Date());
		
		
		EarthQuake quake2 = new EarthQuake();
		quake2.setLocation("San francisco ,CA");
		quake2.setIntensity(new Float(4.4f));
		quake2.setDepth(new Float(2.23f));
		quake2.setTime(new Date());
		
		EarthQuake quake3 = new EarthQuake();
		quake3.setLocation("С�ձ�");
		quake3.setIntensity(new Float(1.4f));
		quake3.setDepth(new Float(7.23f));
		quake3.setTime(new Date());
		
		quakes.add(quake1);
		quakes.add(quake2);
		quakes.add(quake3);

		//����ɸѡ����
		Predicate majorQuakePredicate = new MajorQuakePredicate( new Float(4.0) , new Float(3.0));
		
		//CollectionUtils���е�selectRejected �� filter �����ṩ��ɸѡ���ܣ�����һΪ����Ҫɸѡ�ļ����壬������Ϊ�����Զ��巽ʽ����ɸѡ��
		//quakes = (ArrayList) CollectionUtils.selectRejected(quakes, majorQuakePredicate);
		CollectionUtils.filter( quakes , majorQuakePredicate);	

		for(int i =0;i<quakes.size();i++) {
			System.out.println(quakes.get(i).toString());
		}

	}

}
