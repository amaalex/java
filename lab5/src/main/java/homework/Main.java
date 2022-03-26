package homework;

import homework.commands.*;
import homework.items.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Catalog catalog = new Catalog("Catalog");

        new AddCommand().execute(catalog, new Item("knuth67", "The Art of Computer Programming", "d:/books/programming/tacp.ps"));
        new AddCommand().execute(catalog, new Item("java17", "he Java Language Specification", "https://docs.oracle.com/javase/specs/jls/se17/html/index.html"));

        new ListCommand().execute(catalog);

        new ViewCommand().execute(catalog.getItem(1));

        new SaveCommand().execute(catalog);

        Catalog catalog2 = new LoadCommand().execute();
        new ListCommand().execute(catalog2);

    }
}
