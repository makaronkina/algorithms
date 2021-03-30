package lesson5;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        System.out.println(exponentiation(6,-1));

        demoFillBag();
    }

    static double exponentiation(double val, int exp) {
        if (val == 0 && exp <= 0) {
            throw new ArithmeticException();
        }
        if (exp == 0) {
            return 1;
        } else if (exp < 0) {
            return 1 / val * exponentiation(val, ++exp);
        } else return val * exponentiation(val, --exp);
    }

    static void demoFillBag() {
        Item[] items = {new Item(800, 7),
                new Item(500, 6),
                new Item(300, 3),
                new Item(500, 4),
                new Item(2000, 15),
                new Item(450, 2),
                new Item(400, 1),
                new Item(200, 3)};

        Bag bag = new Bag(items, 13);

        System.out.println(bag.fillBag(items.length - 1, bag.getMaxWeight()));
    }

}
