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
public class IllegalShapeException extends Exception{
    private String error;
    public IllegalShapeException(String error){
        this.error=error;
    }
    public String displayErrorMessage(){
        return error;
    }
}
