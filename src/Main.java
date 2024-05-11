import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //( //int[] weights = new int[12];
        // weights[0] = 90;
        //int januaruWegth = weights[0];
        //System.out.println(januaruWegth);
        // System.out.println(weights[0]);
        //System.out.println(weights[4]);
        ////// int january = 0;
//System.out.println(weights[january]);
        ///int [] bigBox = {5, 6, 12};
        //    System.out.println(bigBox[0]);
        //  System.out.println(bigBox[1]);
        //System.out.println(bigBox[2]);
        //int[] weights = new int[] {12, 45, 57, 54, 87, 555, 756, 78, 0, 0, 62, 0};
        //       int [] weights = {12, 45, 57, 54, 87, 555, 756, 78, 0, 0, 62, 0};
        //for (int i = 0; i < 12; i++
        //     for (int i = 0; i < weights.length; i++)
        //   {
        //     System.out.println(weights[i]);
        //}
        //System.out.println(bigBox[3]);
        //System.out.println(weights[13]);
        int [] arr = new int [10];
        System.out.println(Arrays.toString(arr));
        ///////////////////////////////
        //////////////////////////////////
        // )//
        System.out.println("Тема ДЗ Массив");

        byte dZ = 0;
        System.out.println();
        System.out.println("Задача № " +(++dZ));
        System.out.println();
        int [] erm = new int[3];
        erm[0] = 1;
        erm[1] = 2;
        erm[2] = 3;
        System.out.print(erm[0]+ ", ");
        System.out.print(erm[1]+ ", " );
        System.out.print(erm[2]);
        System.out.print(".  " +erm[2]+ ", ");
        System.out.print(erm[1]+ ", ");
        System.out.print(erm[0]);
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
            int b = erm [i];
            if (b % 2 != 0) { erm [i] ++;
            }
        };
        System.out.println(Arrays.toString(erm));
        ///////////////
        System.out.println();
        float [] flt = {1.57F, 7.654f, 9.986f};
        System.out.print(flt[0]+ ", ");
        System.out.print(flt[1]+ ", ");
        System.out.print(flt[2]+ ".  ");
        System.out.print(flt[2]+ ", ");
        System.out.print(flt[1]+ ", ");
        System.out.print(flt[0]);
        /////////////////
        System.out.println();
        int [] gre = new int[] {0, 1, 2, 3, 5};
        System.out.print(gre [0]+ ", ");
        System.out.print(gre [1]+ ", ");
        System.out.print(gre [2]+ ", ");
        System.out.print(gre [3]+ ", ");
        System.out.print(gre [4]+ ".  ");
        System.out.print(gre [4]+ ", ");
        System.out.print(gre [3]+ ", ");
        System.out.print(gre [2]+ ", ");
        System.out.print(gre [1]+ ", ");
        System.out.print(gre [0]+ ".");
        /////////////

        System.out.println();
        System.out.println("Задача № " +(++dZ));
        System.out.println();

    }
}