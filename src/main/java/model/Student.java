package model;

public class Student {

    private String name;
    private float score;

    public Student(String name, float score) {
        this.name = name;
        this.score = score;
    }

    public float getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void changeTo(String name, float score) {
        this.name = name;
        this.score = score;
    }
}
