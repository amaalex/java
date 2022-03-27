package bonus;

import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

/**
 * this class describes how an item should look like
 */
@NoArgsConstructor
public class Item {
    private String name;
    private String title;
    private String location;

    Set<String> keywords = new HashSet<>();

    public Item(String name, String title, String location) {
        this.name = name;
        this.title = title;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public void setKeyword(String keyword){
        this.keywords.add(keyword);
    }

    public Set<String> getKeywords() {
        return keywords;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
