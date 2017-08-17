package 异常.start;

public class Test2 {

	public static void main(String[] args) {

		System.out.println(aaa());
		
	}
	
	public static int aaa() {
		try {
			
			System.exit(0);
			return 0;
			
		} catch (Exception e) {
			System.out.println("有错了...");

		} finally {
			//finally 中的代码会在  return 之前 执行 . 
			System.out.println("释放掉此次连接");
		}
		return 1;
	}

}
