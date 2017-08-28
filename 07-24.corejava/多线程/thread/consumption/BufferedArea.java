package thread.consumption;

import java.util.LinkedList;

//创建一个类模拟缓冲区
public class BufferedArea {

	private LinkedList<Object> myList = new LinkedList<Object>();
	private final int MAX = 3;
	private final int MIN = 0;

	
	public void addData(Object obj) {
		try {
			
			synchronized (myList) {
			
				while (this.myList.size() == MAX) {
					
					System.out.println("缓冲区中的数据已经装在满了……");
				
					myList.wait(); //停止存放数据
				}

		
				if (this.myList.add(obj)) {
					Thread.sleep(200); // 放入动作需要0.5秒
				
					System.out.println("向缓冲区添加了一个数据对象：" + obj);
					
					myList.notifyAll();  //唤醒另一个取出数据的线程开始工作
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// 从缓冲区向外取数据的方法
	public void getData() {
		try {
			synchronized (myList) {
				// 判断缓冲区中的数据是否已经被取空了
				while (this.myList.size() == MIN) {
					// 控制台提示信息
					System.out.println("缓冲区中的数据已经被取空了……");
					// 进行等待
					myList.wait();
				}

				Thread.sleep(300); // 处理数据需要2秒
				// 从缓冲区中取得一个对象(调用集合的remove方法，从集合中取走一个对象)
				Object obj = myList.removeLast();
				// 判断
				if (obj != null) {
					// 控制台输出一个信息
					System.out.println("从缓冲区中取走一个对象：" + obj);
					// 唤醒等待队列中的其他线程
					myList.notifyAll();
				}

			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}