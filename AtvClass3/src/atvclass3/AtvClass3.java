/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvclass3;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class AtvClass3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);              
      Retangulo retangulo = new Retangulo();
      System.out.println("Digite o valor da base:");
      double base = scan.nextDouble(); 
      System.out.println("Digite o valor da altura:");
      double altura = scan.nextDouble();   
      retangulo.setladoA(base, altura);
      retangulo.area();
      retangulo.perimetro();
       
    }
    
}
