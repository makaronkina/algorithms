package lesson6;

import java.util.Random;

public class Solution {

    public static void main(String[] args) {

        soManyTrees();
    }

    static void soManyTrees() {
        Random random = new Random();
        int countTrees = 200000;
        int balancedTrees = 0;

        for (int i = 0; i < countTrees; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            int val = 0;
            while (map.height() < 6) {
                val = random.nextInt(201) - 100;
                map.put(val, val);
            }
            map.delete(val);
            if (map.isBalance()) {
                balancedTrees++;
            }
        }
        System.out.printf("Balanced trees: %d, Count of trees: %d \n", balancedTrees, countTrees);
        System.out.println("Percentage of balanced trees: " + (double) balancedTrees / countTrees * 100 + "%");
        System.out.println("Percentage of unbalanced trees: " + (double) (countTrees - balancedTrees) / countTrees * 100 + "%");
    }
}
