package com.urlhitcounter.visit;

public class Visit {
    private String username;
    private int Hitcount;

    public Visit() {
    }

    public Visit(String username, int hitcount) {
        this.username = username;
        Hitcount = hitcount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getHitcount() {
        return Hitcount;
    }

    public void setHitcount(int hitcount) {
        Hitcount = hitcount;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "username='" + username + '\'' +
                ", Hitcount=" + Hitcount +
                '}';
    }
}
