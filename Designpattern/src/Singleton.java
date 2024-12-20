import java.io.Serializable;

public class Singleton implements Cloneable,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// The single instance of the Singleton class
	private static Singleton instance;

	// Private constructor to prevent instantiation
	
	private Singleton() {

		/*
		 * if (instance == null) {
		 * 
		 * throw new IllegalStateException("instacsce already exist"); }
		 */
	}

	public static Singleton getInstance() {

		synchronized (Singleton.class) {

			if (instance == null) {

				instance = new Singleton();

			} else {

				return instance; // else return
			}

			return instance; // method return
		}

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;
	}
	
	protected Object readResolve() {
		return instance;
		}


	 public static void main(String[] args) throws CloneNotSupportedException {

	        System.out.println("Demonstrating Singleton Behavior");

	        // Fetching Singleton instance and checking hash codes
	        System.out.println("First instance hash code: " + Singleton.getInstance().hashCode());
	        System.out.println("Second instance hash code: " + Singleton.getInstance().hashCode());

	        System.out.println("\nAttempting to create a new object using cloning");

	        // Trying to clone the Singleton instance
	        Singleton obj1 = Singleton.getInstance();
	        Singleton obj2 = (Singleton) obj1.clone(); // Should return the same instance

	        System.out.println("Hash code of obj1: " + obj1.hashCode()); 
	        System.out.println("Hash code of obj2: " + obj2.hashCode()); 
	    }
}
