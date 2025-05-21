package com.pluralsight;

public class People implements Comparable<People> {

    private String musical;
    private String directorName;
    private int yearDebuted;

    public People(String musical, String directorName, int yearDebuted) {
        this.musical = musical;
        this.directorName = directorName;
        this.yearDebuted = yearDebuted;
    }

    public String toString() {
        return musical + " " + directorName + ", debuted in " + yearDebuted;
    }

    @Override
    public int compareTo(People people) {
        return people.compareTo(people.yearDebuted);
    }
}
