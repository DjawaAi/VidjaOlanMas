import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Тема ДЗ Массив");

        byte dZ = 0;
        System.out.println();
        System.out.println("Задача № " +(++dZ));
        System.out.println();
        int [] erm = new int[3];
        erm[0] = 1;
        erm[1] = 2;
        erm[2] = 3;
        ///////////////
        System.out.println();
        float [] flt = {1.57F, 7.654f, 9.986f};
        /////////////////
        System.out.println();
        int [] gre = new int[] {0, 1, 2, 3, 5};
        ////////////////
        System.out.println();
        System.out.println("Задача № " +(++dZ));
        System.out.println();
        for (int i = 0; i < 3; ++i) {
            System.out.print(erm[i]);
            if (i < erm.length - 1) {
                System.out.print(", ");
            }
        }
        /////////////////
        System.out.println();
        int i = flt.length;
        for (float v : flt) {
            System.out.print(v);
            i--;
            if (i > 0) {
                System.out.print(", ");
            }
        }
        //////////////
        System.out.println();
        int a = gre.length;
        for (int x : gre) {
            System.out.print(x);
            a--;
            if (a > 0) {
                System.out.print(", ");
            }
        }
        ////////////////
        System.out.println();
        System.out.println();
        System.out.println("Задача № " +(++dZ));
        System.out.println();
        for (int i1 = erm.length - 1; i1 >= 0; i1--) {
            System.out.print(erm[i1]);
            if (i1 > 0) {
                System.out.print(", ");
            }
        }
        //////////////////
        System.out.println();
        for (int i1 = flt.length - 1; i1 >= 0; i1--) {
            System.out.print(flt[i1]);
            if (i1 > 0) {
                System.out.print(", ");
            }
        }
        //////////////
        System.out.println();
        for (int i1 = gre.length - 1; i1 >= 0; i1--) {
            System.out.print(gre[i1]);
            if (i1 > 0) {
                System.out.print(", ");
            }
        }
        //////////
        System.out.println();
        System.out.println();
        System.out.println("Задача № " +(++dZ));
        System.out.println();
        for (int s = 0; s < erm.length; s++) {
            int b = erm [s];
            if (b % 2 != 0) { erm [s] ++;
            }
        };
        System.out.println(Arrays.toString(erm));
    }
}