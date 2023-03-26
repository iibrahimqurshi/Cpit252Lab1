/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.kau.cpit252.l1;

/**
 *
 * @author ibrah
 */
public class ElectricalProduct extends Product {
    private String voltage;

  public ElectricalProduct(int id, double price, String name,double weight,Order order, String voltage){
    super(id, price, name,weight ,order);
    this.voltage = voltage;
  }

  @Override
  public String toString(){
    return super.toString() +"\t Voltage: " + this.voltage;
  }
}
