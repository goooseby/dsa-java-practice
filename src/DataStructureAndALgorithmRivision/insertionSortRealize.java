package DataStructureAndALgorithmRivision;

public class insertionSortRealize {
    /**
     * 插入排序的实现
     * @param a 待排序的数组
     */
    public static void insertionSort(double[] a){
        // 原理：有序部分和乱序部分
        // 每次将一个乱序元素插入有序数组的指定位置
        if (a.length == 0 || a.length == 1) return;
        int j; // 用于移动元素的指针

        // p用于指向有序部分的右边界，初始表示
        for (int p = 1; p < a.length; p++){
            double pivot = a[p];
            for (j = p; j > 0 && a[j-1] > pivot; j--){
                a[j] = a[j-1];
            }
            a[j] = pivot;
        }

    }

    public static void main(String[] args) {
        double[] a = {5, 4, 3, 2, 1};
        insertionSort(a);
        for (double v : a) System.out.print(v + " ");
    }
}
