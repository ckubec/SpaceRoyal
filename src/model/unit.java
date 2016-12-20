package model;

/**
 * Created by ckubec on 12/19/16.
 */
public class unit implements card {
    private int cost;
    private int points;
    private String name;
    private String description;

    public unit(){
        cost = 0;
        points = 0;
        name = "NOT A CARD";
        description = "DEFAULT";
    }

    public unit(int theCost, int thePoints, String theName, String theDescription) {
        cost = theCost;
        points = thePoints;
        name = theName;
        description = theDescription;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
        return cost + " " + name + " " + points +" "+ description;
    }

}
