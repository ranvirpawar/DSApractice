package arrayList;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        // creating a arralist
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(56);
        arr.add(3);
        arr.add(45);
        arr.remove(1);
        Integer j = 45;
        arr.remove(j);

        // printing elements of arraylist

        for (int i = 0; i < arr.size(); i++) {
            // System.out.println(arr.get(i));
        }
        // using for each loop

        for (int i : arr) {
            System.out.println(i);
        }

    }
}
