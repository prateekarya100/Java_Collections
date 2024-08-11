package DSA_QUESTIONS;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>(Arrays.asList(1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5));
        Set<Integer> sortedSet= new HashSet<>();
//        for (int i = 0; i < arrayList.size(); i++) {
//            sortedSet.add(arrayList.get(i));
//        }
        for (Integer list:arrayList) {
            sortedSet.add(list);
        }
        System.out.println(sortedSet);
    }
}
