package aula11_05;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;

public class MainVisitor {

    public static void main(String[] args) {
        int minArgumentsThreshold = 1;
        String minArgumentsError =
                "Erro! O número de argumentos não pode ser menor do que"
                + minArgumentsThreshold
                + "!\n";
        int    tooManyArgumentsThreshold = 2;
        String tooManyArgumentsError     = "Erro! O número de argumentos não pode ser mais do que 2!\n";
        String usage = "Como usar:\n"
                       + "java MainVisitor <nome_diretorio>\n"
                       + "java MainVisitor -r <nome_diretorio>";

        boolean recursive     = false;
        String  directoryName = "";
        // Validações iniciais
        if (args.length < minArgumentsThreshold) {
            printErrorAndExit(minArgumentsError + usage, 1);
        }
        if (args.length > tooManyArgumentsThreshold) {
            printErrorAndExit(tooManyArgumentsError + usage, 2);
        }
        // Leitura dos argumentos
        for (String a : args) {
            if (a.equals("-r")) {
                recursive = true;
            } else {
                directoryName = a;
            }
        }
        // Validações finais
        if (args.length == 2 && !recursive) {
            printErrorAndExit(
                    "Aviso! Detetado 2 argumentos sem passagem da opção recursiva."
                    + "Apenas o último diretório será considerado",
                    3);
        }
        if (args.length == 1 && recursive) {
            printErrorAndExit("Erro! É necessário passar o nome do diretório!\n"
                              + usage, 4);
        }
        // após todas a validações, vamos então calcular
        calculateDirectorySize(directoryName, recursive);
    }

    public static void calculateDirectorySize(String directoryName, boolean recursive) {
        Path           rootPath = Paths.get(directoryName);
        SizeCalculator calc     = new SizeCalculator(rootPath);
        if (!recursive) {
            try {
                Files.walkFileTree(rootPath, new HashSet<>(), 1, calc);
            } catch (IOException e) {
                printErrorAndExit(
                        "Erro! Aconteceu algum problema ao visitar os diretórios"
                        + e.getMessage(),
                        5);
            }
        } else {
            try {
                Files.walkFileTree(rootPath, calc);
            } catch (IOException e) {
                printErrorAndExit(
                        "Erro! Aconteceu algum problema ao visitar os diretórios recursivamente"
                        + e.getMessage(),
                        6);
            }
        }
        System.out.printf("Total: %4.3f kB%n",
                          (double) calc.getTotalSize() / (double) 1000);
        System.out.println("==================================");
    }

    private static void printErrorAndExit(String errorMessage, int code) {
        System.err.println(errorMessage);
        System.exit(code);
    }

}
