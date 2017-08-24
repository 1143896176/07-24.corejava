package apache.commons.collection.predicate;


import org.apache.commons.collections.Predicate;

import apache.commons.collection.support.EarthQuake;

/*  �����ź�  ɸѡ����  */
public class MajorQuakePredicate implements Predicate {

	private Float majorIntensity;   
	private Float majorDepth;   
	
	public MajorQuakePredicate(Float majorIntensity , Float majorDepth) {
		this.majorIntensity = majorIntensity;
		this.majorDepth = majorDepth;
	}
	
	/**
	 * ɸѡ��
	 */
	public boolean evaluate(Object object) {
		boolean satisfies = false;
		if(object instanceof EarthQuake) {
			EarthQuake quake = (EarthQuake) object;
			if(quake.getIntensity()> majorIntensity && quake.getDepth()< majorDepth) {
				satisfies = true;
			}
		}
		return satisfies;
	}

	


}
