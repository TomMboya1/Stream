import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Tester {
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("src/file.txt"))
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("An IOException occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
