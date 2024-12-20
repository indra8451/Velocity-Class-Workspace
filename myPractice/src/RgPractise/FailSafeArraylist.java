package RgPractise;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeArraylist {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            list.add(4); // Modifying the list during iteration
        }

        System.out.println("Final List: " + list);
    }
}
