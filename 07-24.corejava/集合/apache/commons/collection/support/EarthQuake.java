package apache.commons.collection.support;



import java.util.Date;
import java.text.MessageFormat;


/* µØÕðÐÅºÅ */
public class EarthQuake {
	
	private String location;
	private float intensity;
	private float depth;
	private Date time;
	
	
	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public float getIntensity() {
		return intensity;
	}


	public void setIntensity(float intensity) {
		this.intensity = intensity;
	}


	public float getDepth() {
		return depth;
	}


	public void setDepth(float depth) {
		this.depth = depth;
	}


	public Date getTime() {
		return time;
	}


	public void setTime(Date time) {
		this.time = time;
	}


	@Override
	public String toString() {
		return MessageFormat.format("location is : {0} , intensity is : {1} , depth is : {2} , time is : {3}", new Object[]{location ,intensity,depth ,time});
		
	}
}
