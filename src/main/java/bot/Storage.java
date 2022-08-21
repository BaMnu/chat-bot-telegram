package bot;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Storage {

    public void printText() throws IOException {

        BufferedReader abc = new BufferedReader(new FileReader("predictions.txt"));
        List<String> lines = new ArrayList<>();

        String line = abc.readLine();

        while (line != null) {
            line = abc.readLine();
            lines.add(line);
        }
        for (
                String oneLine : lines) {
            if (oneLine != null) {
                System.out.println(oneLine);
            }
        }
        abc.close();
    }

}
