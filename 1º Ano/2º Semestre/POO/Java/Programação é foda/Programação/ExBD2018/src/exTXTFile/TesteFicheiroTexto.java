/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exTXTFile;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jose
 */
public class TesteFicheiroTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FicheiroTexto f = new FicheiroTexto();
            f.abreEscrita("FicheiroTXT.txt");
            f.escreverLinha("aaa bbb ccc ddd");
            f.fechaEscrita();
            
            f.abreLeitura("FicheiroTXT.txt");
            System.out.println("Linha Ficheiro: "+ f.lerLinha());
            f.fechaLeitura();
            
        } catch (IOException ex) {
            Logger.getLogger(TesteFicheiroTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
