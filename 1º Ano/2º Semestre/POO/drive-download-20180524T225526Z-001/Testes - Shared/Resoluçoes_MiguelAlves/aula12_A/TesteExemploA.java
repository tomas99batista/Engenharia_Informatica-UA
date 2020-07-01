package aula12_A;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;

public class TesteExemploA
{
    public static String base_path = "D:/Users/Cyber/eclipse-workspace/POO/";

    // Teste Exemplo A Guião 12
    public static void main(String[] args)
    {
        TesteExemploA ap = new TesteExemploA();
        ap.alinea1();
        ap.alinea2();
    }

    public void alinea1()
    {
        Cruzeiro cruz = criarCruzeiro();
        System.out.println(cruz);
    }

    public void alinea2()
    {
        Cruzeiro cruz = criarCruzeiro();
        // a little bit hardcoded
        String file_name = cruz.getNome()
                               .replaceAll("\\W", "") + "-" + cruz.getData()
                                                                  .split("/")[2];
        try (BufferedWriter file = Files.newBufferedWriter(Paths.get(base_path + file_name + ".txt")))
        {
            double avgSale = 0;
            double avgPessoas = 0;
            int totalQuartosSuites = 0;
            Set<Cabine> cabines = cruz.getCabines();
            StringBuilder sb = new StringBuilder();
            for (Cabine s : cabines)
            {
                if (s.getOcupantes() == null || s.getOcupantes()
                                                 .size() <= 0)
                    avgSale++;
                else
                {
                    if (s instanceof Suite)
                    {
                        totalQuartosSuites += ((Suite) s).getQuartos();
                        avgPessoas += s.getOcupantes()
                                       .size();
                    }
                    sb.append(s.toString() + "\n");
                }
            }
            avgSale = cabines.size() == 0 ? 0 : avgSale / cabines.size() * 100;
            avgPessoas = totalQuartosSuites == 0 ? 0 : avgPessoas / totalQuartosSuites;
            file.write(String.format("Cabines para Venda : %1.0f%% de %d%n", avgSale, cabines.size()));
            file.write(String.format("Média de pessoas por quarto das Suites ocupadas: %1.0f~%n", avgPessoas));
            file.write(sb.toString());
            file.close();
        }
        catch (IOException e)
        {
            System.out.println("Unable to write/open " + file_name);
        }
    }

    public Cruzeiro criarCruzeiro()
    {
        String[] aux = { "Lisboa", "Barcelona", "Rodes", "Southampton" };
        Cruzeiro cr2 = new Cruzeiro("Sea Princess", aux, "22/01/2017");
        cr2.setDuracao(11);
        CabineComJanela ccj = new CabineComJanela(17, 2, TipoDeJanela.INTERIOR);
        ccj.setPassageiros(new String("Maria Luz;Manuel Luz").split(";"));
        ccj.pacoteExtra(Extra.Spa);
        cr2.add(ccj);
        cr2.add(new CabineComJanela(15, 4, TipoDeJanela.INTERIOR, new String("António Campos;Maria Campos;Marina Mota")
                                                                                                                        .split(";")));
        cr2.add(new CabineComJanela(25, 2, TipoDeJanela.INTERIOR, "Anonymous1;Anonymous2".split(";")));
        cr2.add(new CabineComJanela(4, 4, TipoDeJanela.MAR, new String(
                        "Ursula Magnusson and Matts Magnusson and Miki Rosberg and Charles Sean").split(" and ")));

        Suite suite1 = new Suite(100, 2);
        suite1.setNumQuartos(3);
        suite1.setMaxOcupantes(2 * 3);
        cr2.add(suite1);
        Suite s = new Suite(102, 6);
        s.setNumQuartos(3);
        cr2.add(s);
        s.setPassageiros(new String("A. Jolie:B. Pitt:Shiloh:Knox Leon").split(":"));

        CabineComVaranda cab = new CabineComVaranda(21, 1, TipoDeVaranda.VISTA_LIVRE);
        cab.setTipoVaranda(TipoDeVaranda.OBSTR_PARCIAL);
        cab.pacoteExtra(Extra.Desporto);

        try
        {
            cab.setPassageiros(new String("Paulo Portas;Júlia Portas").split(";"));
            cr2.add(cab);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("Não adicionado devido a excesso de ocupantes !!");
        }

        Cabine eo = new CabineComJanela(1, 4, TipoDeJanela.MAR, "Marcelo R. de Sousa".split(";"));
        cr2.add(eo);
        cr2.add(new CabineComJanela(130, 4, TipoDeJanela.MAR));
        cr2.add(new CabineComJanela(131, 4, TipoDeJanela.INTERIOR));
        return cr2;
    }
}
