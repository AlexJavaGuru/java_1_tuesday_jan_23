package teacher.lesson_15_refactoring.lessoncode;

import java.util.Map;
import java.util.function.Consumer;

class GildedRose {

    Item[] items;

    Map<String, Consumer<Item>> updaters = Map.of(
        "Backstage passes to a TAFKAL80ETC concert", GildedRose::backstageQualityUpdate,
        "Aged Brie", GildedRose::agedBrieQualityUpdate,
        "Conjured Mana Cake", GildedRose::conjuredItemQualityUpdate
    );

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (isSulfuras(item)) {
                continue;
            }

            updaters.getOrDefault(item.name, GildedRose::regularItemQualityUpdate).accept(item);

            item.sellIn--;

            if (item.sellIn < 0) {
                updaters.getOrDefault(item.name, GildedRose::regularItemQualityUpdate).accept(item);
            }
        }
    }

    private boolean isSulfuras(Item item) {
        return item.name.equals("Sulfuras, Hand of Ragnaros");
    }

    private static void conjuredItemQualityUpdate(Item item) {
        if (item.quality > 0) {
            item.quality-=2;
        }
    }

    private static void regularItemQualityUpdate(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }

    private static void agedBrieQualityUpdate(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }

    private static void backstageQualityUpdate(Item item) {
        if (item.quality < 50) {
            item.quality++;

            if (item.sellIn < 11 && item.quality < 50) {
                item.quality++;
            }

            if (item.sellIn < 6 && item.quality < 50) {
                item.quality++;
            }
        }
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
