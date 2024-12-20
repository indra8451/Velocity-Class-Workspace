
public class StringEnhancementJava11Example {

	public static void main(String[] args) {

		String text = "  \u2001Hello World\u2001  ";

		System.out.println("Original: '" + text + "'");
		System.out.println("After trim(): '" + text.trim() + "'");
		System.out.println("After stripLeading(): '" + text.stripLeading() + "'");
		System.out.println("After stripTrailing(): '" + text.stripTrailing() + "'");
		System.out.println("After strip(): '" + text.strip() + "'");
	}

}
