package rocks.zipcode.io;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter implements Comparator <Item> {

    private Item[] items;
    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        //Get the value of each item's ID
        for (int i = 0; i < this.items.length; i++) {
            for (int j = 0; j < this.items.length; j++) {
                
            }
        }
        //compare and sort them in ascending order




        return null;
    }

    @Override
    public int compare(Item o1, Item o2) {
        return 0;
    }
}
