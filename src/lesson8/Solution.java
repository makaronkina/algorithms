package lesson8;

import java.util.Random;

public class Solution {
    static Random random;
    public static void main(String[] args) {
        random = new Random();
        ChainingHashMap<Integer, String> chm = new ChainingHashMap<>(5);

        chm.put(1, "one");
        chm.put(2, "two");
        chm.put(3, "three");
        chm.put(4, "four");
        chm.put(5, "five");
        chm.put(6, "six");
        chm.put(7, "seven");

//        for (int i = 0; i < 12; i++) {
//            chm.put(random.nextInt(100), "");
//        }

        System.out.println(chm);
        System.out.println(chm.remove(2));
        System.out.println(chm.get(3));
        System.out.println(chm);
    }
}
