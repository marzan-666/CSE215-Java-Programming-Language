package URI;

import java.util.Scanner;

public class U1012 {
    public static void main(String[] args) {
        Scanner f = new Scanner (System.in);
        double A = f.nextDouble();
        double B = f.nextDouble();
        double C = f.nextDouble();
        double tri= (A*C)/2;
        double cir = 3.14159*C*C;
        double trap = (A+B)/2*C;
        double sqr = B*B;
        double rec = A*B;
        System.out.printf("TRIANGULO: "+"%.3f\n",tri);
        System.out.printf("CIRCULO: "+"%.3f\n",cir);
        System.out.printf("TRAPEZIO: "+"%.3f\n",trap);
        System.out.printf("QUADRADO: "+"%.3f\n",sqr);
        System.out.printf("RETANGULO: "+"%.3f\n",rec);
    }
    
}