package exercicios.Map.ProposedExercise.entities;

import java.util.Objects;

public class Candidate {

    private String name;
    private Integer votes = 0;

    public Candidate(String name, int votes) {
        this.name = name;
        addVotes(votes);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidate candidate = (Candidate) o;
        return Objects.equals(name, candidate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getVotes() {
        return votes;
    }

    public void addVotes(Integer votes) {
        this.votes += votes;
    }
}
