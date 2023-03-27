package sem6;

import java.util.List;

public class Action {
    private String trickName;
    private String coach;

    public Action(String trickName, String coach) {
        this.trickName = trickName;
        this.coach = coach;
    }

    public String getTrickName() {
        return trickName;
    }

    public String getCoach() {
        return coach;
    }

    public void setCoach(String coach) {
        this.coach = coach;
    }

    @Override
    public String toString() {
        return "Action{" +
                "trickName='" + trickName + '\'' +
                ", coach='" + coach + '\'' +
                '}';
    }
}
