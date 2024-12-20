package TryWithResources;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ResourcesHandlingBeforeJava7 {
	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Admin\\Desktop\\demo.txt");

		try {
			// Using the resources

			fos.write("First Line".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// Releasing the resources

			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}