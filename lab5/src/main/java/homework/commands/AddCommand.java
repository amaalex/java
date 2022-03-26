package homework.commands;

import homework.items.Catalog;
import homework.items.Item;

public class AddCommand extends CommonCommandBehaviour {
    @Override
    public void run() {
        Catalog catalog = (Catalog) super.obj.get(0);
        Item item = (Item) super.obj.get(1);
        catalog.add(item);
    }
}
