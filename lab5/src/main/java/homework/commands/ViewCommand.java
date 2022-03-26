package homework.commands;

import homework.items.Item;

import java.awt.*;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URI;

public class ViewCommand extends CommonCommandBehaviour {
    @Override
    void run() throws IOException {
        Item item = (Item) super.obj.get(0);
        String path = item.getLocation();
        File file = new File(path);
        Desktop desktop = Desktop.getDesktop();
        if (path.contains("http")) {
            URI uri = URI.create(path);
            desktop.browse(uri);
        } else {
            desktop.open(file);
        }
    }
}
