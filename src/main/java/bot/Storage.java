package bot;

public class Storage {




    rndComment();


  private static void rndComment() {
    List<String> result = Files.readAllLines(Paths.get(".\\src\\predictions.txt"));

    System.out.println(result.get(ThreadLocalRandom.current().nextInt(0, result.size()-1)));
  }
}