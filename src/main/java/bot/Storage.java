package bot;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.SecureRandom;
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
          var random = new SecureRandom();
          int randomIndex = random.nextInt(lines.size());
          var randomElement = lines.get(randomIndex);
          System.out.println(randomElement);
           return;
      }

    }
    abc.close();
  }

}