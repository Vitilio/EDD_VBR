/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.victor.generador;

import java.util.Scanner;

/**
 *
 * @author daw1
 */
public class ClaseA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClaseB operacion = new ClaseB();
        System.out.println("Introduce los numeros a sumar");
        Scanner scanner = new Scanner(System.in);
        operacion.setN1(scanner.nextFloat());
        operacion.setN2(scanner.nextFloat());
       
    }
   
}
