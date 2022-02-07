/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atvclass1;

/**
 *
 * @author aluno
 */
class Bola {
    String cor = "Azul";
    double circunferencia = 2.5;
    String material = "Plastico";
    
    public void trocarCor(String cor) {
        this.cor = cor;        
    }
    
    public void setcor(String cor) {
    this.cor = "azul";  
    }
    
    public void getcor(String cor) {
        System.out.println(this.cor);
    }
    
    public void getmaterial(String material) {
        System.out.println(this.material);
    }
    
    public void getcircunferencia(Double circunferencia) {
        System.out.println(this.circunferencia);
    }
    
    public void mostrarcor() {
        System.out.println(cor);
    }

    void trocarcor(String azul) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    }


