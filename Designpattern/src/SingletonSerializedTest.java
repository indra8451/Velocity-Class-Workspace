import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SingletonSerializedTest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws ClassNotFoundException {

		try {
			Singleton instance1 = Singleton.getInstance();

			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\Desktop\\text.txt"));

			out.writeObject(instance1);
			out.close();

			ObjectInput in = new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\Desktop\\text.txt"));
			Singleton instance2 = (Singleton) in.readObject();
			in.close();
			System.out.println("instance 1>>" + instance1.hashCode());
			System.out.println("instance 2>>" + instance2.hashCode());

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
