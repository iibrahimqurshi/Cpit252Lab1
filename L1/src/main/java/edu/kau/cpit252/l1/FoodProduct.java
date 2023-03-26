/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.kau.cpit252.l1;

import java.time.LocalDate;

/**
 *
 * @author ibrah
 */
public class FoodProduct extends Product {
    private LocalDate expirationDate;

  public FoodProduct(int id, double price, String name,double weight,Order order, LocalDate expirationDate){
    super(id, price, name,weight,order);
    this.expirationDate = expirationDate;
  }

  @Override
  public String toString(){
    return super.toString() +"\t Expiration Date: " + this.expirationDate;
  }
}
