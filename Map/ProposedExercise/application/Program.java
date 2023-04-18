package exercicios.Map.ProposedExercise.application;

import exercicios.Map.ProposedExercise.entities.Candidate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void main(String[] args) {

        String path = "C:\\Users\\Henrique\\workspace\\JAVA BUSINESS\\exercicios\\Map\\ProposedExercise\\files\\in.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            Map<Candidate, Integer> votesList = new HashMap<>();

            String line = br.readLine();
            while(line != null){
                String[] lineSplit = line.split(",");
                Candidate candidate = new Candidate(lineSplit[0], Integer.parseInt(lineSplit[1]));
                if(votesList.containsKey(candidate)){
                    for(Candidate x : votesList.keySet()){
                        if(x.equals(candidate)) {
                            x.addVotes(Integer.parseInt(lineSplit[1]));
                            votesList.put(x, x.getVotes());
                        }
                    }
                }else {
                    votesList.put(candidate, candidate.getVotes());
                }
                line = br.readLine();
            }

            for(Candidate x : votesList.keySet()){
                System.out.println("Candidate " + x.getName() + " : " + votesList.get(x));
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

}
