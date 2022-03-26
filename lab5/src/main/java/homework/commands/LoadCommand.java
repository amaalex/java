package homework.commands;

import com.fasterxml.jackson.databind.ObjectMapper;
import homework.items.*;

import java.io.File;
import java.io.IOException;

public class LoadCommand {
    public Catalog execute() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(new File(CommonCommandBehaviour.path), Catalog.class);
    }
}
