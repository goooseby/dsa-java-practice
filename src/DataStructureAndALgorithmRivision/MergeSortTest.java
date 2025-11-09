package DataStructureAndALgorithmRivision;

import java.util.Random;

public class MergeSortTest {
    public static void main(String[] args) {
        Random rand = new Random();
        rand.setSeed(47);
        double[] a = new double[15];
        for (int i = 0; i < a.length; i++) {
            int num = rand.nextInt(100);
            a[i] = (double) num;
        }
        printArray(a);

        System.out.println("\n----------归并排序------------");
        mergeSortRealize.mergeSort(a);
        printArray(a);



    }

    public static void printArray(double[] a) {
        for (double v : a) {
            System.out.print(v + " ");
        }
    }
}
