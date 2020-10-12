

import java.util.Scanner ;

public class ComputeAreaWithInput {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number for radius :");
        double radius = input.nextDouble();
        
        double area = radius * radius * 3.14159 ;
        
        System.out.println("The area for the circle of radius "+ radius +" is " + area);
    }
    
}
