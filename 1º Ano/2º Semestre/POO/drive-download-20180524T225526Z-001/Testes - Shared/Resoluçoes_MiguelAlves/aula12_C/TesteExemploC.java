package aula12_C;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class TesteExemploC
{
    public static String base_path = "D:/Users/Cyber/eclipse-workspace/POO/";
    public static String file_name = "samples_s2-C.txt";

    public static void main(String[] args)
    {
        TesteExemploC ap = new TesteExemploC();
        ap.alinea1();
        ap.alinea2();
        ap.alinea3();
    }

    public void alinea1()
    {
        System.out.println("\nA1)");
        Escola ih = criarEscola();
        System.out.println(ih); // imprime todas as professores da escola
        try
        {
            PrintWriter fl = new PrintWriter(new File("output2.txt"));
            fl.println(ih);
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
        Escola ih = criarEscola();
        ih.sortLimiteCorrecao()
          .forEach(System.out::println);
    }

    public void alinea3()
    {
        System.out.println("\nA3)");
        Map<String, Integer> professores = new HashMap<>();
        try (BufferedReader file = Files.newBufferedReader(Paths.get(base_path + file_name)))
        {
            String line = null;
            String[] valores;

            // getting rid of headers
            file.readLine();
            while ((line = file.readLine()) != null)
            {
                valores = line.split("\t");

                String professor = valores[2];
                // Before Java 8
                /*
                 * if (professores.containsKey(professor))
                 * professores.put(professor, professores.get(professor) + 1);
                 * else
                 * professores.put(professor, 1);
                 */
                // Java 8+
                professores.put(professor, professores.getOrDefault(professor, 0) + 1);
            }
            StringBuilder sb = new StringBuilder();
            String base_format = "%-20s %-8s\n";
            sb.append(String.format(base_format, "Professor", "#provas"));
            for (String key : professores.keySet())
                sb.append(String.format("%-20s %-8s\n", key, professores.get(key)));
            System.out.println(sb.toString());
        }
        catch (IOException e)
        {
            System.out.println("Something went wrong " + e);
        }
    }

    public Escola criarEscola()
    {
        Escola ih = new Escola("International House Aveiro", "Rua Domingos Carrancho, 1, 3800-145 Aveiro");
        ExameEscrito e1 = new ExameEscrito("Inglês para Empresas", "Anthony Laurel", "12.06.2015 15h", "15; 22", 4); // 4
        e1.setConsulta(true);
        e1.setPrazo(6);
        ih.add(e1);
        ih.add(new ExameEscrito("Alemão", "Manfred Glesner", "12.06.2015 10h", "13"));
        TesteComputador t1 = new TesteComputador("Italiano Intermédio", "Luca Benini", "01.06.2015 10h", "25");
        t1.setLink("http://www.ihaveiro.com/outras-linguas/tii");
        ih.add(t1);
        ih.add(new ProvaOral("Inglês Avançado", "Anthony Laurel", "05.06.2015 10h", "3", Lingua.UK));
        return ih;
    }

}