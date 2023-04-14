package exercicios.FilesManipulation.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadWithBuff {

    public static void main(String[] args) {
        String path = "C:\\Users\\Henrique\\workspace\\JAVA BUSINESS\\exercicios\\FilesManipulation\\FIle\\in.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
