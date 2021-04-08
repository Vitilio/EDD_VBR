/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoa;

import java.util.Scanner;
/**
 * We ask for the age of the user to check whether or not they areof legal age
 * @author Victor Blanco Rodrigo @Vitilio en GitHub
 * @version 1.0
 */
public class ClaseIf {
    
    private static int age;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("¿Cuantos años tienes?");
        Scanner reader = new Scanner(System.in);
        age= reader.nextInt();
        
        if (age>=18) {
             System.out.println("Eres mayor de edad");
        } else {
             System.out.println("Eres menor de edad");
        }
    }
    
}
