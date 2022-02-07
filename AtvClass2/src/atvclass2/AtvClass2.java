/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvclass2;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class AtvClass2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Digite o valor do quadrado:");
      double tamanhoLado = scan.nextDouble();
      quadrado lado = new quadrado();            
      lado.setLado(tamanhoLado);
      lado.getLado();
      lado.calculaarea();
     
    }
    
}
