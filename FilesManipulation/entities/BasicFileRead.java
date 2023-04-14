package exercicios.ArquivosWork.entities;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class BasicFileRead {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Henrique\\workspace\\JAVA BUSINESS\\exercicios\\FilesManipulation\\FIle\\in.txt");
        Scanner sc = null;
        try{
            sc = new Scanner(file);
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally {
            if(sc != null) sc.close();
        }
    }
}
