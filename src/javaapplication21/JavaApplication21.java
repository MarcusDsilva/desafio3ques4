/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double n1, n2, n3, media;

       Scanner ler = new Scanner(System.in);

       System.out.println("informe sua Primeira nota:");
       n1 = ler.nextDouble();
       System.out.println("informe sua segunda nota:");
       n2 = ler.nextDouble();
       System.out.println("Informe sua terceira nota:");
       n3 = ler.nextDouble();

       media = (n1+n2+n3)/3;

       if (media >= 6) {
           System.out.println("Voce foi aprovado!!!"+media);
       } else{
       System.out.println("Voce foi reprovado >_>"+media);
       }
    }
}