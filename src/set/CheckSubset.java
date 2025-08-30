package set;

import java.util.*;

public class CheckSubset{
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> setB = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        boolean isSubset = setB.containsAll(setA);

        System.out.println("Is SetA a subset of SetB? " + isSubset);
    }
}
