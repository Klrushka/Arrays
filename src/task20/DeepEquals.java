package task20;

import java.util.Arrays;
import java.util.SortedMap;

public class DeepEquals {
   private static int[][] ints1 = new int[2][2];
   private static int[][] ints2 = new int[2][2];

   private static int[][] ints3 = new int[2][2];
   private static int[][] ints4 = new int[2][2];




   public static void  start(){
       for (int i = 0; i < 2; i++){
           for (int j = 0; j < 2; j++) {
               ints1[i][j] = i;
               ints2[i][j] = i;
               ints3[i][j] = 1;
               ints4[i][j] = 2;
           }
       }

       System.out.println(Arrays.deepEquals(ints1,ints2));

       System.out.println(Arrays.deepEquals(ints3,ints4));
   }

}
