/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab12.Task2;

/**
 *
 * @author user
 */
public class BestForCustomer implements Discount{
    private double percentage;
    private double threshold;
    private double discount;
    
    public BestForCustomer(){
        
    }
    public BestForCustomer(double percentage,double threshold,double discount){
        this.percentage=percentage;
        this.threshold=threshold;
        this.discount=discount;
        
    }
    public double getPercentage(){
        return percentage;
    }
    public double getThreshold(){
        return threshold;
    }
    public double getDiscount(){
        return discount;
    }
    public void setPercentage(double percentage){
        this.percentage=percentage;
    }
    public void setThreshold(double threshold){
        this.threshold=threshold;
    }
    public void setDiscount(double discount){
        this.discount=discount;
    }
    
    public double discountedPrice(double price){
        double percentagePrice=price-(price*percentage/100.0);
        
        double thresholdPrice=(price>=threshold)?(price-discount):price;
        
        return (percentagePrice<thresholdPrice)?percentagePrice:thresholdPrice;
       
        
    }
    
    
}
