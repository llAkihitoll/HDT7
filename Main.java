public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        List<Product> products = CSVReader.readProducts("data/products.csv");
        for (Product product : products) {
            bst.insert(product);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el SKU a buscar: ");
        String sku = scanner.nextLine();
        Product found = bst.search(sku);
        System.out.println((found != null) ? "Producto encontrado: " + found : "Producto no encontrado");

        System.out.println("\nProductos ordenados por precio ascendente:");
        bst.inOrder();
    }
}
