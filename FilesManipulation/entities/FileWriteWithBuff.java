package exercicios.FilesManipulation.entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteWithBuff {

    public static void main(String[] args) {
        String path = "C:\\Users\\Henrique\\workspace\\JAVA BUSINESS\\exercicios\\FilesManipulation\\FIle\\in.txt";
        String[] listOfStrings = new String[]{
                "Vasco", "Deve subir", "With Playoff Trae"
        };

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){ // Append true para não recriar o arquivo.
            for(String x : listOfStrings){
                bw.write(x);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
