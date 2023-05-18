package student_aleksandrs_lezhennikovs.lesson_15.level_5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class GildedRoseTest {

    @Test
    void testCommonItem() {
        List<Item> items = new ArrayList<>();
        GildedRose app = new GildedRose();
        items.add(new Item("+5 Dexterity Vest", 5, 15));
        app.updateQuality(items);
        assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("+5 Dexterity Vest", 4, 14));
        app.updateQuality(items);
        assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("+5 Dexterity Vest", 3, 13));
        app.updateQuality(items);
        assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("+5 Dexterity Vest", 2, 12));
        app.updateQuality(items);
        assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("+5 Dexterity Vest", 1, 11));
        app.updateQuality(items);
        assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("+5 Dexterity Vest", 0, 10));
        app.updateQuality(items);
        assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("+5 Dexterity Vest", -1, 8));
    }

    @Test
    void testAgedBrie() {
        List<Item> items = new ArrayList<>(List.of(new Item("Aged Brie", 2, 0)));
        GildedRose app = new GildedRose();
        app.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Aged Brie", 1, 1));
        app.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Aged Brie", 0, 2));
        app.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Aged Brie", -1, 4));
    }

    @Test
    void testElixirOfTheMongoose() {
        List<Item> items = new ArrayList<>(List.of(new Item("Elixir of the Mongoose", 4, 10)));
        GildedRose victim = new GildedRose();
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Elixir of the Mongoose", 4, 10));
        victim.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Elixir of the Mongoose", 3, 9));
        victim.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Elixir of the Mongoose", 2, 8));
        victim.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Elixir of the Mongoose", 1, 7));
        victim.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Elixir of the Mongoose", 0, 6));
        victim.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Elixir of the Mongoose", -1, 4));
        victim.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Elixir of the Mongoose", -2, 2));
        victim.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Elixir of the Mongoose", -3, 0));
        victim.updateQuality(items);
    }

    @Test
    void testSulfurasWithSelIn() {
        List<Item> items = new ArrayList<>(List.of( new Item("Sulfuras, Hand of Ragnaros", 2, 80)));
        GildedRose app = new GildedRose();
        app.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Sulfuras, Hand of Ragnaros", 2, 80));
        app.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Sulfuras, Hand of Ragnaros", 2, 80));
    }

    @Test
    void testSulfurasWithoutSelIn() {
        List<Item> items = new ArrayList<>(List.of(new Item("Sulfuras, Hand of Ragnaros", 0, 80)));
        GildedRose victim = new GildedRose();
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        victim.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        victim.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        victim.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        victim.updateQuality(items);
    }

    @Test
    void testBackstagePassQualityNotGreaterThan50() {
        List<Item> items = new ArrayList<>(List.of(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 48)));
        GildedRose victim = new GildedRose();
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 48));
        victim.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 9, 50));
        victim.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 8, 50));
        victim.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 7, 50));
        victim.updateQuality(items);
    }

    @Test
    void testBackstagePassQualityStepIfLessThan5() {
        List<Item> items = new ArrayList<>(List.of(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 30)));
        GildedRose victim = new GildedRose();
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 30));
        victim.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 4, 33));
        victim.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 3, 36));
        victim.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 2, 39));
        victim.updateQuality(items);
    }

    @Test
    void testBackstagePassQualityToZero() {
        List<Item> items = new ArrayList<>(List.of(new Item("Backstage passes to a TAFKAL80ETC concert", 3, 50)));
        GildedRose victim = new GildedRose();
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 3, 50));
        victim.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 2, 50));
        victim.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 1, 50));
        victim.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50));
        victim.updateQuality(items);
        Assertions.assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", -1, 0));
        victim.updateQuality(items);
    }
    @Test
    void testConjuredItem() {
        List<Item> items = new ArrayList<>();
        GildedRose app = new GildedRose();
        items.add(new Item("Conjured Mana Cake", 5, 15));
        app.updateQuality(items);
        assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Conjured Mana Cake", 4, 13));
        app.updateQuality(items);
        assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Conjured Mana Cake", 3, 11));
        app.updateQuality(items);
        assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Conjured Mana Cake", 2, 9));
        app.updateQuality(items);
        assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Conjured Mana Cake", 1, 7));
        app.updateQuality(items);
        assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Conjured Mana Cake", 0, 5));
        app.updateQuality(items);
        assertThat(items.get(0)).usingRecursiveComparison().isEqualTo(new Item("Conjured Mana Cake", -1, 1));
    }
}