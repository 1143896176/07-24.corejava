package oop_13.接口和抽象类;

public class 体育老师 extends 老师 {
	
	
	private String level;

	@Override
	public void 讲课() {
		System.out.println("教同学们怎么打篮球...");
	}

	@Override
	public void 补课() {
		System.out.println("教3分远投.......");
	}

	@Override
	public void 辅导() {
		System.out.println("教 过人 .....");
	}

}
