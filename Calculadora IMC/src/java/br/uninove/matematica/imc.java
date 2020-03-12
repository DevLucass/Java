/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.uninove.matematica;

/**
 *
 * @author Aluno
 */
public class imc {
    
    private float peso;
    private float altura;
    private float imc;
    private String classificacao;

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return the imc
     */
    public float getImc() {
        return imc;
    }

    /**
     * @param imc the imc to set
     */
    public void setImc(float imc) {
        this.imc = imc;
    }

    /**
     * @return the classificacao
     */
    public String getClassificacao() {
        return classificacao;
    }

    /**
     * @param classificacao the classificacao to set
     */
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    
    public float calculaIMC(){
        imc = peso / (altura * altura);
        return imc;
    
    }
    
    public String montaClassificacao(){
        String classific = null;
        if(imc < 18.5){
            classific = "Abaico do peso normal!";
        }    
        else if (imc >= 18.5 && imc < 24.9){
            classific = "Peso normal!";
        }    
        else if (imc >= 25.0 && imc < 29.9){
            classific = "Excesso de peso!";
        }    
        else if (imc >= 30.0 && imc < 34.9){
            classific = "Obesidade classe 1!";
        }    
        else if (imc >= 35.0 && imc < 39.9){
            classific = "Obesidade classe 2!";
        }    
        else if(imc >= 40.0){
            classific = "Obesidade Classe 3!";
        }else{  
        }    
        
        
        
        
        
        return classific;
    
    
    
    
   } 
}
