/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.kau.cpit252.l1;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ibrah
 */
public class ProductTest {

    public ProductTest() {
    }

    @org.junit.jupiter.api.Test
    public void shouldCountQuantity() {
        Order order = new Order(1001);

        Product[] products = new Product[3];
        products[0] = new FoodProduct(3452, 10.0, "Cheddar Cheese", 12, order,
                LocalDate.parse("2022-06-07"));
        products[1] = new ElectricalProduct(4875, 30.0, "Extension cord", 70, order, "220v");
        products[2] = new FoodProduct(5678, 15.0, "Bread", 5, order,
                LocalDate.parse("2022-03-24"));

        for (Product p : products) {
            p.applySaleDiscount(10); // Apply 10% sale discount to each product
            p.addToShoppingCart(); // Add each product to the shopping cart
            System.out.println(p.toString()); // Print information about each product
        }
        assertEquals(products.length, 3);

    }

}
