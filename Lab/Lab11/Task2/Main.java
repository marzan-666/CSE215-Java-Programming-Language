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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PercentageDiscount pd=new PercentageDiscount(50);
        ThresholdDiscount td=new ThresholdDiscount(1000,50);
        
        System.out.println(pd.discountedPrice(1000));
        System.out.println(td.discountedPrice(1200));
    }
    
}
