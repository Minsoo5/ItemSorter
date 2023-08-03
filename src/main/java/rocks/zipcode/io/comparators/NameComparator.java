package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {
    @Override
    public int compare(Item item1, Item item2) {
        int ans = 0;

        for (int i = 0; i < item1.getName().length(); i++) {
                if ((item1.getName().charAt(i) == item2.getName().charAt(i))) {
                    ans = 0;
            } else if ((item1.getName().charAt(i) != item2.getName().charAt(i))) {
                    ans = (item1.getName().charAt(i) - item2.getName().charAt(i));
                    break;
                }
        }
        return ans;
    }
}
