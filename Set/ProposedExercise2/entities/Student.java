package exercicios.Set.ProposedExercise2.entities;

import java.util.Objects;

public class Student {

    private String name;
    private int code;

    public Student(String name, int code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return code == student.code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
