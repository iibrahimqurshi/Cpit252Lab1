package edu.kau.cpit252.l1;

public abstract class Product {

    private int id;
    private double price;
    private String name;
    private int quantity;
    private Order order;
    private double weight;
//  private static int quantity;

    public Product(int id, double price, String name, double weight, Order order) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.order = order;
        this.weight = weight;
        this.quantity++;
    }

    /////////////////////////////////////////////////////////////////////////
    //Weight getter and setter
    public double getWeight() {
        return weight;
    }

    // here put your desired weigth range
    public void setWeight(double weight) {
        if (weight > 0 && weight <= 1000) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Weight must be between 0 and 1000 kg");
        }
    }

    ////////////////////////////////////////////////////////////////////////
    public void applySaleDiscount(double percentage) {
        this.price = this.price - ((percentage / 100) * this.price);
    }

    public final void addToShoppingCart() {
        System.out.println(this.name + " has been added to the shopping cart.");
    }

    public int getTotalQuantity() {
        return this.quantity;
    }

//  public static int getTotalQuantity(){
//    return quantity;
//  }
    
    
    public void getSellableStatus() {
        System.out.println("This product is sellable");
    }

    public String toString() {
        return "Product info:\n+Id: " + this.id +
                "\t" + "name: " + this.name
                + "\tPrice: SR" + this.price 
                + "\tWeight: " + this.weight 
                + " kg" +"\tOrder ID: " + this.order.getOrderId() 
                + "\tOrder Status: " + this.order.getOrderStatus();
    }

}
