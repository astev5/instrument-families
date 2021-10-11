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

//Begin Subclass Strings
public class Strings extends FingeredInstrument {

    /* Local Variables */
    ArrayList<String> strings = new ArrayList<>();

    /**
     * Default constructor
     */
    public Strings() {
        super();
        this.name = "chordophone";
        this.family = "string";
    }

    /**
     * Constructor for user entered data
     *
     * @param sName;
     */
    public Strings(String sName) {
        super();
        this.name = sName;
        this.family = "string";
    }

    /**
     * Method @setNames: add names to ArrayList: strings
     *
     * @param sName
     */
    protected void setNames(String sName) {
        strings.add(sName);
    }

    /**
     * Method @getNames
     *
     * @return ArrayList strings
     */
    public ArrayList getNames() {
        return strings;
    }

    /**
     * Override method from super class Instrument
     */
    @Override
    public void play() {
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);

            System.out.printf("A %s is a %s instrument and is played with "
                    + "%s.\n", s, family, playMethod);
        }
    }

} //End Subclass Strings
