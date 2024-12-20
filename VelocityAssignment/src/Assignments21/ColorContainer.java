package Assignments21;
/*2.Suppose I have one container that contain  different colors of ballons such as Red, Blue, Green,
 *  Red,Blue,Red, Blue, Green in this order, now sort that baloon in such manner
 *   so Red baloon will be added first then Blue baloon and last is Green balloons. 
 *   Use the proper collection.*/


import java.util.*;

public class ColorContainer {

	public static void main(String[] args) {
	LinkedList<String> linklist = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the count of Balloons Colors: ");
    int cnt = scanner.nextInt();
    System.out.println("Enter the " + cnt + " Color: ");
    scanner.nextLine();
    int j=0;
    for (int i = 0; i < cnt; i++) {
        String name = scanner.nextLine();
        if (name.equalsIgnoreCase("Red")) {
            linklist.addFirst(name);
        } else if (name.equalsIgnoreCase("Green")) {
            linklist.addLast(name);
        } else if (name.equalsIgnoreCase("Blue")) {
         
          if(linklist.isEmpty()||i==1){
        	  linklist.add(name);
          }
          else {
        	  while (linklist.get(j).equalsIgnoreCase("Red")) {
                  j++;
              }
              linklist.add(j, name);
          }
           
        }
    }

    System.out.println("Sorted Balloons: ");
    for (String balloon : linklist) {
        System.out.println(balloon);
    }
}
}