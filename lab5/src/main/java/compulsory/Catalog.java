package compulsory;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * this class describes a Catalog
 */
@NoArgsConstructor
public class Catalog {
    private String name;
    private List<Item> items;

    Catalog(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Item> getItems() {
        return items;
    }

    /**
     * adds an item in the items list
     *
     * @param item an item
     */
    void add(Item item) {
        this.items.add(item);
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "name='" + name + '\'' +
                ", items=" + items +
                '}';
    }
}
