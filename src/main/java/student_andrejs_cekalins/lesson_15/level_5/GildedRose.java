package student_andrejs_cekalins.lesson_15.level_5;


import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class GildedRose {
    Item[] items;
    Map<String, Consumer<Item>> updaters = Map.of(
            "Backstage passes to a TAFKAL80ETC concert", GildedRose::backstageQualityUpdate,
            "Aged Brie", GildedRose::agedBrieQualityUpdate,
            "Conjured Mana Cake", GildedRose::conjuredItemQualityUpdate
    );

    public GildedRose(Item[] items) {
        this.items = items;
    }
    public void updateQuality(List<Item> items) {
        for (Item item : items) {
            if (isSulfuras(item)) {
                continue;
            }
            updaters.getOrDefault(item.getName(), GildedRose::regularItemQualityUpdate).accept(item);

            item.setSellIn(item.getSellIn() - 1);

            if (item.getSellIn() < 0) {
                updaters.getOrDefault(item.getName(), GildedRose::regularItemQualityUpdate).accept(item);
            }
        }
    }

    private static void conjuredItemQualityUpdate(Item item) {
        if (item.getQuality() > 0)
            item.setQuality(item.getQuality() - 2);
    }

    private boolean isSulfuras(Item item) {
        return "Sulfuras, Hand of Ragnaros".equals(item.getName());
    }

    private static void regularItemQualityUpdate(Item item) {
        if (item.getQuality() > 0)
            item.setQuality(item.getQuality() - 1);
    }


    private static void agedBrieQualityUpdate(Item item) {
        if (item.getQuality() < 50)
            item.setQuality(item.getQuality() + 1);
    }

    private static void backstageQualityUpdate(Item item) {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
            backstageQualityUpdateTillEleventhDayAndSixthDay(item);
        }
        if (item.getSellIn() < 0) {
            item.setQuality(0);
        }
    }

    private static void backstageQualityUpdateTillEleventhDayAndSixthDay(Item item) {
        for (int i : new int[]{11, 6}) {
            if (item.getSellIn() < i && item.getQuality() < 50) {
                item.setQuality((item.getQuality() + 1));
            }
        }
    }
}
