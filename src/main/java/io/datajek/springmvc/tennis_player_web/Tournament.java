package io.datajek.springmvc.tennis_player_web;

public class Tournament {
    private int id;
    private String name;
    private String location;
    private int teamsCount;

    public Tournament(){}
    public Tournament(int id, String name, String location, int teamsCount){
        this.id = id;
        this.name = name;
        this.location = location;
        this.teamsCount = teamsCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTeamsCount() {
        return teamsCount;
    }

    public void setTeamsCount(int teamsCount) {
        this.teamsCount = teamsCount;
    }

    @Override
    public String toString() {
        return "Tournament{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", teamsCount=" + teamsCount +
                '}';
    }
}
