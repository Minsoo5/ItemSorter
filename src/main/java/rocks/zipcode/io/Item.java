package rocks.zipcode.io;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class Item implements Comparator <Item> {

    Long id = 0L;
    String name = "";
    Double price = 0.01;
    public Item() {
    }

    public Item(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compare(Item o1, Item o2) {
        return 0;
    }


}
