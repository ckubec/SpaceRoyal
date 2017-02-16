package model;

/**
 * Created by ckubec on 12/15/16.
 */
public class tariff implements card {
    private String myName;
    private String myDescription;


    public tariff(String theName, String theDescription) {
        myName = theName;
        myDescription = theDescription;
    }

    public int getCost(){
        return 0;
    }

    @Override
    public String toString() {
        return myName + " " + myDescription;
    }
}
