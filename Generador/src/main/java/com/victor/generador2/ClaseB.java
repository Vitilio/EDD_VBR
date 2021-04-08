/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.victor.generador2;

/**
 *
 * @author daw1
 */
public class ClaseB {

    private float n1;
    
    private float n2;

    public ClaseB(float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    /**
     * Get the value of n1
     *
     * @return the value of n1
     */
    public float getN1() {
        return n1;
    }

    /**
     * Set the value of n1
     *
     * @param n1 new value of n1
     */
    public void setN1(float n1) {
        this.n1 = n1;
    }

     /**
     * Get the value of n2
     *
     * @return the value of n2
     */
    public float getN2() {
        return n2;
    }

    /**
     * Set the value of n2
     *
     * @param n2 new value of n2
     */
    public void setN2(float n2) {
        this.n2 = n2;
    }
    
    public float Suma(){
        return n1+n2;
    }
    
    
    
    



}
