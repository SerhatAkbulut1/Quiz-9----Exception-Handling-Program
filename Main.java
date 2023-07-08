import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
    try (FileWriter writer = new FileWriter("output.txt", true)) {
        if (args.length != 1) {
            writer.write("There should be only 1 paremeter\n");
            return;
        }

        File file = new File(args[0]);
        if (!file.exists() || file.isDirectory()) {
            writer.write("There should be an input file in the specified path\n");
            return;
        }

        if (file.length() == 0) {
            writer.write("The input file should not be empty\n");
            return;
        }

        String text = "";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                text += line;
            }
            if (!text.matches("[A-Za-z ]+")) {
                writer.write("The input file should not contains unexpected characters\n");
            }else{
                writer.write(text+"\n");
            }
        } catch (IOException e) {}
        } catch (IOException e) {
        throw new RuntimeException(e);
        }
    }
}
