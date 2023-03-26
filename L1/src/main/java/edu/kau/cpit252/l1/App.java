package edu.kau.cpit252.l1;

import java.time.LocalDate;

public class App {

    // 1- Instance and class variable 
//    public static void main(String[]args){
//    Product p1 = new Product(6745, 5.50, "Penne Pasta");
//    Product p2 = new Product(8853, 6.50, "Spaghetti Pasta");
//    Product p3 = new Product(2106, 4.50, "Linguine Pasta");
//    System.out.println("Total Quantity: " + (p1.getTotalQuantity() + p2.getTotalQuantity() + p3.getTotalQuantity()));
////    System.out.println("Total Quantity: " + Product.getTotalQuantity());
//    
//  }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // 3.inhertiance
//    public static void main(String[] args) {
//        //this line can't be used now
//        //Product p = new Product(1234, 9.99, "water"); 
//
//        FoodProduct p4 = new FoodProduct(3452, 10.0, "Cheddar Cheese",
//                LocalDate.parse("2022-06-07"));
//        ElectricalProduct p5 = new ElectricalProduct(4875, 30.0, "Extension cord", "220v");
//        
//    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //4.Polymorphism and 6.abstraction and 7.Encapsulation
    public static void main(String[] args) {
        //Order Number
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
    }

}
