package hello;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class APIBlueprintGenerator {

    public static void main(String[] args) {
        System.out.println("Hello, I'll generate a blueprint for you");

        String destinationDirectory = args[0];
        Path destinationPath = Paths.get(destinationDirectory + "/sample.apib");
        String content = "I'm a big boy";
        try {
            Files.write(destinationPath, content.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
