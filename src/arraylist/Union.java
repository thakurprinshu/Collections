package arraylist;

import java.util.*;

public class Union {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 7));
        ArrayList<Integer> unionList = new ArrayList<>(list1);

        for (int num : list2) {
            if (!unionList.contains(num)) {
                unionList.add(num);
            }
        }
        System.out.println("Union: " + unionList);
    }
}

