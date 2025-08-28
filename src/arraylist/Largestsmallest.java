package arraylist;

import java.util.*;

public class Largestsmallest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));
        System.out.println("Original List: " + list);
        Collections.sort(list);

        System.out.println("Largest number :"+ list.get(list.size()-1));
        System.out.println("Smallest no.:" + list.get(0));
    }
}