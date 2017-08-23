package 结构模式.适配器模式;

public class Adaptee110V implements Adaptee {

	@Override
	public void powerSupply() {
		System.out.println("提供了 110 V 的电压 ...  ");
	}

}
