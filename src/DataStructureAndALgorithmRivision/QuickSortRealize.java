package DataStructureAndALgorithmRivision;

public class QuickSortRealize {
    public static int CUTOFF = 10;  // 截止范围

    /**
     * 快速排序驱动程序
     * 该算法的截止范围是10，即对于数组长度远大于10效果很好
     * 小于10时会替代为插入排序算法
     * @param a 需要排序的数组
     */
    public static void quickSort(double[] a) {
        quickSort(a, 0, a.length - 1);
    }

    /**
     * 快速排序的内部实现
     * @param a 目标数组
     * @param left 子数组左边界
     * @param right 子数组右边界
     */
    private static void quickSort(double[] a, int left, int right) {
        // 提示：shift + F6 快速修改变量名
        // 先进行交换，完成后分割，继续递归

        if (left + CUTOFF <= right) {
            // 核心操作：交换
            double pivot = median3(a, left, right);
            int i = left;
            int j = right-1;

            while (true){
                // 移动i和j，找到更大值
                // i找到比pivot更大的值停下，j 找到比 pivot 更小的值停下
                while (a[++i] < pivot && i < right){}
                while (a[--j] > pivot && j > left){}
                if (i < j) {
                    swapRef(a, i, j);
                }else break;

            }
            swapRef(a, i, right-1);
            quickSort(a, left, i-1);
            quickSort(a, i + 1, right);
        }
        else insertionSort(a, left, right); // 小于截止长度直接插排
    }

    /**
     * 执行三数中值分割：返回三个数的中位数
     * @param a 目标数组
     * @return 三数中值：枢纽元素
     */
    private static double median3(double[] a, int left, int right) {
        // 目标：将前中后三个值进行插入排序
        // 排序完成后，将中值放到right-1的位置，作为枢纽元
        int center = (left + right) / 2;
        if (a[center] < a[left])
            swapRef(a, center, left);
        if (a[right] < a[left])
            swapRef(a, right, left);
        if (a[right] < a[center])
            swapRef(a, center, right);
        swapRef(a, center, right-1);
        return a[right-1];
    }

    /**
     * 交换数组中的元素
     * @param a 目标数组
     * @param i 元素1
     * @param j 元素2
     */
    private static void swapRef(double[] a, int i, int j) {
        double tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    /**
     * 为小数组实现的插入排序
     * @param a 目标数组
     * @param left 子数组左边界
     * @param right 子数组右边界
     */
    private static void insertionSort(double[] a, int left, int right) {
        // 实现方法：不断把乱序部分的元素插入有序部分的指定位置
        if (right - left <= 1) return;
        // 使用嵌套循环。外循环：每次循环将一个元素放到合理位置。 内循环：将该元素不断向前移
        int j;
        for (int p = 1; p<a.length; p++){
            double tmp = a[p];
            for (j = p; j>0 && tmp > a[j-1]; j--){
                a[j] = a[j-1];
            }
            a[j] = tmp; // 注意；循环结束前，j会再次进行--
        }
    }

}
