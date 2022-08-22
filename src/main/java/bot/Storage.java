package bot;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

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

    protected void rndComment() throws IOException {
        List<String> result = Files.readAllLines(Paths.get(".\\src\\predictions.txt"));

        System.out.println(result.get(ThreadLocalRandom.current().nextInt(0, result.size()-1)));
    }
}




