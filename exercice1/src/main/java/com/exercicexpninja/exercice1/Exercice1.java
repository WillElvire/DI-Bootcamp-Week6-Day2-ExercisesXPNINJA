/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.exercicexpninja.exercice1;
import java.util.Scanner;
public class Work {
    
    public void WorkEfficiency(){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Time Taken by Worker: ");
        double timeTaken = input.nextDouble();
        // Vérification de l'efficacité du travailleur en fonction du temps qu'il a pris pour effectuer un travail
        System.out.println(this.calculeTimeTookByWorker(timeTaken)); 
     
    }

    public String calculeTimeTookByWorker(double timeTaken) {

        String message = "";

        if (timeTaken >= 2 && timeTaken <= 3) {
            
            message = "Le travailleur est très efficace";
            
        } else if (timeTaken > 3 && timeTaken <= 4) {
            
            message = "Le travailleur doit améliorer sa vitesse";
            
        } else if (timeTaken > 4 && timeTaken <= 5) {
            
            message = "Le travailleur recevra une formation pour améliorer sa vitesse";
            
        } else if (timeTaken > 5) {
            
            message = "Le travailleur doit quitter l’entreprise";
            
        } else {
            
            message = "Entrée invalide";
        }

        return message;
    }

    public static void main(String[] args) {
        new Work().WorkEfficiency();
    }
}
