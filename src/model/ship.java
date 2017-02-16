package model;

/**
 * Created by ckubec on 12/15/16.
 */
public class ship implements card {
    private String color;
    private String name;
    private int credits;
    private int defense;

    public ship(String theColor, String theName, int theCred, int theDef){
        color = theColor;
        name = theName;
        credits = theCred;
        defense = theDef;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return credits;
    }

    public void setCost(int credits) {
        this.credits = credits;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        return color + " " + name + " " + credits + " " + defense;
    }
}
