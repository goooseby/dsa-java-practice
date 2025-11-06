package DataStructureAndALgorithmRivision;

public class BinarySearchTree {


    // 基本属性和构造方法
    private BinaryNode root;

    public BinarySearchTree() {
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
        root = insert(x, root);
    }

    /**
     * 真正的insert实现例程：
     * 使用了递归的写法：每次插入，都是将新的子树接到该节点上
     * @param x 需要插入的值
     * @param t 插入的子树位置
     * @return 返回新的子树给上面的节点
     */
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

    public void remove(double x){
        remove(x, root);
    }

    /**
     * remove 的真正实现
     * 实现方法：递归
     * @param x 需要删除的元素
     * @param t 目标元素所在的子树
     * @return 返回新子树，供处理后连接
     */
    private BinaryNode remove(double x, BinaryNode t){
        // 到最后没有找到，返回空值
        if (t == null){
            return null;  // 为空，直接返回
        }

        // 不匹配：继续往后寻找
        if (t.element > x){
            t.left = remove(x, t.left); // 目标元素更小，往左找
        }
        else if (t.element < x){
            t.right = remove(x, t.right);  // 更大往右
        }
        // 接下来是匹配的情况
        // 如果该节点有两个子树
        else if (t.left != null && t.right != null){
            t.element = findMin(t.right).element;  // 换位：将右子树的最小值换位
            t.right = remove(t.element, t.right);  // 删除被换的元素

        }
        // 只有一个子树
        else
            t = (t.left != null) ? t.left : t.right;
        return t;
    }

    /**
     * 按照升序，打印书的内容
     */
    public void printTree(){
        if (isEmpty()){
            System.out.println("Tree is empty");
        }
        else
            printTree(root);
    }

    /**
     * 实现printTree的内部方法
     * 按顺序打印子树
     * 实现方法：通过中序遍历
     * @param t 一个子树的根节点
     */
    private void printTree(BinaryNode t){
        if (t != null){
            printTree(t.left);
            System.out.print(t.element + " ");
            printTree(t.right);
        }
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
