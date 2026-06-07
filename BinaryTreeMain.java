public class BinaryTreeMain {
    public static void main(String[] args) {

        BinaryTree13 bst = new BinaryTree13();
        bst.add(new Mahasiswa13("244160121", "Ali", "A", 3.57));
        bst.add(new Mahasiswa13("244160221", "Badar", "B", 3.85));
        bst.add(new Mahasiswa13("244160185", "Candra", "C", 3.21));
        bst.add(new Mahasiswa13("244160220", "Dewi", "B", 3.54));
        System.out.println("\nDaftar semua mahasiswa (InOrder Traversal)");
        bst.traverseInOrder(bst.getRoot());

        System.out.println("\nPencarian Data Mahasiswa");
        System.out.println("IPK 3.54 : "
                + (bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan"));
        System.out.println("IPK 3.22 : "
                + (bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan"));

        bst.add(new Mahasiswa13("244160131", "Devi", "A", 3.72));
        bst.add(new Mahasiswa13("244160205", "Ehsan", "D", 3.37));
        bst.add(new Mahasiswa13("244160170", "Fizi", "B", 3.46));

        System.out.println("\nDaftar semua mahasiswa setelah penambahan 3 mahasiswa:");
        System.out.println("InOrder Traversal:");
        bst.traverseInOrder(bst.getRoot());

        System.out.println("\nPreOrder Traversal:");
        bst.traversePreOrder(bst.getRoot());

        System.out.println("\nPostOrder Traversal:");
        bst.traversePostOrder(bst.getRoot());

        System.out.println("\nPenghapusan data mahasiswa");
        bst.delete(3.57);

        System.out.println("\nDaftar semua mahasiswa setelah penghapusan 1 mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.getRoot());
    }
}