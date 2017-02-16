package model;

/**
 * Created by ckubec on 12/15/16.
 */
public class voyage implements card {
    private String name;
    private unit cost[];
    private int points;
    private int coins;

    public voyage(String theName, unit[] theCost, int thePoints, int theCoins) {
        name = theName;
        cost = theCost;
        points = thePoints;
        coins = theCoins;
    }

    public String getName() {
        return name;
    }

    public void setName(String theName) {
        name = theName;
    }

    public unit[] getCards() {
        return cost;
    }

    public int getCost() {
        return 0;
    }

    public void setCost(unit[] theCost) {
        cost = theCost;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int thePoints) {
        points = thePoints;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int theCoins) {
        coins = theCoins;
    }

    @Override
    public String toString() {
        return name + " " + cost.toString() + " " + points + " " + coins;
    }
}
