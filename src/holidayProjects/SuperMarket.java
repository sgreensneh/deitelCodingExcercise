package holidayProjects;

import java.util.List;

public class SuperMarket {
    private List<Product> products;


    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double checkOut(List<Product> products) {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
            product.setQuantity(product.getQuantity() - 1);
        }
        return total;
    }

    public void generateReport() {
        double totalSales = 0;
        for (Product product : products) {
            totalSales += product.getPrice() * product.getQuantity();
        }
        System.out.println("Total sales: " + totalSales);
    }
    }


