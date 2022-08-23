package bot;

import java.io.*;
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

    System.out.println(rndLine(lines));

    abc.close();
    }

  private String rndLine(List<String> lines) {
    Random rnd = new Random();
    return lines.get(rnd.nextInt(lines.size()));
  }

}

