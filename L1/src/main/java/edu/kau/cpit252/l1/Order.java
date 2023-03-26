package edu.kau.cpit252.l1;

public class Order {
    
  private int orderId;
  private String orderStatus;
  
  public Order(int orderId){
    this.orderId = orderId;
    this.orderStatus = "created";
  }
  
  public int getOrderId(){
    return this.orderId;
  }
  
  public String getOrderStatus(){
    return this.orderStatus;
  }
  
  public void setOrderStatus(String status){
    this.orderStatus = status;
  }
  
}

