package 结构模式.门面模式;

public class SecurityFacade {
	
	private Alarm alarm;
	private Sensor sensor;
	private Camera camera;
	
	public SecurityFacade() {
		alarm = new Alarm();
		sensor = new Sensor();
		camera = new Camera();
	}
	
	public void init() {
		
		alarm.active();
		sensor.active();
		camera.on();
	}

}
