/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exTXTFile;

/**
 *
 * @author Jose
 */
import java.io.RandomAccessFile;

public class RandomFile {
   public static void main (String args[]) {
        int datarray[] = {12,31,56,23,27,1,43,65,4,99};
        try{
            RandomAccessFile rf = new RandomAccessFile("temp.dat","rw");
                // Escrever no ficheiro 
            for (int i=0;i<datarray.length;i++)
                rf.writeInt(datarray[i]);
               // Ler do ficheiro por ordem inversa
            for (int i=datarray.length-1;i>=0;i--) {
                rf.seek(i*4);  // Int * 4 bytes
                System.out.println(rf.readInt());
            }
            rf.close();
        }
        catch(java.io.IOException e)
        { System.out.println("Erro no acesso ao ficheiro!!!");}
    }
}

