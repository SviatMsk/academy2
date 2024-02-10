package homework6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task4 {
    public static void main(String[] args) {

        File dirs = new File("src/homework6/txt_files");
        if (!dirs.exists()) {
            dirs.mkdir();
        }
        for (int i = 1; i <= 100; i++) {
            File file = new File( "src/homework6/txt_files" + i + ".txt");
            try (FileWriter writer = new FileWriter(file)) {
                int randomLength = new Random().nextInt(574);
                String text = getTextFromFile();
                String substring = text.substring(0, randomLength);
                writer.write(substring);
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        File resultFile = new File("src/homework6/txt_files/result.txt");
        try (FileWriter writer = new FileWriter(resultFile)) {
            for (File file : dirs.listFiles()) {
                if (file.isFile()) {
                    writer.write(file.getName() + ": " + file.length() + " bytes\n");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String getTextFromFile() {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/homework6/txt_files"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return stringBuilder.toString();
    }
}