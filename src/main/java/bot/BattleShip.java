package bot;

import java.util.Arrays;
import java.util.Random;

public class BattleShip {


  public static void main(String[] args) {

    final int SIZE = 10;

    int[][] field = new int[SIZE][SIZE];
    int[][] ship = new int[SIZE][SIZE];

    fillPlayerField(ship);


  }
  private static void fillPlayerField(int[][] ship) {

    int[][] shipTypeAmount = {{1, 4}, {2, 3}, {3, 2}, {4, 1}};
    for ( i=0;i<shipTypeAmount.length; i++){
    }


  }
}


//        int[][] ship = {{1, 4}, {0, 1}, {4, 2}, {4, 3}, {4, 3}, {0, 1}, {0, 2}, {4, 3}};
//    System.out.println(Arrays.toString(field));
////        int[][] result = shipLogic(field, ship);
////        printResult(result);
//    int[][] result = shipLogic(field, ship);
//      }
//
//
////      //shotLogic
//      public static int[][] shipLogic(int[][] field, int[][] ship) {
////
////    // какой корабль
//        int shipSize = 4;
//        Integer[] shipOrientation = {1, 2, 1, 2}; //1 вертикально, 2 горизонтально
//        Random rnd = new Random();
//        Integer rndTicket = shipOrientation[rnd.nextInt(shipOrientation.length)];
//       if(rndTicket == 2){
////
////          // вычисление верхней клетки корабля если вертикально(4 клетки до низа)
////
//    }
//        System.out.println(rndTicket);
//        System.out.println(Arrays.toString(field));
//
//
//        for (int[] row : ship) {
//          int a = row[0];
//          int b = row[1];
//          if (field[a][b] == 0) {
//            field[a][b]++;
//          } else {
//            field[a][b] = field[a][b] * 2;
//          }
//        }
//        return field;
//      }
////
////
////  public static int[][] shotLogic(int[][] field, int[][] ship) {
////    for (int[] row : ship) {
////      int a = row[0];
////      int b = row[1];
////      if (field[a][b] == 0) {
////        field[a][b]++;
////      } else {
////        field[a][b] = field[a][b] * 2;
////      }
////    }
// //   return field;
// // }
//
//
//
//      public static void printResult(int[][] field) {
//        for (int[] row : field) {
//          for (int cell : row) {
//            System.out.print(cell + " ");
//          }
//          System.out.println();
//        }
//      }
//  }





