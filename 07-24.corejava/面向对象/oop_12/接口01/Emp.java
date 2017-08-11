package oop_12.接口01;

public class Emp implements Work , Play {

	@Override
	public void 上班() {
		System.out.println("开始工作....");
	}

	@Override
	public void 下班() {
		System.out.println("可 下班了.......");
	}

	@Override
	public void 打球() {
		System.out.println("踢球....");
	}

	@Override
	public void 跑步() {
		System.out.println("跑啊跑........");
	}

}
