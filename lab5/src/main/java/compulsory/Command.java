package compulsory;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * this class has a list of commands which are applicable for an existing Catalog
 */
public class Command {
    /**
     * adds an item in an existing catalog
     *
     * @param catalog object of type Catalog
     * @param item    object of type Item
     */
    public static void add(Catalog catalog, Item item) {
        catalog.add(item);
    }

    /**
     * exports the existing catalog to disk (as a json file)
     *
     * @param catalog an object of type Catalog
     * @param path    the path where the json file will be created
     * @throws IOException exception if something goes wrong
     */
    public static void save(Catalog catalog, String path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(path), catalog);
    }

    /**
     * imports an eexisting catalog from disk
     *
     * @param path the path where the json file is located
     * @throws IOException exception if something goes wrong
     */
    public static Catalog load(String path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(path), Catalog.class);
    }

    /**
     * displays the catalog (catalog+items)
     *
     * @param catalog an object of type Catalog
     */
    public static void toString(Catalog catalog) {
        System.out.println(catalog);
    }
}
