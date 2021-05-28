import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) {
		FileInputStream stream = null;
		
		try {
			stream = new FileInputStream("Fileio");
			int data = stream.read();
			System.out.println(data);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
