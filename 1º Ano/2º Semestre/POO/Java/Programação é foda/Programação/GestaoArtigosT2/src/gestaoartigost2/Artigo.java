/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaoartigost2;

/**
 *
 * @author Quitério
 */
public class Artigo {

    public Artigo() {
        this.designacao = "";
        this.preco = 0;
        this.quantidade = 0;
    }

    
    
    public Artigo(String designacao, double preco, int quantidade) {
        this.designacao = designacao;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    private String designacao;
    private double preco;
    private int quantidade;

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Artigo{" + "designacao=" + designacao + ", preco=" + preco + ", quantidade=" + quantidade + '}';
    }
    
    
    
}
