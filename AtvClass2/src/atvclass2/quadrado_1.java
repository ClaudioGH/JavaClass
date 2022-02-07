/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvclass2;

/**
 *
 * @author aluno
 */
class quadrado {
    double tamanhoLado;
    
    public void setLado(double lado) {
        this.tamanhoLado = lado;
    }
    
    public void getLado() {
        System.out.println("O lado do quadrado é:" + this.tamanhoLado);
    }
     
    public void calculaarea() {
        double resultado = this.tamanhoLado * this.tamanhoLado;
        System.out.println("A Area do quadrado é:" + resultado);
    
    }
}

