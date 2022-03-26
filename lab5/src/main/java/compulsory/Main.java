package compulsory;

import java.io.IOException;
import lombok.extern.slf4j.Slf4j;

/**
 * This is the Main class for Compulsory
 * Create a catalog, create items for catalog, export catalog, import catalog.
 */
@Slf4j
public class Main {
    public static final String path = "C:/Users/alexa/Desktop/catalog.json";
    public static void main(String[] args) throws IOException {
        try {
            Catalog catalog = new Catalog("MyCatalog");
            var book = new Item("knuth67", "The Art of Computer Programming", "d:/books/programming/tacp.ps");
            Command.add(catalog, book);
            Command.add(catalog, new Item("java17", "The Java Language Specification", "https://docs.oracle.com/javase/specs/jls/se17/html/index.html"));
            Command.save(catalog, path);

            Catalog importedCatalog = Command.load(path);
            Command.toString(importedCatalog);
        } catch (IOException exception) {
            log.info("Something happened when saving or loading the Catalog.");
        } catch (Exception e) {
            log.info("Exception thrown during execution. ");
        }
    }
}
