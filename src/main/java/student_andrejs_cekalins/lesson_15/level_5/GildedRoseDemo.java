package student_andrejs_cekalins.lesson_15.level_5;


import java.util.ArrayList;
import java.util.List;

public class GildedRoseDemo {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Item("+5 Dexterity Vest", 10, 20));
        items.add(new Item("Aged Brie", 2, 0));
        items.add(new Item("Elixir of the Mongoose", 5, 7));
        items.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
        items.add(new Item("Conjured Mana Cake", 3, 6));

        GildedRose gildedRose = new GildedRose(items.toArray(new Item[0]));
        int days = 12;
        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.printf("%-45s %-15s %-15s \n", "name", "sellIn", "quality");
            for (Item item : items) {
                System.out.printf("%-45s | %-15s | %-15s \n", item.getName(), item.getSellIn(), item.getQuality());
            }
            System.out.println();
            gildedRose.updateQuality(items);
        }
    }
}
