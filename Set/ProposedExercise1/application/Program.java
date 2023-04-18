package exercicios.Set.ProposedExercise1.application;

import exercicios.Set.ProposedExercise1.entities.LoginLog;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        String file = "C:\\Users\\Henrique\\workspace\\JAVA BUSINESS\\exercicios\\Set\\ProposedExercise1\\file\\in.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(file))){
            Set<LoginLog> loginLogSet = new HashSet<>();
            String line = br.readLine();
            while (line != null){
                String[] lineSplit = line.split(" ");
                LoginLog loginLog = new LoginLog(lineSplit[0], Instant.parse(lineSplit[1]));
                loginLogSet.add(loginLog);
                line = br.readLine();
            }
            System.out.println(loginLogSet);
            System.out.println("Total users: " + loginLogSet.size());

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
