import java.io.*;
import java.util.*;

public class CSVReader {
    public static List<Product> readProducts(String filePath) {
        List<Product> products = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length >= 5) {
                    products.add(new Product(values[0], Double.parseDouble(values[1]), Double.parseDouble(values[2]), values[3], values[4]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return products;
    }
}
