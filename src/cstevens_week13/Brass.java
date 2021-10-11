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

//Begin Subclass Brass
public class Brass extends BlownInstrument {

    /* Local Variables */
    ArrayList<String> brass = new ArrayList<>();

    /**
     * Default constructor
     */
    public Brass() {
        super();
        this.name = "horn";
        this.family = "brass";
    }

    /**
     * Constructor for user entered data
     *
     * @param bName;
     */
    public Brass(String bName) {
        super();
        this.name = bName;
    }

    /**
     * Method @setNames: add names to ArrayList: brass
     *
     * @param bName
     */
    protected void setNames(String bName) {
        brass.add(bName);
    }

    /**
     * Method @getNames
     *
     * @return ArrayList: brass
     */
    public ArrayList getNames() {
        return brass;
    }

    /**
     * Override method from super class Instrument
     */
    @Override
    public void play() {
        for (int i = 0; i < brass.size(); i++) {
            String b = brass.get(i);
            System.out.printf("A %s is a %s instrument and is played by %s.\n",
                    b, family, playMethod);
        }
    }

} //End Subclass Brass
