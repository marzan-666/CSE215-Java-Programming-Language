/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summer2k17;

/**
 *
 * @author user
 */
public class TestStack {
    public static void main(String[] args) {
        Stack s1=new Stack();
        s1.push(33);
        if(!s1.empty())
            System.out.println(s1.pop());
    }
    
}
