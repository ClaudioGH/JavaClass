/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvclass3;

/**
 *
 * @author aluno
 */
public class Retangulo {
    double base;
    double altura;
    
    public void setladoA(double base, double altura) {
        this.base = base;
        this.altura = altura;      
    }
    public void getbase() {
        System.out.println("Digite o valor do base:");
    }
    public void getaltura() {
        System.out.println("Digite o valor da altura:");
    }
    public void area() {
        double resultado1 = this.base * this.altura;
        System.out.println("A Area é:" + resultado1);
    }
    public void perimetro() {
        double resultado2 = (this.base + this.altura)*2;
        System.out.println("o perimetro é:" + resultado2);
    }
    public void local(double local) {
        int piso = (int) (this.base * this.altura);
        int rodape = (int) ((this.base * this.altura) * 2);
    }
}
