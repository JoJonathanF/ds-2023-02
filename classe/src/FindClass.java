import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class FindClass {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Uso: fc <nome da classe> <dir> [-p]");
            return;
        }

        String className = args[0];
        String directoryPath = args[1];
        boolean useParallelStream = (args.length > 2 && args[2].equals("-p"));

        long startTime = System.nanoTime();

        try {
            Stream<Path> files;
            if (useParallelStream) {
                files = Files.walk(Paths.get(directoryPath)).parallel();
            } else {
                files = Files.walk(Paths.get(directoryPath));
            }

            List<String> foundLocations = new ArrayList<>();
            long classFilesCount = files
                    .filter(path -> path.toString().endsWith(".class"))
                    .filter(path -> containsClass(path, className))
                    .map(path -> {
                        String location = path.toString().substring(0, path.toString().lastIndexOf(File.separator));
                        if (!foundLocations.contains(location)) {
                            foundLocations.add(location);
                            System.out.println("Classe encontrada em: " + location);
                        }
                        return path;
                    })
                    .count();

            if (classFilesCount == 0) {
                System.out.println("Classe não encontrada.");
            } else {
                System.out.println(classFilesCount + " arquivos .class consultados.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.nanoTime();
        long durationInMillis = TimeUnit.NANOSECONDS.toMillis(endTime - startTime);
        System.out.println("Tempo gasto: " + durationInMillis + " ms");
    }

    private static boolean containsClass(Path path, String className) {
        try {
            byte[] bytes = Files.readAllBytes(path);
            String content = new String(bytes);
            return content.contains(className.replace('.', '/'));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}