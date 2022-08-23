package bot;

import java.util.Random;

public class BattleShip {


  public static void main(String[] args) {

    final int SIZE = 10;

    int[][] field = new int[SIZE][SIZE];
    int[][] ship = new int[SIZE][SIZE];

    playerField(ship);
  }

  public static void playerField(int[][] ship) {

    int[][] shipTall = {{1, 4}, {2, 3}, {3, 2}, {4, 1}};

    Random rnd = new Random();

    int j;

    for (j = 0; j < shipTall.length; j++) {
      int i = shipTall[j][1]; //величина корабля в клетках
      int e = shipTall[j][0];  //количество кораблей
      System.out.println(j + "   длинна i= " + i + "   количество e=" + e);

      Integer[] shipOrientation = {1, 2}; //1 вертикально, 2 горизонтально
      int rndSize = shipOrientation[rnd.nextInt(shipOrientation.length)];
      int x = rnd.nextInt(10);
      ; //горизонталь
      int y = rnd.nextInt(10);
      ; //вертикаль

      if (rndSize == 1 & i != 1) {
        x = shipTall.length - i;
      } else if (rndSize == 2 & i != 1) {
        y = shipTall.length - i;
      }


      for (e = 0; e <= j; e++) {

        if (rndSize == 1) {
          // заполняем '1' столько клеток по горизонтали, сколько палуб у корабля
          for (int q = 0; q < i; q++) {
            ship[y][x + q] = 1;

          }
        }

        if (rndSize == 2) {
          // заполняем столько клеток по вертикали, сколько палуб у корабля
          for (int m = 0; m < i; m++) {
            ship[y + m][x] = 1;

          }
        }
      }


    }
    printResult(ship);
  }

  public static void printResult(int[][] field) {
    for (int[] row : field) {
      for (int cell : row) {
        System.out.print(cell + " ");
      }
      System.out.println();
    }
  }
}







