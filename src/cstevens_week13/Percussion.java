package cstevens_week13;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 13 Assignment
 * @Date: August 15, 2021
 * @Description: Abstract Classes
 */

/* Imports */
import java.util.ArrayList;

//Begin Subclass Percussion
public class Percussion extends StruckInstrument {

    /* Local Variables */
    ArrayList<String> percussion = new ArrayList<>();

    /**
     * Default constructor
     */
    public Percussion() {
        super();
        this.name = "drum";
        this.family = "percussion";
    }

    /**
     * Constructor for user entered data
     *
     * @param pName;
     */
    public Percussion(String pName) {
        super();
        this.name = pName;
        this.family = "percussion";
    }

    /**
     * Method @setNames: add names to ArrayList: percussion
     *
     * @param pName
     */
    protected void setNames(String pName) {
        percussion.add(pName);
    }

    /**
     * Method @getNames
     *
     * @return ArrayList percussion
     */
    public ArrayList getNames() {
        return percussion;
    }

    /**
     * Override method from super class Instrument
     */
    @Override
    public void play() {
        for (int i = 0; i < percussion.size(); i++) {
            String p = percussion.get(i);

            System.out.printf("A %s is a %s instrument and is %s.\n",
                    p/*bName*/, family, playMethod);
        }
    }

} //End Subclass Percussion
