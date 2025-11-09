package DataStructureAndALgorithmRivision;

public class mergeSortRealize {
    /**
     * 归并排序的暴露接口
     * @param a 需要排序的目标数组
     */
    public static void mergeSort(double[] a){
        double[] tmpArray = new double[a.length];
        mergeSort(a, tmpArray, 0, a.length-1);
    }
    /**
     * 归并排序的内部实现（真正的逻辑）：
     * 通过递归，将数组拆分
     * 在归的过程中不断将数组按顺序并拢
     * @param a 需要排序的目标数组
     * @param left 子数组的左索引
     * @param right 子数组的右索引 （用来划分子数组）
     * @param tmpArray 临时数组：用于放排序后的结果
     */
    private static void mergeSort(double[] a, double[] tmpArray, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(a, tmpArray, left, middle);
            mergeSort(a, tmpArray, middle+1, right);
            merge(a, tmpArray, left, middle, right); // 传入两个排序完成的子数组，合并为大数组
        }
    }

    /**
     * merge 的实现：将两个有序数组归并为一个数组，求并集
     * 寻找较小元素放入。当一个数组所有元素放完，将另一个数组的所有元素直接并入最后
     * @param a 原数组
     * @param tmpArray 临时数组用于储存临时归并结果
     * @param left 子数组1的左边界
     * @param middle 子数组1的右边界
     * @param right 子数组2的右边界
     */
    private static void merge(double[] a, double[] tmpArray, int left, int middle, int right) {
        int i = left;
        int j = middle+1;
        int tmpPos = left;  // 指向下一次的填充位置，从left开始，最大到达right
        // 双指针分别指向两个子数组开头
        // 将较小的元素并入结果，并移动指针（直到末尾
        while (i <= middle && j <= right) {
            if (a[i] <= a[j]) {
                tmpArray[tmpPos++] = a[i++];   // 先使用变量的值，再移动指针
            }
            else {
                tmpArray[tmpPos++] = a[j++];  // 先移动，再累加
            }
        }
        // 将子数组可能剩下的元素全部并入末尾
        while (i <= middle) {
            tmpArray[tmpPos++] = a[i++];
        }
        while (j <= right) {
            tmpArray[tmpPos++] = a[j++];
        }
        // 将结果数组的结果全部拷回原数组
//        for (int pos = left; pos <= right; pos++) {
//            a[pos] = tmpArray[pos];
//        }   // 淘汰写法：效率低
        if (right + 1 - left >= 0) System.arraycopy(tmpArray, left, a, left, right + 1 - left);

    }

    public static void main(String[] args) {
        double[] a = {5, 4, 3, 2, 1};
        mergeSort(a);
        for (double v : a) System.out.print(v + " ");
    }

}
