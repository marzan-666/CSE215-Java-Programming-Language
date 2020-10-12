/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab11.Task2;

/**
 *
 * @author user
 */
public class ThresholdDiscount implements Discount{
    private double threshold;
    private double discount;
    public ThresholdDiscount(){
        
    }
    
    public ThresholdDiscount(double threshold,double discount){
        this.threshold=threshold;
        this.discount=discount;
    }
    public double getThreshold(){
        return threshold;
    }
    public double getDiscount(){
        return discount;
    }
    public void setThreshold(double threshold){
        this.threshold=threshold;
    }
    public void setDiscount(double discount){
        this.discount=discount;
    }
    @Override
    public double discountedPrice(double price){
        if(price>=threshold){
            return price-discount;
        }
        else return price;
    }
}
