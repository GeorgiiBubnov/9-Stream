package model;

import java.util.List;

public class JsonFile {
    private String squadName;
    private String homeTown;
    private int formed;
    private String secretBase;
    private boolean active;
    private List<String> members;

    public String getSquadName() {
        return squadName;
    }


    public String getHomeTown() {
        return homeTown;
    }

    public int getFormed() {
        return formed;
    }

    public String getSecretBase() {
        return secretBase;
    }

    public boolean isActive() {
        return active;
    }

    public List<String> getMembers() {
        return members;
    }
}
