package exercicios.Set.ProposedExercise1.entities;

import java.time.Instant;
import java.util.Objects;

public class LoginLog {

    private String username;
    private Instant moment;

    public LoginLog(String username, Instant moment) {
        this.username = username;
        this.moment = moment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginLog loginLog = (LoginLog) o;
        return Objects.equals(username, loginLog.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    @Override
    public String toString(){
        return getUsername();
    }
}
