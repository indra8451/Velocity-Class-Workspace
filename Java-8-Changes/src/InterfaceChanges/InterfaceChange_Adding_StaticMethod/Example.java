package InterfaceChanges.InterfaceChange_Adding_StaticMethod;

public interface Example {

	void x1();

	void x2();
	// public void x3(); //adding new method

	/*
	 * Now my question is that its impacting all implementation classes and I don’t
	 * want to make the impact on those classes. To overcome above issue, we should
	 * go with static method approach.
	 */

	public static void x4() {
		System.out.println("This is static method of interface Example");
	}

}
