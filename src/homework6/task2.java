package homework6;

import java.io.*;

public class task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader;
        //BufferedWriter bufferedWriter;
        FileWriter fileWriter;
        try {
            File f = new File("src/homework6/exampleCopyFile.txt");
            if (f.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }
            File f1 = new File("src/homework6/exampleCopy.txt");
            if (f1.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File already exists");
            }

        } catch (Exception e) {
            System.err.println(e);
        }
        try {
            FileWriter writer = new FileWriter("src/homework6/exampleCopyFile.txt");
            writer.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
            writer.close();
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл");
            e.printStackTrace();
        }
        try {
            bufferedReader = new BufferedReader(new FileReader("src/homework6/exampleCopyFile.txt"));
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        try {
           fileWriter = new FileWriter("src/homework6/exampleCopy.txt");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            line = line.replaceAll("\\s", "");
            // System.out.println(line);
           fileWriter.write(line);
        }
        bufferedReader.close();
        fileWriter.close();
        System.out.println("Файл отредактирован успешно");
    }
}







