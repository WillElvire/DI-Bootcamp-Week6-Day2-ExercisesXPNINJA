/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicexpninja.exercice2;

/**
 *
 * @author Wilfried Koua
 */
public class Math {
    
    public static int  solutions(int a, int b, int c) {

        int discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            return 0;
        }
    
        // Si le discriminant est égal à 0, l'équation a une solution réelle
        if (discriminant == 0) {
            return 1;
        }
        // Si le discriminant est positif, l'équation a deux solutions réelles
        return 2;
    }

}
