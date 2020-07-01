package aula12_D;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TesteExemploD
{

    public static String base_path = "D:/Users/Cyber/eclipse-workspace/POO/";

    public static void main(String[] args)
    {
        TesteExemploD ap = new TesteExemploD();
        ap.alinea1();
        ap.alinea2();
        ap.alinea3();
    }

    public void alinea1()
    {
        System.out.println("\nA1)");
        LojaAlimentar lZe = criarLoja();
        System.out.println(lZe); // imprime todos os produtos da loja
        try
        {
            PrintWriter fl = new PrintWriter(new File("output3.txt"));
            fl.println(lZe);
            fl.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public void alinea2()
    {
        System.out.println("\nA2)");
        LojaAlimentar lZe = criarLoja();
        Set<Refrigerado> frios = new TreeSet<>();
        System.out.println("Antes(Todos os Alimentos):");
        lZe.getAlimentos()
           .forEach(System.out::println);
        System.out.println();

        lZe.getAlimentos()
           .forEach(a ->
           {
               if (a instanceof Refrigerado)
                   frios.add((Refrigerado) a);
           });
        System.out.println("Depois(Apenas os Refrigerados e ordenados por nome):");
        frios.forEach(System.out::println);
        System.out.println();
    }

    public void alinea3()
    {
        Map<String, Integer> datas = new HashMap<>();
        try (BufferedReader file = Files.newBufferedReader(Paths.get(base_path + "alimentos-D.txt")))
        {
            String line = null;
            String[] valores;

            // getting rid of headers
            file.readLine();
            while ((line = file.readLine()) != null)
            {
                valores = line.split("\t");

                String data = valores[4];
                // Before Java 8
                /*
                 * if (datas.containsKey(data))
                 * datas.put(data, datas.get(data) + 1);
                 * else
                 * datas.put(data, 1);
                 */
                // Java 8+
                datas.put(data, datas.getOrDefault(data, 0) + 1);
            }
            StringBuilder sb = new StringBuilder();
            String base_format = "%-20s %-8s\n";
            sb.append(String.format(base_format, "data_de_validade", "#alimentos"));
            // Hue hue this is old
            /*
             * for (String key : datas.keySet())
             * sb.append(String.format("%-20s %-8s\n", key, datas.get(key)));
             */
            // Unngghh so much better
            datas.keySet()
                 .forEach(key ->
                 {
                     sb.append(String.format("%-20s %-8s\n", key, datas.get(key)));
                 });
            System.out.println(sb.toString());
        }
        catch (IOException e)
        {
            System.out.println("Something went wrong " + e);
        }
    }

    private LojaAlimentar criarLoja()
    {
        // Shameless Copypaste
        LojaAlimentar lZe = new LojaAlimentar("Loja do Zé", "Rua Domingos Carrancho, 15, 3800-145 Aveiro");
        Lacteo lact1 = new Lacteo("Iogurte Natural Danone", 1.48, 56, "07.06.2015");
        // nome, preço, calorias, validade
        lact1.setGordura(4.0);
        lact1.setTemp(4, 6); // temperaturas mínima e máxima
        lZe.add(lact1);
        lZe.add(new Lacteo("Leite UHT Meio Gordo Mimosa", 0.64, 46, "20.06.2015", 1.7));
        // o último valor é a gordura
        Cereal c1 = new Cereal("Nestlé Fitness", 1.59, 200, "15.09.2015");
        c1.setComp(TIPO_CEREAL.ARROZ_TRIGO);
        lZe.add(c1);
        lZe.add(new Refrigerante("Cola Cola", 1.12, 300, "15.09.2015"));
        return lZe;
    }

}
