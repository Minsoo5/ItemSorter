package rocks.zipcode.io.itemsorter;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcode.io.Item;
import rocks.zipcode.io.ItemSorter;
import rocks.zipcode.io.comparators.NameComparator;
import rocks.zipcode.io.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class SortByPriceTest {

    @Test
    public void testPriceComparator1() {
        // given
        Item item3 = new Item(5L, "Apple", 2.0);
        Item item2 = new Item(1L, "Banana", 1.0);
        Item item1 = new Item(2L, "Cherry", 3.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item2, item3, item1};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testPriceComparator2() {
        // given
        Item item3 = new Item(1L, "Cherry", 0.5);
        Item item2 = new Item(3L, "Banana", 1.5);
        Item item1 = new Item(2L, "Apple", 2.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item3, item2, item1};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
    @Test
    public void testPriceComparator3() {
        // given
        Item item3 = new Item(0L, "Apple", 2.0);
        Item item2 = new Item(1L, "Banana", 1.5);
        Item item1 = new Item(2L, "Cherry", 1.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item1, item2, item3};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new PriceComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

}
