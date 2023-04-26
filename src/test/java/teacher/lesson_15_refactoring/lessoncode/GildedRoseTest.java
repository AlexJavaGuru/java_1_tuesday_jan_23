package teacher.lesson_15_refactoring.lessoncode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class GildedRoseTest {

    @Test
    void testCommonItem() {
        Item[] items = new Item[] { new Item("+5 Dexterity Vest", 5, 15) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("+5 Dexterity Vest", 4, 14));
        app.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("+5 Dexterity Vest", 3, 13));
        app.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("+5 Dexterity Vest", 2, 12));
        app.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("+5 Dexterity Vest", 1, 11));
        app.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("+5 Dexterity Vest", 0, 10));
        app.updateQuality();
        assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("+5 Dexterity Vest", -1, 8));
    }

    @Test
    void agedBrie() {
        Item[] items = new Item[] { new Item("Aged Brie", 2, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Aged Brie", 1, 1));
        app.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Aged Brie", 0, 2));
        app.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Aged Brie", -1, 4));
    }

    @Test
    void testsulfuras() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 2, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Sulfuras, Hand of Ragnaros", 2, 80));
        app.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Sulfuras, Hand of Ragnaros", 2, 80));
    }

    @Test
    void testElixirOfTheMongoose() {
        Item[] items = new Item[] { new Item("Elixir of the Mongoose", 4, 10) };
        GildedRose victim = new GildedRose(items);

        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Elixir of the Mongoose", 4, 10));
        victim.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Elixir of the Mongoose", 3, 9));
        victim.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Elixir of the Mongoose", 2, 8));
        victim.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Elixir of the Mongoose", 1, 7));
        victim.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Elixir of the Mongoose", 0, 6));
        victim.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Elixir of the Mongoose", -1, 4));
        victim.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Elixir of the Mongoose", -2, 2));
        victim.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Elixir of the Mongoose", -3, 0));
        victim.updateQuality();
    }

    @Test
    void testSulfuras() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 80) };
        GildedRose victim = new GildedRose(items);

        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        victim.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        victim.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        victim.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        victim.updateQuality();
    }

    @Test
    void testBackstagePassQualityNotGreaterThan50() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 48) };
        GildedRose victim = new GildedRose(items);

        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 48));
        victim.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 9, 50));
        victim.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 8, 50));
        victim.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 7, 50));
        victim.updateQuality();
    }

    @Test
    void testBackstagePassQualityStepIfLessThan5() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 30) };
        GildedRose victim = new GildedRose(items);

        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 30));
        victim.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 4, 33));
        victim.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 3, 36));
        victim.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 2, 39));
        victim.updateQuality();
    }

    @Test
    void testBackstagePassQualityToZero() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 3, 50) };
        GildedRose victim = new GildedRose(items);

        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 3, 50));
        victim.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 2, 50));
        victim.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 1, 50));
        victim.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50));
        victim.updateQuality();
        Assertions.assertThat(items[0]).usingRecursiveComparison().isEqualTo(new Item("Backstage passes to a TAFKAL80ETC concert", -1, 0));
        victim.updateQuality();
    }

}
