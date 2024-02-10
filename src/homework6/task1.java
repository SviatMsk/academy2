package homework6;

import java.io.*;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            try {
                File f = new File("src/homework6/example.txt");
                if (f.createNewFile()) {
                    System.out.println("File created");
                }
                else{
                    System.out.println("File already exists");
                }
            }
            catch (Exception e) {
                System.err.println(e);
            }
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            try (BufferedWriter writter = new BufferedWriter(new FileWriter("src/homework6/example.txt"))) {
                String line;
                while (!(line = reader.readLine()).equals("stop")) {
                    writter.write(line);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}