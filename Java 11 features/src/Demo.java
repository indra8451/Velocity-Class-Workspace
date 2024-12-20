public class Demo {
    // Inner class
    class Inner { }

    public static void main(String[] args) {
        // Get the Class object for Demo and Inner
        Class<?> demoClass = Demo.class;
        Class<?> innerClass = Demo.Inner.class;

        // Example 1: Using getNestHost()
        System.out.println("Nest host of Inner: " + innerClass.getNestHost().getName()); // Output: Demo
        System.out.println("Nest host of Demo: " + demoClass.getNestHost().getName());   // Output: Demo

        // Example 2: Using getNestMembers()
        System.out.println("Nest members of Demo:");
        for (Class<?> member : demoClass.getNestMembers()) {
            System.out.println("  " + member.getName());
        }
        // Output includes: Demo, Demo$Inner

        // Example 3: Using isNestmateOf()
        System.out.println("Is Inner a nestmate of Demo? " + innerClass.isNestmateOf(demoClass)); // Output: true
    }
}
