/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exTXTFile;

import java.io.Serializable;

/**
 *
 * @author Jose
 */


public class Aluno implements Serializable{
 
    private static final long serialVersionUID  = 7526472295622776147L;
    
    public Aluno(){
        numero = 0;
        nome = "";
    }
    
    public Aluno(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
    }
    
    public int numero;
    public String nome;

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return numero + "\t" + nome;
    }
    
}
