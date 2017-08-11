package oop_13.接口和抽象类;

public class Java老师 extends 老师{
	
	private double coding;

	@Override
	public void 讲课() {
		System.out.println("............");
	}

	@Override
	public void 补课() {
		System.out.println("  再讲一遍 .....  : (      ");
	}

	@Override
	public void 辅导() {
		System.out.println("  你还要我怎么讲  你才明白呢 ??  : )    ");
	}

}
