/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exTXTFile;

/**
 *
 * @author Jose
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class FicheiroObjectos {

    public FicheiroObjectos() {
        iS = null;
        oS = null;
    }
    private ObjectInputStream iS;
    private ObjectOutputStream oS;

    public boolean abreLeitura(String nomeDoFicheiro) {
        try {
            iS = new ObjectInputStream(new FileInputStream(nomeDoFicheiro));
            return true;
        } catch (IOException e) {
            return false;
        }
    }

    public void abreEscrita(String nomeDoFicheiro) throws IOException {
        oS = new ObjectOutputStream(new FileOutputStream(nomeDoFicheiro));
    }

    public Object leObjecto() throws IOException {
        Object o = null;
        try {
            o = iS.readObject();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FicheiroObjectos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return o;
    }

    public void escreveObjecto(Object o) throws IOException {
        oS.writeObject(o);
    }

    public void fechaLeitura() throws IOException {
        iS.close();
    }

    public void fechaEscrita() throws IOException {
        oS.close();
    }

}
