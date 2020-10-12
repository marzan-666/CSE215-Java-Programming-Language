package Lab13;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahadi Hasan Sagor
 */
public class IllegalTriangleException extends Exception{
    private String error;
    public IllegalTriangleException(String error){
        this.error=error;
    }
    public String massage(){
        return error;
    }
}
