package bot;

import java.io.*;
import java.util.*;

public class Storage {
    private final List<String> lines = new ArrayList<>();
    protected String randomLine() throws IOException {
        try (BufferedReader abc = new BufferedReader(new FileReader("predictions.csv"))) {
            while (abc.readLine() != null) {
                String line = abc.readLine();
                lines.add(line);
            }
        }
        return lines.get(new Random().nextInt(lines.size()));
    }
}
