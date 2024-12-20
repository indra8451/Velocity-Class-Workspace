
public class SingletonDesignPatternTest {

	private static SingletonDesignPatternTest singletonDesignPatternTest;

	private static SingletonDesignPatternTest getData() {

		singletonDesignPatternTest = new SingletonDesignPatternTest();

		return singletonDesignPatternTest;

	}

	public static void main(String[] args) {

		System.out.println("First instance=" + SingletonDesignPatternTest.getData().hashCode());
		System.out.println("Second instance=" + SingletonDesignPatternTest.getData().hashCode());
		System.out.println("Third instance=" + SingletonDesignPatternTest.getData().hashCode());
		System.out.println("Fourth instance=" + SingletonDesignPatternTest.getData().hashCode());

	}

}
