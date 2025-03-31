public class BinarySearchTree {
    Node root;

    public void insert(Product product) {
        root = insertRec(root, product);
    }

    private Node insertRec(Node root, Product product) {
        if (root == null) {
            return new Node(product);
        }
        if (product.sku.compareTo(root.product.sku) < 0) {
            root.left = insertRec(root.left, product);
        } else if (product.sku.compareTo(root.product.sku) > 0) {
            root.right = insertRec(root.right, product);
        }
        return root;
    }

    public Product search(String sku) {
        return searchRec(root, sku);
    }

    private Product searchRec(Node root, String sku) {
        if (root == null || root.product.sku.equals(sku)) {
            return (root != null) ? root.product : null;
        }
        return (sku.compareTo(root.product.sku) < 0) ? searchRec(root.left, sku) : searchRec(root.right, sku);
    }

    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println(root.product);
            inOrderRec(root.right);
        }
    }
}