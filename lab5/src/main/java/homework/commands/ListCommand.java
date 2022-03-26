package homework.commands;

import homework.items.Catalog;

public class ListCommand extends CommonCommandBehaviour {
    @Override
    void run() {
        Catalog catalog = (Catalog) super.obj.get(0);
        System.out.println(catalog.getItems());
    }
}
