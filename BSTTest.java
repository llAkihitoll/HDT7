import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BSTTest {
    @Test
    void testInsertAndSearch() {
        BinarySearchTree bst = new BinarySearchTree();
        Product product = new Product("12345", 100.0, 80.0, "Laptop", "Electronics");
        bst.insert(product);

        Product found = bst.search("12345");
        assertNotNull(found);
        assertEquals("12345", found.sku);
        assertEquals(80.0, found.priceCurrent);
    }

    @Test
    void testSearchNotFound() {
        BinarySearchTree bst = new BinarySearchTree();
        Product found = bst.search("99999");
        assertNull(found);
    }
}