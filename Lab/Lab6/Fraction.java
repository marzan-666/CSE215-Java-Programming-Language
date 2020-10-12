
package lab.pkg6;
public class Fraction {
    private int numerator;
    private int denominator;
    Fraction(){
        
    }
    Fraction(int numerator , int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public void setNumerator(){
        this.numerator=numerator;
    }
    public void setDenominator(){
        this.denominator=denominator;
    }
    public String toString(){
        String s = numerator+"/"+denominator;
        return s;
    }
    public void add(Fraction fraction){
        numerator=(numerator*fraction.denominator)+(denominator*fraction.numerator);
        denominator=denominator*fraction.denominator;
        
    }
    public void sub(Fraction fraction){
        numerator=(numerator*fraction.denominator)-(denominator*fraction.numerator);
        denominator=(denominator*fraction.denominator);
        
    }
    public void multiplication(Fraction fraction){
        
        numerator=numerator*fraction.numerator;
        denominator=denominator*fraction.denominator;
    }
    public void division(Fraction fraction){
        numerator=numerator*fraction.denominator;
        denominator=denominator*fraction.numerator;
        
    }
    
}
