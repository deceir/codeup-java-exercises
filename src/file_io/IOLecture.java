package file_io;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.file.Files.write;

public class IOLecture {
    public static void main(String[] args) throws IOException {

        String directory = "data";
        String filename = "hello.sh";

        ArrayList<String> fileContents = new ArrayList<>();

        fileContents.add("say hello polaris");

        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);


        if (Files.notExists(dataDirectory)) {
            Files.createDirectories(dataDirectory);
        }

        if (Files.notExists(dataFile)) {
            Files.createFile(dataFile);
        }

        Files.write(dataFile, fileContents);

        List<String> contentReadFromFile = Files.readAllLines(dataFile);

        for (String line : contentReadFromFile) {
            System.out.println(line);
        }


        // testing push

    }
}
