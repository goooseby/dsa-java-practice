package DataStructureAndALgorithmRivision;

import java.util.Random;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        String greeting = "hello world";
        System.out.println(greeting);

        BinarySearchTree bst = new BinarySearchTree();
        Random rand = new Random();
        rand.setSeed(47);

        for (int i = 0; i < 50; i++) {
            int a = rand.nextInt(100);
            bst.insert(a);
        }

        bst.printTree();

        System.out.println();
        for (int i = 0; i < 50; i++) {
            int a = rand.nextInt(100);
            bst.remove(a);
        }
        bst.printTree();

    }
}
