/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo_3_Triangulo;

/**
 *
 * @author 2019013473
 */
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo(){
        
    }

    public Triangulo(double lado1, double lado2, double lado3){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        
    }
    
    @Override
    public String toString(){
        return lado1 + "," + lado2 + "," + lado3;
        
    }
    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    public double getPerimetro(){
        return this.lado1 + this.lado2 + this.lado3;
    }
    
    public String getTipo(){
        if((this.lado1 == this.lado2) && (this.lado2 == this.lado3)){
            return "Equilátero";
        }else{
            if((this.lado1 == this.lado2) || (this.lado2 == this.lado3) || (this.lado1 == this.lado3)){
                return "Isósceles";
            }else {
                 return "Escaleno";
            }       
        }
    }
}


//Triângulo equilátero
//O triângulo equilátero possui todos os lados congruentes, isto é, 
//todos os lados do triângulo possuem a mesma medida.

//Triângulo isósceles
//O triângulo isósceles possui pelo menos dois lados congruentes, 
//ou seja, possui dois lados iguais e um diferente.

//Triângulo escaleno
//O triângulo escaleno possui todos os seus lados diferentes, 
//ou seja, cada lado tem uma medida diferente.