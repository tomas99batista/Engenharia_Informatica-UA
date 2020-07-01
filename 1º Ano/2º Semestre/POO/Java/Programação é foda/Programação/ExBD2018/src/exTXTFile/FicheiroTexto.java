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


public class FicheiroTexto {

    public FicheiroTexto(){
        fR = null;
        fW = null;
    }
    private BufferedReader fR;
    private BufferedWriter fW;

    public void abreLeitura(String nomeFicheiro)
            throws IOException {
        fR = new BufferedReader(new FileReader(nomeFicheiro));
    }
    
    public void abreEscrita(String nomeFicheiro)
            throws IOException {
        fW = new BufferedWriter(new FileWriter(nomeFicheiro));
    }

    public String lerLinha() throws IOException {
        return fR.readLine();
    }

    public void escreverLinha(String linha) throws IOException {
        fW.write(linha, 0, linha.length());
        fW.newLine();
    }
    
    public void fechaLeitura() throws IOException {
        fR.close();
    }

    public void fechaEscrita() throws IOException {
        fW.close();
    }


}

