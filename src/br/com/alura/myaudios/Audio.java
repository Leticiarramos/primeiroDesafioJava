package br.com.alura.minhasmusicas;

public class Audio {
    private String name;
    private int totalPlays;
    private int totalLikes;
    private double classification;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalStreaming() {
        return totalPlays;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public double getClassification() {
        return classification;
    }

    public void like() {
        this.totalLikes++;
    }

    public void play() {
        this.totalPlays++;
    }
}
