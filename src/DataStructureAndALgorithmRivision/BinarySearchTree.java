package DataStructureAndALgorithmRivision;

public class BinarySearchTree {

    // 崩溃了
    // 基本属性和构造方法
    private BinaryNode root;

    private BinarySearchTree() {
        root = null;
    }

    // 清空查找树
    public void makeEmpty() {
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    // contains 功能
    public boolean contains(double x){
        return contains(x, root);
    }
    /**
     * 重载：真正的contains 函数(需要private)
     * 为什么需要重载？为什么不直接从根节点开始找？ --->  我认为是为了向下传递查找，这样实现就能不断递归，往下移动
     * 实现方法：如果传入的节点为空，直接返回false。
     * 将当前元素与目标元素进行比较，如果不符则往下传递，如果相符则返回
     * @param x 需要查找的值;
     * @param t 查找的起始点;
     * @return 返回布尔值，表明查找的结果
     *
     */
    private boolean contains(double x, BinaryNode t){
        if(t == null){
            return false;
        }
        // 比较元素，传递 or 返回
        if (t.element > x){
            return contains(x, t.left);
        }
        else if (t.element < x){
            return contains(x, t.right);
        }
        else{
            return true;
        }
    }

    // 查找最大，最小元素

//    public double findMin(){
//        return findMin(root).element;
//    }
//
//    /**
//     *
//     * @param t 开始查找的位置
//     * @return 返回最大 的
//     */
//    public BinaryNode findMin(BinaryNode t){
//        return  findMin(t.left);
//    }


    /**
     * <p>
     * 二分查找树的内部静态类
     * 用于存储数据
     * </p>
     *
     */
    private static class BinaryNode{
        BinaryNode left;
        BinaryNode right;
        double element;

        public BinaryNode(double element){
            this.element = element;
        }

        public BinaryNode(double element,BinaryNode left,BinaryNode right){
            this.element = element;
            this.left = left;
            this.right = right;
        }

}






}
