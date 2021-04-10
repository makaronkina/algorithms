package lesson8;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;

public class Solution {
    static Random random;
    public static void main(String[] args) {
        Hashtable<String, Integer> hash = new Hashtable<>();
        Map<String, Integer> map = new HashMap<>();

        ChainingHashMap<Integer, String> chm = new ChainingHashMap<>();

        chm.put(1, "one");
        chm.put(2, "two");
        chm.put(3, "three");
        chm.put(4, "four");
        chm.put(5, "five");
        chm.put(6, "six");
        chm.put(7, "seven");
        chm.put(8, "eight");
        chm.put(9, "nine");
        chm.put(10, "ten");
        chm.put(11, "eleven");

        System.out.println(chm);
        System.out.println(chm.size());
        System.out.println(chm.remove(5));
        System.out.println(chm.get(7));

    }
}
