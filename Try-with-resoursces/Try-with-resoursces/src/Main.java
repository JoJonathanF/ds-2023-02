

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Forneça csv de entrada e csv de saída.");
            return;
        }

        try (
                BufferedReader reader = Files.newBufferedReader(Paths.get(args[0]));
                BufferedWriter writer = Files.newBufferedWriter(Paths.get(args[1]))
        ) {
            String result = reader.lines()
                    .map(Main::processaLinha)
                    .collect(Collectors.joining("\n"));
            writer.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String processaLinha(String linha) {
        String[] campos = linha.split(",");
        int soma = Integer.parseInt(campos[0]) + Integer.parseInt(campos[1]);
        return linha + "," + soma;
    }
}