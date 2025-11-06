package DataStructureAndALgorithmRivision;

public class BinarySearchTree {


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

    public double findMin(){
        return findMin(root).element;
    }

    /**
     * 实现方法：不断前往左子树，直到末尾
     * @param t 开始查找的位置
     * @return 返回最大 的
     */
    private BinaryNode findMin(BinaryNode t){

        if (t == null){
            return null;
        }
        else if (t.left == null){
            return t;
        }
        return  findMin(t.left);
    }

    // 寻找最大同理
    public double findMax(){
        return findMax(root).element;
    }

    private BinaryNode findMax(BinaryNode t){
        if (t == null){
            return null;
        }
        else if (t.right == null){
            return t;
        }
        return  findMax(t.right);
    }

    // 之后是插入和删除：两个最重要的部分
    // 插入较为简单：只需要不断往下寻找到叶节点即可，如果已经存在，则直接跳过插入即可
    public void insert(double x){
        insert(x, root);
    }
    private BinaryNode insert(double x, BinaryNode t){
        if (t == null){
            return new BinaryNode(x);
        }
        else if (t.element > x){
            t.left = insert(x, t.left);
        }
        else if (t.element < x){
            t.right = insert(x, t.right);
        }

        return t;
    }


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
            this(element, null, null);

        }

        public BinaryNode(double element,BinaryNode left,BinaryNode right){
            this.element = element;
            this.left = left;
            this.right = right;
        }

}






}
