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
public class TesteFicheiroObjecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Aluno a = new Aluno(1234, "José");
            FicheiroObjectos fo = new FicheiroObjectos();
            fo.abreEscrita("FicheiroObj.dat");
            fo.escreveObjecto(a);
            fo.fechaEscrita();
            
            Aluno aux = null;
            fo.abreLeitura("FicheiroObj.dat");
            aux = (Aluno)fo.leObjecto();
            fo.fechaLeitura();
            System.out.println("Aluno: "+aux.toString());
            
        } catch (IOException ex) {
            Logger.getLogger(TesteFicheiroObjecto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
