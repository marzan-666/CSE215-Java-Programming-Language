package LabFinal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mojammel
 */
public class Main {
    public static void main(String[] args) {
        Circle c=new Circle(5.0);
        Rectangle r=new Rectangle(4.5,2.5);
        System.out.println(c.getArea()+"  "+c.getPerimeter());
        System.out.println(r.getArea()+"  "+r.getPerimeter());
        System.out.println(c.compareShape(r));
    }
}
