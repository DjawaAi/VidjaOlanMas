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
    }
}