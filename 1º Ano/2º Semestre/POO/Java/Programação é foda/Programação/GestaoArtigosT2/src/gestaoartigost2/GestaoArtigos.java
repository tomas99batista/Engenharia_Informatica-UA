/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestaoartigost2;

import java.util.ArrayList;

/**
 *
 * @author Quitério
 */
public class GestaoArtigos {

    public GestaoArtigos() {
        armazem = new ArrayList();
    }
    
    private ArrayList armazem;

    public ArrayList getArmazem() {
        return armazem;
    }

    public void setArmazem(ArrayList armazem) {
        this.armazem = armazem;
    }
    
    public void guardaArtigo(String designacao,
                            double preco,
                            int quantidade){
        armazem.add(new Artigo(designacao, preco, quantidade));
    }
}
