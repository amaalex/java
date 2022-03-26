package homework.commands;

import com.fasterxml.jackson.databind.ObjectMapper;
import homework.items.*;

import java.io.File;
import java.io.IOException;

public class SaveCommand extends CommonCommandBehaviour {
    @Override
    void run() throws IOException {
        Catalog catalog = (Catalog) super.obj.get(0);
        String path = CommonCommandBehaviour.path;
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File(path), catalog);
    }
}
