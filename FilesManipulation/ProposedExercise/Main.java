package exercicios.FilesManipulation.ProposedExercise;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String path = "C:\\Users\\Henrique\\workspace\\JAVA BUSINESS\\exercicios\\FilesManipulation\\FIle\\text.csv";
        List<String[]> stringList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while(line != null){
                String[] lineSplit = line.split(";");
                stringList.add(lineSplit);
                line = br.readLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        for(String[] x : stringList) {
            System.out.println(Arrays.toString(x));
        }

        String newPath = "C:\\Users\\Henrique\\workspace\\JAVA BUSINESS\\exercicios\\FilesManipulation\\FIle\\textFinal.csv";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(newPath))){
            for(String[] x : stringList){
                bw.write(x[0]);
                bw.write(";");
                bw.write(String.valueOf(Double.parseDouble(x[1]) * Integer.parseInt(x[2])));
                bw.newLine();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
