import java.util.Arrays;

public class Arrays_file {
    public static void main(String[] args) {
        // if (args.length == 0 || args[0].equals("-h"))
        // System.out.print("Hello,");
        // else if (args[0].equals("-g"))
        // System.out.print("Goodbye,");
        // // print the other command-line arguments
        // for (int i = 1; i < args.length; i++)
        // System.out.print(" " + args[i]);
        // System.out.println("!");
        // SortArray();
        DoubleArray();
    }

    public static void SimpleArray() {
        int[] a;
        a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i + 1;
        }
        for (int item : a) {
            System.out.print(item + " ");
        }
    }

    public static void SortArray() {

        int[] a = { 5, 3, 4, 2, 1 };
        Arrays.sort(a);
        for (int item : a) {
            System.out.print(item + " ");
        }
    }

    public static void DoubleArray() {
        int[][] magicSqure = {
                { 16, 3, 2, 13 }, { 5, 10, 11, 8 }, { 9, 6, 7, 12 }, { 4, 15, 14, 1 }
        };
        for (int i = 0; i < magicSqure[0].length; i++) {
            for (int j = 0; j < magicSqure[1].length; j++) {
                System.out.print(magicSqure[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Other way to print quick");
        System.out.println(Arrays.deepToString(magicSqure));
    }
}
