package Praktikum_1;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        bt.traversePreOrder(bt.root);
        System.out.println("");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        bt.traversePostOrder(bt.root);
        System.out.println("");
        System.out.println("Find "+bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println("");

        //tambahan untuk tugas 1-4
        System.out.println("---------------------");
        System.out.print("|  Minimal : ");
        bt.min();
        System.out.print("|  Maximal : ");
        bt.max();
        System.out.println("---------------------");
        System.out.print("| Leaf : ");
        bt.leaf(bt.root);
        System.out.println();
        System.out.println("---------------------");
        System.out.print("| Jumlah Leaf : " + bt.hitungDaun());
        System.out.println("\n---------------------");
    }
}
