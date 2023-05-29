package gr.aueb.cf.testbed.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class RowBytesCopy {

    public static void main(String[] args) {
        int b, count = 0;
        byte[] buffer = new byte[8192];
        long start, end;
        double elapsed;

        Path inputFilePath = Paths.get("C:/tmp/input1.txt");
        Path outputFilePath = Paths.get("C:/tmp/output1.txt");

        try (BufferedReader reader = Files.newBufferedReader(inputFilePath, StandardCharsets.UTF_8);
             BufferedWriter writer = Files.newBufferedWriter(outputFilePath, StandardCharsets.UTF_8)) {
            //List<String> lines = Files.readAllLines(inputFilePath, StandardCharsets.UTF_8);

            String line;

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            // Write the content to the file
            //Files.write(outputFilePath, content.getBytes(StandardCharsets.UTF_8));
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Path sourcePath = Paths.get("C:/tmp/v1.mp4");
//        Path targetPath = Paths.get("C:/tmp/v1out.mp4");
//
//        try {
//            // Read the bytes from the source image file
//            byte[] imageBytes = Files.readAllBytes(sourcePath);
//
//            // Write the bytes to the target image file
//            start = System.currentTimeMillis();
//            Files.write(targetPath, imageBytes);
//            end = System.currentTimeMillis();
//
//            elapsed = (end - start) / 1000.0;
//            System.out.println(elapsed + "secs");
//            System.out.println("Image copied successfully.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        try (FileInputStream in = new FileInputStream("C:/tmp/v1.mp4");
//             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("C:/tmp/v1out.mp4"))) {
//
//            start = System.currentTimeMillis();
//            while ((b = in.read(buffer)) != -1) {
//                out.write(buffer, 0, b);
//                count++;
//            }
//            end = System.currentTimeMillis();
//            elapsed = (end - start) / 1000.0;
//            System.out.println(elapsed + "secs");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
