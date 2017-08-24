package File;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Test01 {
	
	public static void main(String[] args) throws IOException {
		
		//访问磁盘文件
		File file = new File("c:/test/io.txt");
		File test = new File("c:/test");
		
		File io3 = new File("io3.txt");
		
		//创建文件
		File newFile = new File("c:/test/io2.txt");
		
		System.out.println("file 是否存在 : " + file.exists());
		System.out.println("file 是文件 ? " + file.isFile());
		System.out.println("test 是文件 ? " + test.isDirectory());
		
		System.out.println("file length : " + file.length() + " 字节 ");
		System.out.println("file 最后的修改时间是 : " + new Date( file.lastModified() ));
		
		System.out.println("file 是否可写入 : " + file.canWrite());
		file.setWritable(true);
		System.out.println("file 是否可写入 : " + file.canWrite());
		
		//创建文件
//		boolean flag = newFile.createNewFile();
		
		//lists
		File[] files = test.listFiles();
		for (File f : files) {
			System.out.println(f.getName());
		}
		
		
		System.out.println("io3 的绝对路径 : " + io3.getAbsolutePath() );
		
//		io3.delete();
		
		System.out.println(file.getFreeSpace() / 1024 / 1024 / 1024 );
		
		System.out.println(file.getUsableSpace() / 1024 / 1024 / 1024 );
		
	}

}
