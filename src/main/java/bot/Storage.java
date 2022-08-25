package bot;

import java.io.*;
import java.util.*;

public class Storage {

    protected String randomLine() throws IOException {
        BufferedReader abc = new BufferedReader(new FileReader("predictions.txt"));
        List<String> lines = new ArrayList<>();
        while (abc.readLine() != null) {
            String line = abc.readLine();
            lines.add(line);
        }
        abc.close();

        Random random = new Random();
        return lines.get(random.nextInt(lines.size()));
    }
}