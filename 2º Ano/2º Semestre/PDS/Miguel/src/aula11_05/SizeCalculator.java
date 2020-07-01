package aula11_05;

import java.io.File;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class SizeCalculator extends SimpleFileVisitor<Path> {
    private Path          root;
    private StringBuilder sb;
    private long          totalSize;

    public SizeCalculator(Path rootPath) {
        this.root = rootPath;
        totalSize = 0;
        sb = new StringBuilder();
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        if (attrs.isRegularFile()) {
            File currentFile = file.toFile();
            totalSize += currentFile.length();
            Path parent = file.getParent();
            // construir a string dos diretorios pais
            while (parent != null && !parent.getFileName().equals(root)) {
                sb.insert(0, parent.getFileName() + " -> ");
                parent = parent.getParent();
            }
            // imprimir a string como tamanho
            System.out.printf("%s%s: %4.3f kB%n",
                              sb.toString(),
                              currentFile.getName(),
                              (double) currentFile.length() / 1000);
            // fazer reset ao string builder
            sb.setLength(0);
        }
        return FileVisitResult.CONTINUE;
    }


    public long getTotalSize() {
        return totalSize;
    }
}
