package –Ú¡–ªØ;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws Exception {
		
		Stu stu = new Stu(2,"jack");
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("stu.data"));
		
		out.writeObject(stu); //∂≥
		
		Stu stu2 = new Stu();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("stu.data"));
		
		stu2 = (Stu)in.readObject(); //Ω‚∂≥
		System.out.println(stu2);

	}

}
