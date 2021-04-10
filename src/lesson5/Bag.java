package lesson5;

public class Bag {
    private Item[] items;
    private final int mawWeight;

    public Bag(Item[] items, int mawWeight) {
        this.items = items;
        this.mawWeight = mawWeight;
    }

    public int getMaxWeight() {
        return mawWeight;
    }

    public int fillBag(int i, int weight) {
        if (i < 0) {
            return 0;
        }
        if (items[i].weight > weight) {
            return fillBag(i - 1, weight);
        } else {
            return Math.max(fillBag(i - 1, weight),
                    fillBag(i - 1, weight - items[i].weight) + items[i].cost);
        }
    }
}
