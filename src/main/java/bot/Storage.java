package bot;

import java.io.*;
import java.util.*;

public class Storage {
    List<String> lines = new ArrayList<>();

    public void printText() throws IOException {

        BufferedReader abc = new BufferedReader(new FileReader("predictions.txt"));
        lines = new ArrayList<>();

        String line = abc.readLine();
            lines.add(line);

        abc.close();
    }

    protected String rndLine() {
        Random rnd = new Random();


        return lines.get(rnd.nextInt(lines.size()));
    }
}