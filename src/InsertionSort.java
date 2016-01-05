import java.util.Scanner;

public class InsertionSort {
    /*
    5
2 4 6 8 3
Sample Output

2 4 6 8 8 
2 4 6 6 8 
2 4 4 6 8 
2 3 4 6 8 
    */


    public static void insertionSortPart2(int[] ar) {
        // Fill up the code for the required logic here
        // Manipulate the array as required
        // The code for Input/Output is already provided

        for (int i = 1; i < ar.length; i++) {
            int e = ar[i];
            int j = i - 1;
            while (j >= 0 && ar[j] > e) {
                ar[j + 1] = ar[j];
                j--;
            }
            ar[j + 1] = e;
            printArray(ar);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertionSortPart2(ar);

    }

    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }

    public static void insertIntoSorted(int[] ar) {
        // simple case: all but last element are sorted. Insert last into correct place
        int i = ar.length - 1;
        int e = ar[i];
        i--;
        while (i >= 0 && ar[i] > e) {
            ar[i + 1] = ar[i];   //keep
            for (Integer j : ar)
                System.out.print(j + " ");
            System.out.println();
            i--;
        }
        ar[i + 1] = e;
        for (Integer j : ar)
            System.out.print(j + " ");


    }


}