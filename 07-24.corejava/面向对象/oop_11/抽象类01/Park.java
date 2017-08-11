package oop_11.抽象类01;

public class Park {

	public void doPark(Vehicle v) {

		if (v.getType() == 0) {
			System.out.println("你是 小汽车 , 每小时 2 元");
		} else if (v.getType() == 1) {
			System.out.println("你是 公交车 , 每小时 20 元");
		} else if (v.getType() == 3) {
			System.out.println("你是 共享单车 , 赶紧出去.........");
		}

	}

}
