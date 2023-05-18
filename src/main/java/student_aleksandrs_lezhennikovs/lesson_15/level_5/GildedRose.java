package student_aleksandrs_lezhennikovs.lesson_15.level_5;

import java.util.List;

public class GildedRose {
    private static final String AGED_BRIE = "Aged Brie";
    private static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final String CONJURED = "Conjured Mana Cake";

    public void updateQuality(List<Item> items) {
        for (Item item : items) {
            switch(item.getName()) {
                case AGED_BRIE -> updateAgedBrie(item);
                case BACKSTAGE_PASSES -> updateBackstagePasses(item);
                case SULFURAS -> {}
                case CONJURED -> updateConjured(item);
                default -> updateRegularItem(item);
            }
        }
    }

    private void updateConjured(Item item) {
        decreaseSellIn(item);
        decreaseQuality(item, 2);
        if (item.getSellIn() < 0) {
            decreaseQuality(item, 2);
        }
    }

    private void updateAgedBrie(Item item) {
        decreaseSellIn(item);
        increaseQuality(item);
        if (item.getSellIn() < 0) {
            increaseQuality(item);
        }
    }

    private void updateBackstagePasses(Item item) {
        decreaseSellIn(item);
        if (item.getSellIn() < 0) {
            item.setQuality(0);
        } else if (item.getSellIn() < 5) {
            increaseQuality(item, 3);
        } else if (item.getSellIn() < 10) {
            increaseQuality(item, 2);
        } else {
            increaseQuality(item);
        }
    }

    private void updateRegularItem(Item item) {
        decreaseSellIn(item);
        decreaseQuality(item);
        if (item.getSellIn() < 0) {
            decreaseQuality(item);
        }
    }

    private void decreaseSellIn(Item item) {
        item.setSellIn(item.getSellIn() - 1);
    }

    private void increaseQuality(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }

    private void increaseQuality(Item item, int amount) {
        if (item.getQuality() < 50 - amount) {
            item.setQuality(item.getQuality() + amount);
        } else {
            item.setQuality(50);
        }
    }
    private void decreaseQuality(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
    }
    private void decreaseQuality(Item item, int amount) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - amount);
        }
    }
}
