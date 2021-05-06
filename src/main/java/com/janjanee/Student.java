package com.janjanee;

public class Student {
    String name;
    boolean isFemale;
    int hak;
    int ban;
    int score;

    public Student(String name, boolean isFemale, int hak, int ban, int score) {
        this.name = name;
        this.isFemale = isFemale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public int getHak() {
        return hak;
    }

    public int getBan() {
        return ban;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", isFemale=" + isFemale +
                ", hak=" + hak +
                ", ban=" + ban +
                ", score=" + score +
                '}';
    }

    enum Level { HIGH, MID, LOW }
}


