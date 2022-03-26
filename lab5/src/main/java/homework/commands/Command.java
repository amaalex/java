package homework.commands;

import java.io.IOException;

public interface Command {
    void execute(Object... objects) throws IOException;
}
