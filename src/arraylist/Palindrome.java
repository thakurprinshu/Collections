package arraylist;

import java.util.ArrayList;

public class Palindrome {
    public static boolean isPalindrome(ArrayList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return false; // mismatch found
            }
            left++;
            right--;
        }
        return true;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);

        System.out.println("ArrayList: " + list);

        if (isPalindrome(list)) {
            System.out.println("The ArrayList is a Palindrome.");
        } else {
            System.out.println("The ArrayList is NOT a Palindrome.");
        }
    }


}

